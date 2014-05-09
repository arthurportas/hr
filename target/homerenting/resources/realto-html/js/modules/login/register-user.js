$('button.register-user-form-submit').bind("click", function(e){

    e.preventDefault();

    var email = $('input.register-user-form-username').val();
    var password = $.sha256($('input.register-user-form-password').val());
    var response = "";
        $.ajax({
            type: "PUT",
            url: "/register",
            contentType: 'application/json',
            data: JSON.stringify({ email: email, password: password}),
            beforeSend: function() {
                $('div.register-user-blockUI').block({
                    message: '<h1>Processing</h1>',
                    css: { border: '3px solid #a00' }
                });
            },
            success: function(jqXHR, textStatus, errorThrown) {
                $('div.register-user-blockUI').unblock();
                response = jqXHR;
                $('div.register-user-form-alert').html(jqXHR);

                $('input.register-user-form-username').attr("disabled", true);
                $('input.register-user-form-username').addClass("disabled");
                /*setTimeout(function(){
                    $("div.register-user-form-alert").fadeOut("slow", function () {
                        $("div.register-user-form-alert").remove();
                    });
                }, 3000);*/
            },
            error: function(jqXHR, textStatus, errorThrown) {
                response = jqXHR;
                if (jqXHR.status === 0) {
                    alert('Not connect.\n Verify Network.');
                    return;
                } else if (jqXHR.status == 404) {
                    alert('Requested page not found. [404]');
                    return;
                } else if (jqXHR.status == 500) {
                    alert('Internal Server Error [500].');
                    return;
                } else if (errorThrown === 'parsererror') {
                    alert('Requested JSON parse failed.');
                    return;
                } else if (errorThrown === 'timeout') {
                    alert('Time out error.');
                    return;
                } else if (errorThrown === 'abort') {
                    alert('Ajax request aborted.');
                    return;
                } else {
                    $('div.register-user-form-alert').html(jqXHR);
                    setTimeout(function(){
                        $("div.register-user-form-alert").fadeOut("slow", function () {
                            $("div.register-user-form-alert").remove();
                        });
                    }, 3000);
                }
            },
            complete: function(jqXHR, textStatus, errorThrown) {
                //present a message to check email
            }
        });
});

