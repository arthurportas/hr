<#import "spring.ftl" as spring />
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

    <#--<script src="<@spring.url '/static/resources/realto-html/js/modules/login/login.js'/>"/>
    <script src="js/login.js"></script>-->

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
    </body>

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

</html>