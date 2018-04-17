package com.techelevator.mvc.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.mvc.model.FizzBuzzRevisited;

@Controller
public class FizzBuzzRevisitedController {

	@RequestMapping ("/fizzBuzzRevisitedInput")
	public String whereElseWouldIcallThisMethod () {
		return "fizzBuzzRevisitedInput";
	}

	@RequestMapping("/fizzBuzzRevisitedResult")
	public String orThisMethod (HttpServletRequest request) {
		
		String divisor1 = request.getParameter("divisableby1");
		String divisor2 = request.getParameter("divisableby2");
		String alternativefizz = request.getParameter("alternativefizz");
		String alternativebuzz = request.getParameter("alternativebuzz");
		String Number1 = request.getParameter("Number1");
		String Number2 = request.getParameter("Number2");
		String Number3 = request.getParameter("Number3");
		String Number4 = request.getParameter("Number4");
		String Number5 = request.getParameter("Number5");
		//Can view access values w/o the uncoloredName request object?
		
		FizzBuzzRevisited fbr = new FizzBuzzRevisited(divisor1, divisor2, alternativefizz, alternativebuzz, 
				Number1, Number2, Number3, Number4, Number5);
		
		request.setAttribute("fbr", fbr);		
		
		return "fizzBuzzRevisitedResult";
	}
	
	
}	

//<!-- 		<label for="divisor1" id="Divisable By: "> 
//<input type="text" name="divisableby1" id="Divisable By" />
//</label>
//<label for="divisor2" id="Divisable By: "> 
//<input type="text" name="divisableby2" id="Divisable By" />
//</label>
//<label for="alternativefizz" id="Alternative Fizz"> 
//<input type="text" name="alternativefizz" id="Alternative Fizz" />
//</label>
//<label for="alternativebuzz" id="Alternative Buzz"> 
//<input type="text" name="alternativebuzz" id="Alternative Buzz" />
//</label>
//<label for="Number1" id="Number1"> 
//<input type="text" name="Number1" id="Number 1" />
//</label>
//<label for="Number2" id="Number2"> 
//<input type="text" name="Number2" id="Number 2" />
//</label>
//<label for="Number3" id="Number3"> 
//<input type="text" name="Number3" id="Number 3" />
//</label>
//<label for="Number4" id="Number4"> 
//<input type="text" name="Number4" id="Number 4" />
//</label>
//<label for="Number5" id="Number5"> 
//<input type="text" name="Number5" id="Number 5" />
//</label>	 -->
	
	
