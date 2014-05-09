$('input.register-user-form-repeat-password').focusout(function(e){

    var password1 = $('input.register-user-form-password').val();
    var password2 = $('input.register-user-form-repeat-password').val();

    if(password1.length>3 && password2.length>3){
       if(password2 === password1){
           //fetch 18n message(pass locale navigator.navigator.language)

           $('div.register-user-form-repeat-password-alert').html("");
           setTimeout(function(){
               $("div.register-user-form-repeat-password-alert").fadeOut("slow", function () {
                   $("register-user-form-repeat-password-alert").remove();
               });
           }, 3000);
           $('button.register-user-form-submit').removeClass("disabled");
           $('button.register-user-form-submit').attr("disabled", false);
       } else {
           $('div.register-user-form-repeat-password-alert').html("");
           setTimeout(function(){
               $("div.register-user-form-repeat-password-alert").fadeOut("slow", function () {
                   $("register-user-form-repeat-password-alert").remove();
               });
           }, 3000);
       }
    };
});