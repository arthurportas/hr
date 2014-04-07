$('a#admin-form-new-user').bind('click', function(e) {
	e.preventDefault();
	window.console.log('a#admin-form-new-user');
	var jqXHR = $
			.ajax({
				statusCode : {
					404 : function() {
						alert("404 ERROR - page not found");
					}
				},
				url : "/homerenting/admin/home/nav/admin-form-new-user", /*servlet URL*/
				type : "GET",
				timeout : 20000
			})
			.done(function(data, textStatus, jqXHR) {
						window.console.log('done -> RESPONSE---->(data)'+ data);
						$('div#page-wrapper').html(data);
					})
			.fail(function(jqXHR, textStatus, errorThrown) {
						window.console.log('fail -> RESPONSE---->['+ textStatus + ']');
					})
			.always(function(data, textStatus, jqXHR) {
						 //alert(data);
					});
});

$('a#admin-list-users').bind('click', function(e) {
    e.preventDefault();
    window.console.log('a#admin-list-users');
    var jqXHR = $
        .ajax({
            statusCode : {
                404 : function() {
                    alert("404 ERROR - page not found");
                }
            },
            url : "/homerenting/admin/home/nav/admin-list-users", /*servlet URL*/
            type : "GET",
            timeout : 20000
        })
        .done(function(data, textStatus, jqXHR) {
            window.console.log('done -> RESPONSE---->(data)'+ data);
            $('div#page-wrapper').html(data);
        })
        .fail(function(jqXHR, textStatus, errorThrown) {
            window.console.log('fail -> RESPONSE---->['+ textStatus + ']');
        })
        .always(function(data, textStatus, jqXHR) {
            //alert(data);
        });
});