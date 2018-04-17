/// <reference path="../jquery-3.1.1.js" />
$(document).ready(function () {
  
	$("#shipping-info").click( function(event){ //currently works just on click tbd work on blur
	
		console.log("made it here");
//		$("#shipping-info").click( function(event){

		
//		var url = "http://localhost:8080/m4-java-historygeek-exercises/api/getTax?billingZipCode=?8&subtotal=?"
		
//		var url = "/api/getTax?billingZipCode=?&subtotal=?"
		
//		$("#ShippingState").val($("#BillingState").val());
		
//		var url = "http://localhost:8080/m4-java-historygeek-exercises/api/getTax?billingZipCode=432208&subtotal=10.00"

//		var url = "api/getTax/";
		
		var url = "http://localhost:8080/m4-java-historygeek-exercises/api/getTax?billingZipCode="
			      +$("#BillingPostalCode").val()+"&subtotal="
			      +$("#subtotal .price").text().substring(1,$("#subtotal .price").text().length);
	
			
		$.ajax({
			data: { billingZipCode: $("#BillingPostalCode").val(), 
				  subtotal: $("#subtotal .price").text().substring(1,$("#subtotal .price").text().length)}, //other way to do it
			url: url,
			type: "GET",
			dataType: "json"
		}).done(function(data){
						
////			$("#tax .price").text("$" + Math.round(parseFloat(data) * 100) / 100); //populate the summary with the total tax coming from ajax method call
//			$("#tax .price").text("$" + data); //populate the summary with the total tax coming from ajax method call
			$("#tax .price").text("$" + data); //populate the summary with the total tax coming from ajax method call
//			$("#ShippingPostalCode").val($("#BillingPostalCode").val());

			
		}).fail(function (xhr, status, error){
			console.log(error);
		});
		
//		data: {
//			billingZipCode: 
//			subtotal:
//		}

});
	
})
	