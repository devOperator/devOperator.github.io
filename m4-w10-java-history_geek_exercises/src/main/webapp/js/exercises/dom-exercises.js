/// <reference path="../jquery-3.1.1.js" />
//Locate all <div> elements and add the 'president' class.
function presentialDivs() {
	$("#presidents").children("div").addClass("president");
}

//Locate George Washington and add the 'founding-father' class
function georgeWashington() {
	$("#george-washington").addClass("founding-father");
}

//Locate all Republican presidents and add the 'red' class.
function republicanPresidents() {
	$(".Republican*").addClass("red");
}

//Locate all Democrat presidents and add the 'blue' class.
function democratPresidents() {
	$(".Democratic*").addClass("blue");

}

//Locate all Federalist presidents and add the 'gold' class.
//Question on usPresidents jsp ask to add gold to all non dem or reps
function otherPresidents() {
//	$(".Federalist*").addClass("gold");
//	$(".Democratic*").addClass("gold");
//	$("!.Republican*").addClass("gold");
//	$("[not:class^=Democratic:not:class^=Republican").addClass("gold");
////	$("div :not[class^=Republican]").addClass("gold"); //:not() a pseudo class?
//	$("div.Federalist*").addClass("gold");
	$("div").not(".Republican*, .Democratic*").addClass("gold");
	//use .not .not

}

//Locate all presidents named 'James' and add the 'james' class.
function presidentsNamedJames() {
	$("[id^=james]").addClass("james");//first/ entry div is not necessary
}

//Locate each president serving at the beginning of each century and add the 'beginningOfCentury' class.
function turnOfTheCenturyPresidents() {
	$("h2").next("div").addClass("beginningOfCentury");
}

//Locate each president serving at the end of the century and add the 'endOfCentury' class.
function endOfTheCenturyPresidents() {
	//	$("h2").prev("div").addClass("endOfCentury");
	//	$(['h2:contains("1900s")']).nextUntil("h2").addClass("endOfCentury");	
	//$(['h2:contains("1900s")']) //The [ ] does something differently than same expression without them 
	$('h2:contains("1800s")').prev("div").addClass("endOfCentury");
	$('h2:contains("1900s")').prev("div").addClass("endOfCentury");
	$('h2:contains("2000s")').prev("div").addClass("endOfCentury");
	
}

//Locate all presidents serving in the 1900s who appear on currency and add the 'appearOnCurrency' class.
function currencyPresidents() {
	$('h2:contains("1900s")').nextUntil("h2").filter(".currency").addClass("appearOnCurrency");
	//filter checks to see if any item in the list *contains that word it's the same as *=  
	
}