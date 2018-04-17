/* $(document).ready(function () {
	
    var socket = new SockJS("ws-connect"); //parameter needs to match what it's in the xml file for Spring
    var connection = Stomp.over(socket);
    
    //Socks JS provides cross browser support for websockets
    
    //creating the callbacks for 1. failure and 2. success
    var errorCallback = function(error) {
    		console.log(error);
    }
    
    var successCallback = function(frame) { //the frame is the current connection information
    		console.log("Connected: " + frame);
    		//here we will subscribe to the available topics
    		connection.subscribe('/topic/members', function(members) {
    			refreshMemberList(members);
    		});
    		
    		connection.subscribe('/topic/chat', function(message){
    			addToChatWindow(message);
    		});
    }
    
    connection.connect({}, successCallback, errorCallback);
    
    
    $('form#chatForm').on('submit', function(e){
    		var chat = $("textarea[name='message']").val();
    		connection.send("/app/chat", {}, JSON.stringify({'message' : chat}));
    		$("textarea[name='message']").val("");
    });
	
});


function refreshMemberList(message) { //JSON will generally hold the message, by looking
	//at the api we know it will return a list of strings
	var members = JSON.parse(message.body);
//	for(i = 0; i < members.length; i++){

	var socket = new SockJS("ws-connect");
	var connection = Stomp.over(socket);
	
	var errorCallback = function(error) {
		console.log(error);
	}
	
	var successCallback = function(frame) {
		console.log("Connected: " + frame);
		connection.subscribe('/topic/members', function(members) {
			refreshMemberList(members);
		});
		connection.subscribe('/topic/chat', function(message) {
			addToChatWindow(message);
		});
	}
	
	connection.connect({}, successCallback, errorCallback);
	
	$('form#chatForm').on('submit', function(e) {
		var chat = $("textarea[name='message']").val();
		connection.send("/app/chat", {}, JSON.stringify({'message' : chat}));
		$("textarea[name='message']").val("");
	});
	
});
	

function addToChatWindow(message){
	var chat = JSON.parse(message.body);
	
	var time = new Date(
			chat.sentDate.year,
			chat.sentDate.monthValue,
			chat.sentDate.dayOfMonth,
			chat.sentDate.hour,
			chat.sentDate.minute,
			chat.sentDate.second
			).toLocaleTimeString([], { hour: '2-digit', minute: '2-digit' });
	
	var userspan = $("<span>").addClass("username").text(chat.userName + " ");
	var p = $("<p>").addClass("message");
	var messagespan = $("<span>").text(chat.message);
	p.append(userspan).append(timespan).append($("<br>")).append(messagespan); //need to fix it
	
	//	p.append(userspan).append(messagespan);

	
	$("#history").append(p);
}

*/




//=======
//function addToChatWindow(message) {
//	var chat = JSON.parse(message.body);
//	
//	var time = new Date(
//	           chat.sentDate.year,
//	           chat.sentDate.monthValue,
//	           chat.sentDate.dayOfMonth,
//	           chat.sentDate.hour,
//	           chat.sentDate.minute,
//	           chat.sentDate.second
//	   ).toLocaleTimeString([], { hour: '2-digit', minute: '2-digit' });
//
//	
//	var p = $("<p>").addClass("message");
//	var userspan = $("<span>").addClass("username").text(chat.userName + " ");
//	var timespan = $("<span>").addClass("time").text(time);
//	var messagespan = $("<span>").text(chat.message);
//	p.append(userspan).append(timespan).append($("<br>")).append(messagespan);
//	$("#history").append(p);
//}
//>>>>>>> 899dd87ac2d88ef3198916e16f1164e1d24aca2f
