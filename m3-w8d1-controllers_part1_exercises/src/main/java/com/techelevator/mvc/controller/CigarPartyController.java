package com.techelevator.mvc.controller;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CigarPartyController {

	@RequestMapping ("/cigarPartyInput")
	public String whereElseWouldIcallThisMethod () {
		return "cigarPartyInput";
	}

	@RequestMapping("/cigarPartyResult")
	public String orThisMethod (HttpServletRequest request) {
		
		String weekendChoice1 = request.getParameter("yesweekend");
		String weekendChoice2 = request.getParameter("noweekend");

		int numberOfSquirrels = Integer.parseInt(request.getParameter("squirrelcount"));
		
		
//		request.setAttribute("ltc", ltc);
		
		
		return "cigarPartyResult";
	}
	
	
}