<div id="latest-properties">
    <div class="container">
        <div class="row">
            <div class="span12">
                <h2 class="secion-title">
                    <@spring.messageText "HIGHLITED.PROPERTIES", "Imóveis em Destaque"/>
                </h2>
            </div>
        </div>

        <!-- Begin Carousel -->
        <div class="row">
            <div id="realto-carousel" class="carousel slide span12">
                <div class="carousel-navigation pull-right">
                    <a class="serif italic pull-left view-all-carousel" href="#"><@spring.messageText "VIEW.ALL", "Ver todos"/></a>
                    <a class="left carousel-control pull-left" href="#realto-carousel" data-slide="prev">&lt;</a>
                    <a class="right carousel-control pull-right" href="#realto-carousel" data-slide="next">&gt;</a>
                </div>

                <div class="carousel-inner carousel-container">
                    <#--each page on desktop presents an <ul with three childs-->
                    <@renderActiveHighlightedProperties />
                    <@renderHighlightedProperties />
                </div><!-- .carousel-inner -->
            </div>
        </div><!--End Carousel-->
    </div><!-- .container  -->
</div><!-- #latest-properties  -->
<!-- #latest-properties  -->

<#macro renderActiveHighlightedProperties>
    <div class="item active">
        <ul class="thumbnails">
            <#list highlightedProperties as p>
                <@renderPropertiItem p />
            </#list>
        </ul>
    </div><!-- .item -->
</#macro>

<#macro renderHighlightedProperties>
    <#list remaingHighlightedProperties as p>
        <#if ((p_index == 0) || (p_index % 3 == 0))>
            <div class="item">
                <ul class="thumbnails ${p_index}">
        </#if>
            <@renderPropertiItem p />
        <#if ((p_index != 0) && (p_index % 2 == 0))>
                </ul>
            </div><!-- .item -->
        </#if>
    </#list>
</#macro>

<#macro renderPropertiItem p>
    <li class="span4 box-container">
        <div class="holder">
            <a class="overlay" title="${p.propertyTitle}" href="/property/${p.propertyId?c}">
                <span class="more"></span>
                <#if (p.images?size > 0) >
                    <img alt="image" src="${p.images[0].cloudinaryHighlightImageUrl}" class="media-object" />
                <#else>
                    <img alt="image" src="http://placehold.it/800x454" class="media-object" />
                </#if>
            <#--<img alt="image" src="<@spring.url '/static/resources/realto-html/images/04.jpg'/>" class="media-object" />-->
            </a>
            <span class="prop-tag">
                <@spring.messageText "FOR.${p.businessType?upper_case}", "${p.businessType?cap_first}"/>
            </span>
            <div class="prop-info">
                <h3 class="prop-title">${p.propertyTitle}</h3>
                <ul class="more-info clearfix">
                    <li class="info-label clearfix">
                        <span class="pull-left"></span>
                    ${p.tipology!""}
                    ${p.vilageTipology!""}
                        <@spring.messageText "IN", "em"/>
                        <span class="qty pull-right">${p.propertyRegion.regionName?cap_first}</span>
                    </li>
                    <li class="info-label clearfix">
                        <span class="pull-left">${p.propertyPrice?string.number}&euro;</span><#-- <span class="qty pull-right">2</span>-->
                    </li>
                </ul>
            </div>
        </div>
    </li>
</#macro>
