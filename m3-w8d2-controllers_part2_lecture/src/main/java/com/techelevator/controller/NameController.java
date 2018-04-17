package com.techelevator.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.model.PersonName;

@Controller
public class NameController {

	@RequestMapping("/nameCollector")
	public String displayNameCollector() {
		
		return "nameCollector";
	}
	
	@RequestMapping(path="/nameCollectorResult", method=RequestMethod.GET)
	public String displayNameCollectorResult(HttpServletRequest request, Model model) {
		
//		if (model.containsAttribute("personName")) {
//			PersonName personName = (PersonName) model.asMap().get("personName");
//		}
		
//		String firstName = request.getParameter("firstName");
//		String lastName = request.getParameter("lastName");
//		
//		request.setAttribute("firstName", firstName);
//		request.setAttribute("lastName", lastName);
		request.setAttribute("method", "GET");
//		return "nameCollectorResult";
		return "nameCollector";
		
	}
	
	@RequestMapping(path="/nameCollectorResult", method=RequestMethod.POST)
	public String displayNameCollectorResultPost( 
			PersonName personName, ModelMap model, HttpServletRequest request,
			RedirectAttributes redirectAttr) {
//		request.setAttribute("firstName", personName.getFirstName());
//		request.setAttribute("lastName", personName.getLastName());
//		model.addAttribute("personName", personName);
		redirectAttr.addFlashAttribute("personName", personName);
		
		model.addAttribute("method", "POST");
		return "redirect:/nameCollectorResult";
		
	}
	
	
//	@RequestMapping(path="/nameCollectorResult", method=RequestMethod.POST)
////	public String displayNameCollectorResultPost(HttpServletRequest request, 
////			@RequestParam(required=false, name="fName") String firstName, @RequestParam String lastName) {
//	public String displayNameCollectorResultPost( 
//			PersonName personName, ModelMap model) {
////		String firstName = request.getParameter("firstName");
////		String lastName = request.getParameter("lastName");
//		
////		request.setAttribute("firstName", personName.getFirstName());
////		request.setAttribute("lastName", personName.getLastName());
//		
//		model.addAttribute("personName", personName);
//		model.addAttribute("method", "POST");
//		//request.setAttribute("method", "POST");
//		return "nameCollectorResult";
//		
//	}
	
//	@RequestMapping(path="/nameCollectorResultFinal", method=RequestMethod.POST)
//	public String displayNameCollectorResultPostFinal( 
//			PersonName personName, ModelMap model) {
//
//		model.addAttribute("personName", personName);
//		model.addAttribute("method", "POST");
//		return "nameCollectorResult";
//		
//	}
	
}
