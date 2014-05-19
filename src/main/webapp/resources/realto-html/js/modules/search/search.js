$('select.districts').change(function(){

    var districtID = $('select.districts').val();
    var el = $('select.regions');
    var jqxhr = $.ajax({
        type: "GET",
        url: "/district/" + districtID
    })
        .done(function(html) {
            el.empty().append(html);
        })
        .fail(function(html) {
            alert( "error" );
        })
        .always(function(html) {
            alert( "complete-" + html );
        });
});

$('select.regions').change(function(){

    var districtID = $('select.districts').val();

    var el = $('.instant-results');

    var jqxhr = $.ajax({
        type: "GET",
        url: "/properties/district/" + districtID
    })
        .done(function(html) {
            el.empty().append(html);
        })
        .fail(function(html) {
            alert( "error" );
        })
        .always(function(html) {
            alert( "complete-" + html );
        });
});
/*$('select.business-kind').change(function(){

    var districtID = $('select.districts').val();

    var el = $('.instant-results');

    var jqxhr = $.ajax({
        type: "GET",
        url: "/properties/district/" + districtID
    })
        .done(function(html) {
            el.empty().append(html);
        })
        .fail(function(html) {
            alert( "error" );
        })
        .always(function(html) {
            alert( "complete-" + html );
        });
});*/