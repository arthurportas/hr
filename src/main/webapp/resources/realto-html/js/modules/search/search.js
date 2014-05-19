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
            //alert( "complete-" + html );
        });
});

$('select.regions').change(function(){

    //se distrito selecionado, query por distrito e regiao selecionada, senao apenas regiao
    var districtID = $('select.districts').val(),
        regionID = $('select.regions').val(),
        endpoint;

    if(districtID!=null) {
        endpoint = "/properties/" + districtID + "/region/" + regionID;
    } else {
        endpoint = "/properties/region/" + regionID
    }

    var el = $('.instant-results');

    var jqxhr = $.ajax({
        type: "GET",
        url: endpoint
    })
        .done(function(html) {
            el.empty().append(html);
        })
        .fail(function(html) {
            alert( "error" );
        })
        .always(function(html) {
            //alert( "complete-" + html );
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