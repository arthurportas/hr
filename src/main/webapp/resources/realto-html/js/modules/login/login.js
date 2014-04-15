/*$('input.login-email').change(function(){
    var email = $('input.login-email').val();

    /*var jqxhr = $.ajax({
        type: "POST",
        url: "/login",
        data: {
            email: "arthurportas@gmail.com",
            password: "123456"
        }
    })
        .done(function(html) {
            alert( "success" );
        })
        .fail(function(html) {
            alert( "error" );
        })
        .always(function(html) {
            alert( "complete" );
        });
});*/

$('button.login').click(function(){

    var email = $('input.login-email').val();
    var password = $.sha256($('input.login-password').val());

    var jqxhr = $.ajax({
        type: "POST",
        url: "/login",
        data: {
            email: email,
            password: password
        }
    })
        .done(function(html) {
            alert( "success" );
        })
        .fail(function(html) {
            alert( "error" );
        })
        .always(function(html) {
            alert( "complete" );
        });
});