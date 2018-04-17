package com.techelevator.mvc.controller;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.techelevator.mvc.model.LottoTicket;

@Controller
public class BabyLottoController {

	@RequestMapping ("/babyLottoInput")
	public String whereElseWouldIcallThisMethod () { //this method could be called during web testing
		return "babyLottoInput";
	}

	@RequestMapping("/babyLottoResult")
	public String orThisMethod (HttpServletRequest request) { //this method could be called during web testing
		List<LottoTicket> ticketList = new ArrayList<LottoTicket>();
		String[] ticketNumberArr = new String[5];
		LottoTicket ticket;

		
		for(Integer i = 1; i < 6; i++) {
			ticket = new LottoTicket();
			ticketNumberArr = request.getParameter("ticket"+i.toString()).split("[,]");
			ticket.setNumber1(Long.parseLong(ticketNumberArr[0]));
			ticket.setNumber2(Long.parseLong(ticketNumberArr[1]));
			ticket.setNumber3(Long.parseLong(ticketNumberArr[2]));
			ticketList.add(ticket);
		}
			
		request.setAttribute("ticketList", ticketList);		

		return "babyLottoResult";
	}
		
}	