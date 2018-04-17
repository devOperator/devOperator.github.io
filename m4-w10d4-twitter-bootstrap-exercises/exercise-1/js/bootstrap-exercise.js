/// <reference path="../jquery-3.1.1.js" />
/// <reference path="../jquery.validate.js" />

$(document).ready(function () {
	
	
	$("blockquote").addClass('carousel-caption');

	$("th h2").each(function() {
		   $(this).text($(this).text().toUpperCase());
	})

});


