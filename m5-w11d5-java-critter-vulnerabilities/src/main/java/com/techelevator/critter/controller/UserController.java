package com.techelevator.critter.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.bouncycastle.util.encoders.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.critter.model.MessageDAO;
import com.techelevator.critter.model.UserDAO;
import com.techelevator.security.PasswordHasher;

@Controller
public class UserController {

	private UserDAO userDAO;
	private MessageDAO messageDAO;
	private int remainingAttempts = 3;

	@Autowired
	public UserController(UserDAO userDAO, MessageDAO messageDAO) {
		this.userDAO = userDAO;
		this.messageDAO = messageDAO;
	}

	@RequestMapping(path="/users/new", method=RequestMethod.GET)
	public String displayNewUserForm() {
		return "newUser";
	}
	
	@RequestMapping(path="/users", method=RequestMethod.POST)
	public String createUser(@RequestParam String userName, @RequestParam String password) {
		// userDAO.saveUser(userName, password); //original commented out, now saving the password and hashed salt
		//password now referring to the salted hash
		//still writing password as defined as required in db
		
		PasswordHasher ph = new PasswordHasher();
		
		// Get a Random Salt
		byte[] salt = ph.generateRandomSalt();
		
		// Encode the Salt using Base64 so we can store it in the database
		String saltString = new String(Base64.encode(salt));
		
		// Create a hash from the password and the salt
		String hash = ph.computeHash(password, salt);  
		
		// Save the username, hash, and salt to the database 
		userDAO.saveUser(userName, hash, saltString);
		
		return "redirect:/login";
	}
	
	@RequestMapping(path="/users/{userName}", method=RequestMethod.GET)
	public String displayDashboard(Map<String, Object> model, @PathVariable String userName) {
		model.put("conversations", messageDAO.getConversationsForUser(userName));
		return "userDashboard";
	}
	
	@RequestMapping(path="/users/{forUserName}/conversations/{withUserName}", method=RequestMethod.GET)
	public String displayConversation(Map<String, Object> model, @PathVariable String forUserName, @PathVariable String withUserName) {
		model.put("conversation", messageDAO.getConversation(forUserName, withUserName));
		return "conversation";
	}
	
	@RequestMapping(path="/users/{userName}/messages", method=RequestMethod.GET)
	public String displaySentMessages(Map<String, Object> model, @PathVariable String userName) {
		model.put("messages", messageDAO.getMessagesSentByUser(userName));		
		return "sentMessages";
	}
	
	@RequestMapping(path="/users/{userName}/changePassword", method=RequestMethod.GET)
	public String displayChangePasswordForm(Map<String, Object> model, @PathVariable String userName) {		
		model.put("userName", userName);
		return "changePassword";
	}
	
	@RequestMapping(path="/users/{userName}/changePassword", method=RequestMethod.POST)
	public String changePassword(HttpServletRequest request, @PathVariable String userName, @RequestParam String oldpassword,
			@RequestParam String password) {
		String errorMessage = null;
		if(!userDAO.searchForUsernameAndPassword(userName, oldpassword) && remainingAttempts > 0) {
			remainingAttempts--;
			errorMessage = "Current password does not match records.";
			request.setAttribute("errorMessage", errorMessage);
			
			if(remainingAttempts == 0){
				remainingAttempts = 3;
				return "failedPasswordChange";
			}
			
			request.setAttribute("remainingAttempts", remainingAttempts);
			
			return "changePassword";
		}

		
		
		userDAO.updatePassword(userName, password);
		return "userDashboard";
	}
}
