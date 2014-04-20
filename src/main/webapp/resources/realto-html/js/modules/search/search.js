$('select.districts').change(function(){

    var districtID = $('select.districts').val();
    var el = $('select.regions');
    var jqxhr = $.ajax({
        type: "GET",
        url: "/district/" + districtID
    })
        .done(function(html) {
            alert( "success" );
            el.empty().append(html);
        })
        .fail(function(html) {
            alert( "error" );
        })
        .always(function(html) {
            alert( "complete-" + html );
        });
});