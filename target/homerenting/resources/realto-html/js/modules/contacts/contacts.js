$('button.contacts-email').click(function(e){

    e.preventDefault();
    var emailName = $('.contacts-email-name').val();
    var emailFrom = $('.contacts-email-from').val();
    var emailMessage = $('.contacts-email-msg').val();

    $.ajax({
        type: "POST",
        url: "/email/one/plain",
        data: JSON.stringify({ emailName: emailName, emailFrom: emailFrom, emailMessage: emailMessage }),
        contentType: 'application/json',
        beforeSend: function() {
            $('div.contacts-blockUI').block({
                message: '<h1>Processing</h1>',
                css: { border: '3px solid #a00' }
            });
        },
        success: function(html) {
            $('div.contacts-blockUI').unblock();
            $('div.contacts-alert').html(html);
            setTimeout(function(){
                $("div.contacts-alert").fadeOut("slow", function () {
                    $("div.contacts-alert").remove();
                });

            }, 3000);
        },
        error: function(html) {
            $('div.contacts-blockUI').unblock();
            $('div.contacts-alert').html(html);
            setTimeout(function(){
                $("div.contacts-alert").fadeOut("slow", function () {
                    $("div.contacts-alert").remove();
                });
            }, 3000);
        },
        complete: function() {
        }
    });
});

