package com.techelevator;


import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller
public class SquirrelPartyController {
	ReviewDao reviewdDao;

	@Autowired
	SquirrelPartyController(ReviewDao reviewDao){	//will data source be null at this point?
		this.reviewdDao = reviewDao;
	}

	@RequestMapping (path = "/homePage", method=RequestMethod.GET)
	public String whereElseWouldIcallThisMethod (HttpServletRequest request) {

			request.setAttribute("reviewsList", reviewdDao.getAllReviews());
		
		return "homePage";
	}

	@RequestMapping(path = "/reviewInput", method = RequestMethod.GET ) //dflts to get, is POST needed to avoid passing the username?
//	public String displayReviewInputPage (HttpServletRequest request) {
	public String displayReviewInputPage () {			
		return "reviewInput";
	}
	
	@RequestMapping(path = "/reviewInput", method = RequestMethod.POST ) //dflts to get, is POST needed to avoid passing the username?
	public String processReview (@RequestParam String username, @RequestParam String title, @RequestParam 
			String text, @RequestParam String rating) {
	
		Review review = new Review();
		review.setRating(Integer.parseInt(rating));
		review.setTitle(title);
		review.setText(text);
		review.setUsername(username);
		LocalDateTime ld = LocalDateTime.now();
		review.setDateSubmitted(ld);
		
		reviewdDao.save(review);
	
		return "redirect:/homePage";
	}
	
//	@RequestMapping("/reviewResult") //dflts to get, is POST needed to avoid passing the username?
//	public String sendUserToHomePageAfterReview (HttpServletRequest request) {
//		
//		String firstName = request.getParameter("firstName");
//		String lastName = request.getParameter("lastName");
//		String red = request.getParameter("red");
//		String blue = request.getParameter("blue");
//		String green = request.getParameter("green");
//		NameColorizer uncoloredName = new NameColorizer (firstName, lastName, red, blue, green);
//		request.setAttribute("uncoloredName", uncoloredName);
//		
//		return "redirect:/homePage";
//		return "homePage"; //is "redirect" needed here?, if jsp for
//	}
//	
	
}
