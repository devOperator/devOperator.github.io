package com.techelevator.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.mvc.model.NameColorizer;

@Controller
public class NameColorizerController {

	@RequestMapping ("/colorizedNameInput")
	public String whereElseWouldIcallThisMethod () {
		return "colorizedNameInput";
	}

	@RequestMapping("/colorizedResult")
	public String orThisMethod (HttpServletRequest request) {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String red = request.getParameter("red");
		String blue = request.getParameter("blue");
		String green = request.getParameter("green");
		//Can view access values w/o the uncoloredName request object?
		NameColorizer uncoloredName = new NameColorizer (firstName, lastName, red, blue, green);
		request.setAttribute("uncoloredName", uncoloredName);
		
		
		return "colorizedResult";
	}
	
	
}
