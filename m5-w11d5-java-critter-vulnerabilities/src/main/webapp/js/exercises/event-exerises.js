/// <reference path="../jquery-3.1.1.js" />

$(document).ready(function () {
	$("#SameShipping").click( function(event){

			$("#ShippingAddress1").val($("#BillingAddress1").val());
			$("#ShippingAddress2").val($("#BillingAddress2").val());
			$("#ShippingState").val($("#BillingState").val());
			$("#ShippingCity").val($("#BillingCity").val());
			$("#ShippingPostalCode").val($("#BillingPostalCode").val());
			

		return true;
	});
	
	$("#shipping-info").click( function(event){ //this is triggered when anything in that area, even the text is clicked
												//should only activate for the buttons being selected
												//must put "$" in quotes and use + to add the sign as text
												//would need to add a if condition for
												//	if ($('[name="test"]').is(':checked')), where name is the name of radio

		
			console.log("A radio button has been selected");
			var shippingPrice = parseFloat($('[name="ShippingType"]:checked').attr("data-cost"));
			$("#shipping .price").text("$" + Math.round(shippingPrice * 100) / 100); //populate the summary with shipping price
			
			var priceBeforeShipping = parseFloat($("#subtotal .price").text().substring(1, $("#subtotal .price").text().length));
			var grandTotal = shippingPrice + priceBeforeShipping;//calculate the grandtotal
			$("#grandtotal .price").text("$" + Math.round(grandTotal * 100) / 100); //populate the summary with grandtotal
				
		return true;
	});
	
	
	document.onkeydown = checkKey; //what is happening here? var normally on left side, 
									//answer ,this is setting the document.onkeydown attribute equal to the checkKey object
	var xPos = 0;
	var yPos = 0;
	
	function checkKey(event){
		var event = window.event ? window.event : e; //?
		console.log(event.keyCode);
		

		if(event.keyCode == '38'){ //UP
			if((yPos - 1) >= 0){
				$("#row_"+yPos+"_column_"+xPos).removeClass('ship');
				yPos = yPos - 1;			
			}
		}else if(event.keyCode == '40'){ //DOWN
			if((yPos + 1) <= 9){
				$("#row_"+yPos+"_column_"+xPos).removeClass('ship');
				yPos = yPos + 1;
			}	
		}else if(event.keyCode == '37'){ //LEFT
			if((xPos - 1) >= 0){
				$("#row_"+yPos+"_column_"+xPos).removeClass('ship');
				xPos = xPos - 1;
			}
		}else if(event.keyCode == '39'){ //RIGHT
			if((xPos + 1) <= 9){
				$("#row_"+yPos+"_column_"+xPos).removeClass('ship');
				xPos = xPos + 1;
			}
		}		
		
		if($("#row_"+yPos+"_column_"+xPos).hasClass('treasure')){

			$("#game h2").addClass('gamewin');
			$(".ship").removeClass("ship");
			$("#row_0_column_0").addClass("ship");
			xPos = 0;
			yPos = 0;
			
		}
				
		else if($("#row_"+yPos+"_column_"+xPos).hasClass('iceberg')){
			$("#game h2").addClass('gameover');
			$(".ship").removeClass("ship");
			$("#row_0_column_0").addClass("ship");
			xPos = 0;
			yPos = 0;
		}else if($("#row_"+yPos+"_column_"+xPos).hasClass('pirate')){
			$("#game h2").addClass('gameover');
			$(".ship").removeClass("ship");
			$("#row_0_column_0").addClass("ship");
			xPos = 0;
			yPos = 0;
		}else if($("#row_"+yPos+"_column_"+xPos).hasClass('gamecell') &&
				!$("#row_"+yPos+"_column_"+xPos).hasClass('pirate') &&
				!$("#row_"+yPos+"_column_"+xPos).hasClass('iceberg')){				
				$("#row_"+yPos+"_column_"+xPos).addClass("ship");			
		}

		
	}
	
	
	
	$("#btnRestart").click( function(event){
		$("#game h2").removeClass('gamewin');
		$("#game h2").removeClass('gameover');

		$(".ship").removeClass("ship");
		$("#row_0_column_0").addClass("ship");
		xPos = 0;
		yPos = 0;
		return true;
	});
	
	

})


