


/*brief description*/
var text_max = 46;
$('#property-description-feedback').html(text_max);

$('textarea.property-description').keyup(function(e){
    e.preventDefault();
    var textLength = $('textarea.property-description').val().length;
    var textRemaining = text_max - textLength;
    var txt = $('textarea.property-description').val();
    $('h3.announce-preview-prop-title').html(txt);
    $('#property-description-feedback').html(textRemaining);
});

$('input.property-price').keyup(function(e){
    e.preventDefault();
    var txt = $('input.property-price').val();
    $('span.announce-preview-price').html(txt);
});
