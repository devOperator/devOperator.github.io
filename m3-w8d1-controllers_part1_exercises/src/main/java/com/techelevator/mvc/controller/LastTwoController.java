package com.techelevator.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.mvc.model.LastTwoConverter;


@Controller
public class LastTwoController {

	@RequestMapping ("/lastTwoInput")
	public String whereElseWouldIcallThisMethod () {
		return "lastTwoInput";
	}

	@RequestMapping("/lastTwoResult")
	public String orThisMethod (HttpServletRequest request) {
		
		String word1 = request.getParameter("word1");
		String word2 = request.getParameter("word2");
		String word3 = request.getParameter("word3");
		String word4 = request.getParameter("word4");
		String word5 = request.getParameter("word5");
		String word6 = request.getParameter("word6");
		String word7 = request.getParameter("word7");
		String word8 = request.getParameter("word8");
		String word9 = request.getParameter("word9");
		String word10 = request.getParameter("word10");
		
	
		
		LastTwoConverter ltc = new LastTwoConverter(word1, word2, word3, word4, word5, word6,
		 word7, word8, word9, word10);
		
		request.setAttribute("ltc", ltc);
		
		
		return "lastTwoResult";
	}
	
	
}
