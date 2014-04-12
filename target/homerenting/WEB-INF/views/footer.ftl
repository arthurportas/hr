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


<script src="<@spring.url '/static/resources/realto-html/js/html5shiv.js'/>"/>
<script src="js/html5shiv.js"></script>

<script src="<@spring.url '/static/resources/realto-html/js/custom.js'/>"/>
<script src="js/custom.js"></script>

	<!--Ajax scripts-->
	<script src="<@spring.url '/static/resources/sb-admin-v2/js/admin-left-nav.js'/>"/>
	<script src="js/admin-left-nav.js"></script>
	<script src="<@spring.url '/static/resources/sb-admin-v2/js/admin-form-new-user.js'/>"/>
	<script src="js/admin-form-new-user.js"></script>
    <!-- SB Admin Scripts - Include with every page -->
    <script src="<@spring.url '/static/resources/sb-admin-v2/js/sb-admin.js'/>"/>
    <script src="js/sb-admin.js"></script>

    <!-- jqBootstrapValidation -->
    <script src="<@spring.url '/static/resources/sb-admin-v2/js/jqBootstrapValidation.js'/>"/>
    <script src="js/jqBootstrapValidation.js"></script>
<!-- Page-Level Plugin Scripts - Tables -->
<script src="<@spring.url '/static/resources/sb-admin-v2/js/plugins/dataTables/jquery.dataTables.js'/>"/>
<script src="js/plugins/dataTables/jquery.dataTables.js"></script>

<script src="<@spring.url '/static/resources/sb-admin-v2/js/plugins/dataTables/dataTables.bootstrap.js'/>"/>
<script src="js/plugins/dataTables/dataTables.bootstrap.js"></script>
<script>
    $(document).ready(function() {
        $(function () {
            $("input,select,textarea").not("[type=submit]").jqBootstrapValidation({
                preventSubmit: true,
                submitError: function($form, event, errors) {
                    // Here I do nothing, but you could do something like display
                    // the error messages to the user, log, etc.
                },
                submitSuccess: function($form, event) {
                    alert("OK");
                    event.preventDefault();
                },
                filter: function() {
                    return $(this).is(":visible");
                }
            });
        });
    });
</script>
<!-- Page-Level Demo Scripts - Tables - Use for reference -->
<script>
    $(document).ready(function() {
        $('#dataTables-example').dataTable();
    });
</script>
</body>

</html>