<#import "spring.ftl" as spring />
    <div id="fb-root"></div>
    <script>(function(d, s, id) {
            var js, fjs = d.getElementsByTagName(s)[0];
            if (d.getElementById(id)) return;
            js = d.createElement(s); js.id = id;
            js.src = "//connect.facebook.net/pt_PT/sdk.js#xfbml=1&appId=1481163645452025&version=v2.0";
            fjs.parentNode.insertBefore(js, fjs);
        }(document, 'script', 'facebook-jssdk'));
    </script>

    <!-- Core Scripts - Include with every page -->
    <script src="<@spring.url '/static/resources/realto-html/js/jquery.js'/>"/>
    <script src="js/jquery.js"></script>
   
    <script src="<@spring.url '/static/resources/realto-html/js/bootstrap.min.js'/>"/>
    <script src="js/bootstrap.min.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/js/jquery.placeholder.js'/>"/>
    <script src="js/jquery.placeholder.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/js/jquery.cycle2.min.js'/>"/>
    <script src="js/jquery.cycle2.min.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/theme-panel/theme-panel.js'/>"/>
    <script src="js/theme-panel.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/js/html5shiv.js'/>"/>
    <script src="js/html5shiv.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/js/custom.js'/>"/>
    <script src="js/custom.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/js/modules/login/login.js'/>"/>
    <script src="js/login.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/js/modules/login/sha256.jquery.debug.js'/>"/>
    <script src="js/sha256.jquery.debug.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/js/modules/search/search.js'/>"/>
    <script src="js/search.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/js/modules/contacts/contacts.js'/>"/>
    <script src="js/contacts.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/js/jquery.blockUI.js'/>"/>
    <script src="js/jquery.blockUI.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/js/modules/announces/bwizard.js'/>"/>
    <script src="js/bwizard.js"></script>

    <script type="text/javascript">
        $("#wizard").bwizard();
    </script>



    <script src="<@spring.url '/static/resources/realto-html/js/modules/announces/jquery.ui.widget.js'/>"/>
    <script src="js/jquery.ui.widget.js"></script>

    <#--<script src="<@spring.url '/static/resources/realto-html/js/modules/announces/jquery.iframe-transport.js'/>"/>
    <script src="js/jquery.iframe-transport.js"></script>-->

    <script src="<@spring.url '/static/resources/realto-html/js/modules/announces/jquery.fileupload.js'/>"/>
    <script src="js/jquery.fileupload.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/js/modules/announces/jquery.cloudinary.js'/>"/>
    <script src="js/jquery.cloudinary.js"></script>

    <script type="text/javascript">
        $.cloudinary.config({"api_key": "681112152891473","cloud_name": "homerenting"});
    </script>

    <script src="<@spring.url '/static/resources/realto-html/js/modules/login/tabs-addon.js'/>"/>
    <script src="js/tabs-addon.js"></script>

    <script type="text/javascript">
        $(document).ready(function(){
            $("a.recover-password").tooltip();
            $("a.register-panel-login").tooltip();
            $("a.terms-and-conditions").tooltip();
            $("a.register-free").tooltip();
            $('button.register-user-form-submit').attr("disabled", true);
        });
    </script>

    <script src="<@spring.url '/static/resources/realto-html/js/modules/login/email-available.js'/>"/>
        <script src="js/email-available.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/js/modules/login/passwords-match.js'/>"/>
    <script src="js/passwords-match.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/js/modules/login/register-user.js'/>"/>
    <script src="js/register-user.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/js/modules/search/geo-location.js'/>"/>
    <script src="js/geo-location.js"></script>

    <script src="http://www.google.com/recaptcha/api/js/recaptcha_ajax.js"></script>

    <script src="<@spring.url '/static/resources/realto-html/js/modules/login/facebook.js'/>"/>
    <script src="js/facebook.js"></script>
    </body>
</html>