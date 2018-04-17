$(document).ready(function() {
	
//   $("submit").click(function() {
//	   $(this).parent().remove();
//   });
	
	   $("#delete_button").on("submit", function(event) {
		   alert("Mesasge Removed");
		   event.preventDefault();
//		   $(this).parent().parent().remove();
		   $(this).parent().remove();

	   });
	   
});