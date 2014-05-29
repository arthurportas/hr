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
/*
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
});*/

$('a.recover-password').click(function(e){
    e.preventDefault();
    $('li.login').removeClass('active');
    $('li.forgot-password').addClass('active');
    $('div.login').removeClass('active');
    $('div.forgot-password').addClass('active');
});

$('a.register-free').click(function(e){
    e.preventDefault();
    $('li.login').removeClass('active');
    $('li.register').addClass('active');
    $('div.login').removeClass('active');
    $('div.register').addClass('active');
});

$('a.register-panel-login').click(function(e){
    e.preventDefault();
    $('li.register').removeClass('active');
    $('li.login').addClass('active');
    $('div.register').removeClass('active');
    $('div.login').addClass('active');
});