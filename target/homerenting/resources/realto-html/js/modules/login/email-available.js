$('input.register-user-form-username').focusout(function(e){

    e.preventDefault();
    var emailName = $('input.register-user-form-username').val();

    if(emailName.length>3){
        $.ajax({
            type: "GET",
            url: "/user/" + emailName,
            contentType: 'text/html',
            beforeSend: function() {
            },
            success: function(jqXHR, textStatus, errorThrown) {
                $('div.register-user-form-username-alert').html(jqXHR);
                setTimeout(function(){
                    $("div.register-user-form-username-alert").fadeOut("slow", function () {
                        $("div.register-user-form-username-alert").remove();
                    });
                }, 3000);
            },
            error: function(jqXHR, textStatus, errorThrown) {
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
                    $('div.register-user-form-username-alert').html(jqXHR);
                    setTimeout(function(){
                        $("div.register-user-form-username-alert").fadeOut("slow", function () {
                            $("div.register-user-form-username-alert").remove();
                        });
                    }, 3000);
                }
            },
            complete: function(jqXHR, textStatus, errorThrown) {
            }
        });
    }
});

