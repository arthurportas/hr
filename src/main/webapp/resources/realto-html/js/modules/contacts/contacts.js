$('button.contacts-email').click(function(e){

    e.preventDefault();
    var name = $('.contacts-email-name').val();
    var emailFrom = $('.contacts-email-from').val();
    var message = $('.contacts-email-msg').val();

    $.ajax({
        type: "POST",
        url: "/email/one/plain",
        data: JSON.stringify({ name: name, emailFrom: emailFrom, message: message }),
        contentType: 'application/json',
        success: function(html) {
            $('div.contacts-alert').html(html);
        },
        error: function(html) {
            $('div.contacts-alert').html(html);
        }
    });
});

