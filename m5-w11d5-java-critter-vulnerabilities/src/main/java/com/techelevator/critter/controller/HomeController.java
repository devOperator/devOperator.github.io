package com.techelevator.critter.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.critter.model.MessageDAO;

@Controller
public class HomeController {
	
	private MessageDAO messageDAO;

	@Autowired
	public HomeController(MessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String showHomePage(Map<String, Object> model) {
		model.put("messages", messageDAO.getPublicMessages(10));
		return "home";
	}
	
	@RequestMapping(path="/deletemessages", method=RequestMethod.POST)
	public String deleteMessage(@RequestParam String id) {
		
		messageDAO.deletePublicMessage(id);
		
		return "redirect:/";
	}
}
