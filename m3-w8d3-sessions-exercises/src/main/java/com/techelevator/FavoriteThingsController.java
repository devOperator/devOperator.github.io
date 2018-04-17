package com.techelevator;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.SessionAttributes;

//Code will not acknowledge session.setAttribute methods until @SessionAttributes is added to the beginning of the name of the map
//Need to create another map? Can't use the modelMap? 
//Need to get the value from the map, why would I need to get values from map instead of just adding whole updated map into the session, 
//then put that value into the answerMap


@SessionAttributes("answerMap")
@Controller
//@SessionAttributes({"answer1", "answer2", "answer3"})
public class FavoriteThingsController {
	
	
	
	@RequestMapping(path = "/Page1", method = RequestMethod.GET)
	public String showPage1InputPage() {
		return "Page1";
	}

	@RequestMapping(path = "/Page1", method = RequestMethod.POST)
	public String processPage1InputSubmission(HttpSession session, ModelMap map, @RequestParam String answer1) 
			throws FileNotFoundException, IOException {
			
		Answers answers = new Answers();
		answers.setAnswer1(answer1);
		map.addAttribute("answerMap", answers);
		
		return "redirect:/Page2";
	}

	@RequestMapping(path="/Page2", method=RequestMethod.GET)
	public String showPage2InputPage(HttpServletRequest request) {
		return "Page2";
	}
	
	@RequestMapping(path = "/Page2", method = RequestMethod.POST)
	public String processPage2InputSubmission(HttpSession session, ModelMap map, @RequestParam String answer2) 
			throws FileNotFoundException, IOException {
		
		Answers answers = (Answers)map.get("answerMap");
		answers.setAnswer2(answer2);
		map.addAttribute("answerMap",answers);
		
		return "redirect:/Page3";
	}
	
	@RequestMapping(path="/Page3", method=RequestMethod.GET)
	public String showPage3InputPage(HttpServletRequest request) {

		return "Page3";
	}
	
	@RequestMapping(path = "/Page3", method = RequestMethod.POST)
	public String processPage3InputSubmission(HttpSession session, ModelMap map, @RequestParam String answer3) 
			throws FileNotFoundException, IOException {
	
		Answers answers = (Answers)map.get("answerMap");
		answers.setAnswer3(answer3);
		map.addAttribute("answerMap",answers);
	
		
			
		return "redirect:/Summary";
	}
	
	@RequestMapping(path="/Summary", method=RequestMethod.GET)
	public String showAlienForumOutputPage(ModelMap map, HttpSession session /*ModelMap map,  HttpServletRequest request*/) {
		
//		session.invalidate();
//		map.clear();
		
		return "Summary";
	}
	//Why are the things being passed in the URL if the form methods and methods here are set to POST?
	//Because they were being weren't being added to the session due to no @Session annotation

}

