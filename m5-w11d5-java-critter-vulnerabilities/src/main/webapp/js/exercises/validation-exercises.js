/// <reference path="../jquery-3.1.1.js" />
/// <reference path="../jquery.validate.js" />

$(document).ready(function () {
	
	
	$("#form0").validate({
	
//		debug: true,
		rules: {
	    // Email address - required
			email:{
				email:true,
				governmentonly: true
			},
		    // Email address - .gov only (BONUS)
		    // Password - required, length 8 or more
			password: {
				required: true,
				minlength: 6	
			},
		    
			confirmPassword: { // ConfirmPassword
				equalTo: "#password"
			}
		},
		messages: {
			email:{
				required: "Must provide an email address"
			}
		},
		errorClass: "error",
		validClass: "valid"
	});
	

//		<input id="NameOnCard" name="NameOnCard" placeholder="name on card" type="text" value="" />
//		<input id="CreditCardNumber" name="CreditCardNumber" placeholder="credit card" type="text" value="" />
//		<input id="ExpirationDate" name="ExpirationDate" placeholder="mm/yy" type="text" value="" />
//	
	//items to validate for checkout above 
	$("#checkout").validate({
		
//		debug: true,
		rules: {
			
			CreditCardNumber: {
				minlength: 16,
				required: true,
				validCC: true
			},
			
			ExpirationDate: {
				required: true,
				unexpiredcard: true
			}
			
		},
		messages: {
			CreditCardNumber:{
				required: "Must provide a credit card number",
				validCC: "Must provide valid credit card number"
			},
//			
//			ExpirationDate: {
//				required: "Must provide an unexpired credit card "
//			}
			
		},
		errorClass: "error",
		validClass: "valid"
	});
	
	
});



$.validator.addMethod("governmentonly", function (value, index) {
	return value.toLowerCase().endsWith(".gov");
}, "Please enter a .gov email");
//
//$.validator.addMethod("unexpiredcard", function (value, index) {
//	return value.match("/[1-12][/][18-28]/");
//}, "This card is expired, please use a different card");

$.validator.addMethod("validCC", function (value, index){ //checking luhn sum
	if(value.length > 19){
		return (false);	
	}
	
	sum = 0; mul = 1; l = value.length;
	for(i = 0; i < l; i++){
		digit = value.substring(l-i-1,l-i);
		tproduct = parseInt(digit, 10) * mul;
		if(tproduct >= 10){
			sum += (tproduct % 10) + 1;
		}else{
			sum += tproduct;
		}
		if(mul == 1){
			mul++;
		}else{
			mul--;
		}
		if ((sum % 10) == 0){
			return(true);
		}else{
			return(false);
		}
	}

}, "Must enter a valid credit card number");









