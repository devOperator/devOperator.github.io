package com.techelevator.mvc.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.mvc.model.OrderedResultConverter;


@Controller
public class OrderedNameController {
	
	@RequestMapping ("/orderedNameInput")
	public String showAlienWeightCalculatorInputPage () {
		return "orderedNameInput";
	}
	
	@RequestMapping("/orderedResult")
	public String showAlienWeightCalculatorOutputPage (HttpServletRequest request) {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String middleInitial = request.getParameter("MI");
		String orderChoice = request.getParameter("radios");
	
		OrderedResultConverter name = new OrderedResultConverter (firstName, lastName, middleInitial, orderChoice);
		request.setAttribute("name", name);
		
		
		return "orderedResult";
	}
	
	
	

}