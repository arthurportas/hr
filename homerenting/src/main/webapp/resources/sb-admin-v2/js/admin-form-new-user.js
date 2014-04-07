$('#submit-admin-form-new-user').bind('click', function(e) {
	e.preventDefault();
	var FORM = "form#admin-form-new-user";
	
	var firstName = $('form#admin-form-new-user input#inputFirstName').val();
	
	window.console.log("firstName->" + firstName);
	
	var jqXHR = $
			.ajax({
				statusCode : {
					404 : function() {
						alert("404 ERROR - page not found");
					}
				},
				url : "/homerenting/addUser", /*servlet URL*/
				type : "GET",
				timeout : 20000
			})
			.done(function(data, textStatus, jqXHR) {
						window.console.log('done -> RESPONSE---->(data)' + data);
						$('div#page-wrapper').html(data);
					})
			.fail(function(jqXHR, textStatus, errorThrown) {
						window.console.log('fail -> RESPONSE---->['+ textStatus + ']');
					})
			.always(function(data, textStatus, jqXHR) {
						 //alert(data);
					});
});

