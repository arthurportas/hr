<div class="alert alert-success">
    <a href="#" class="close" data-dismiss="alert">&times;</a>
    <strong>Success!</strong> Your message has been sent successfully.
</div>
<p>
    ${imageApi.getStringConfig("cloud_name")}
    ${imageApi.getStringConfig("api_key")}
    ${imageApi.getStringConfig("api_secret")}
</p>
<input name="file" type="file" id="uploadinput"
       class="cloudinary-fileupload" data-cloudinary-field="image_upload"
       data-form-data="" >
</input>
<script>
var data = { "timestamp":  "timestamp",
"callback": "/static/resources/realto-html/js/modules/announces/html/cloudinary_cors.html",
"signature": "${imageApi.getStringConfig("api_secret")}",
"api_key": "${imageApi.getStringConfig("api_key")}" };
$('#uploadinput').attr('data-form-data', JSON.stringify(data));
</script>