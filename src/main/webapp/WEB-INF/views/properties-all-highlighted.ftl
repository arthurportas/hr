<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>
<#include "modules/header/header.ftl">
<div class="container page-content">
    <div class="row">
        <div class="span8">
            <div class="row">
                <#list properties as p>
                    <@renderPropertyItem p />
                </#list>
            </div>
            <!-- .row -->
        </div>
        <!-- .span8 -->
        <#--<div class="span4">
            <div class="search-form widget">
                <p>Find your new home</p>
                <form action="#" class="row-fluid" method="post">
                    <select class="span12 select" name="type">
                        <option>Location</option>
                        <option value="#">New York</option>
                        <option value="#">Los Angeles</option>
                        <option value="#">Washington</option>
                        <option value="#">Chicago</option>
                        <option value="#">Miami</option>
                    </select>
                    <select class="span12 select" name="type">
                        <option>Property Type</option>
                        <option value="#">Any</option>
                        <option value="#">Single Family Home</option>
                        <option value="#">Condo</option>
                        <option value="#">Apartment</option>
                        <option value="#">Loft</option>
                    </select>
                    <select class="span6 select pull-left" name="beds">
                        <option>Beds</option>
                        <option value="#">1+ Beds</option>
                        <option value="#">2+ Beds</option>
                        <option value="#">3+ Beds</option>
                        <option value="#">4+ Beds</option>
                        <option value="#">5+ Beds</option>
                    </select>
                    <select class="span6 select pull-right" name="baths">
                        <option>Baths</option>
                        <option value="#">1+ Baths</option>
                        <option value="#">2+ Baths</option>
                        <option value="#">3+ Baths</option>
                        <option value="#">4+ Baths</option>
                        <option value="#">5+ Baths</option>
                    </select>
                    <select class="span12 select clearfix" name="status">
                        <option>Select Status</option>
                        <option value="#">For Rent</option>
                        <option value="#">For Sale</option>
                    </select>
                    <select class="span6 select pull-left" name="price-from">
                        <option>Price from</option>
                        <option value="#">from $100.000</option>
                        <option value="#">from $200.000</option>
                        <option value="#">from $300.000</option>
                        <option value="#">from $400.000</option>
                        <option value="#">from $500.000</option>
                    </select>
                    <select class="span6 select pull-right" name="price-to">
                        <option>Price to</option>
                        <option value="#">to $100.000</option>
                        <option value="#">to $200.000</option>
                        <option value="#">to $300.000</option>
                        <option value="#">to $400.000</option>
                        <option value="#">to $500.000</option>
                    </select>
                    <div class="clearfix">
                        <button class="btn pull-right span6 btn-realto-form btn-large" type="submit">Search</button>
                    </div>
                </form>
            </div>
            <!-- .search-form &ndash;&gt;
            <div class="info-box widget">
                <h3 class="info-head">Designed for your business</h3>
                <div class="row clearfix">
                    <div class="pull-left icons hidden-phone">
                        <i class="icon-briefcase"></i>
                    </div>
                    <div class="span3">
                        <p>Lorem ipsum dolor sit amet consectetur incididunt ut labore et dolore
                            magna aliqua adipisicing elit seddo eiusmod tempor.</p>
                        <a class="serif italic" href="#" title="Continue">Continue &raquo;</a>
                    </div>
                </div>
                <!-- .clearfix &ndash;&gt;
            </div>
            <!-- .info-box &ndash;&gt;
            <div class="info-box widget">
                <h3 class="info-head">Ample Customizations</h3>
                <div class="row clearfix">
                    <div class="pull-left icons hidden-phone">
                        <i class="icon-cogs"></i>
                    </div>
                    <div class="span3">
                        <p>Lorem ipsum dolor sit amet consectetur incididunt ut labore et dolore
                            magna aliqua adipisicing elit seddo eiusmod tempor.</p>
                        <a class="serif italic" href="#" title="Continue">Continue &raquo;</a>
                    </div>
                </div>
                <!-- .clearfix &ndash;&gt;
            </div>
            <!-- .info-box &ndash;&gt;
            <div class="info-box widget">
                <h3 class="info-head">Fully Responsive</h3>
                <div class="row clearfix">
                    <div class="pull-left icons hidden-phone">
                        <i class="icon-move"></i>
                    </div>
                    <div class="span3">
                        <p>Lorem ipsum dolor sit amet consectetur incididunt ut labore et dolore
                            magna aliqua adipisicing elit seddo eiusmod tempor.</p>
                        <a class="serif italic" href="#" title="Continue">Continue &raquo;</a>
                    </div>
                </div>
                <!-- .clearfix &ndash;&gt;
            </div>
            <!-- .info-box &ndash;&gt;
            <div class="info-box widget">
                <h3 class="info-head">Bootstrap Compatible</h3>
                <div class="row clearfix">
                    <div class="pull-left icons hidden-phone">
                        <i class="icon-thumbs-up"></i>
                    </div>
                    <div class="span3">
                        <p>Lorem ipsum dolor sit amet consectetur incididunt ut labore et dolore
                            magna aliqua adipisicing elit seddo eiusmod tempor.</p>
                        <a class="serif italic" href="#" title="Continue">Continue &raquo;</a>
                    </div>
                </div>
                <!-- .clearfix &ndash;&gt;
            </div>
            <!-- .info-box &ndash;&gt;
            <div class="home-blog-articles widget">
                <h2 class="secion-title">Articles from the Blog</h2>
                <ul>
                    <li>
                        <i class="icon-caret-right"></i>
                        <a title="title" href="#">Lorem ipsum dolor sit amet, consectetur
                            adipiscing</a></li>
                    <li>
                        <i class="icon-caret-right"></i>
                        <a title="title" href="#">Duis suscipit venenatis pellentesque tempor
                            libero</a></li>
                    <li>
                        <i class="icon-caret-right"></i>
                        <a title="title" href="#">Etiam aliquet aliquam metus in tristique</a></li>
                    <li>
                        <i class="icon-caret-right"></i>
                        <a title="title" href="#">Cras venenatis pellentesque venenatis
                            pellentesque</a></li>
                    <li>
                        <i class="icon-caret-right"></i>
                        <a title="title" href="#">Vivamus vitae venenatis pellentesque nunc sed
                            nisl</a></li>
                    <li>
                        <i class="icon-caret-right"></i>
                        <a title="title" href="#">In tempus venenatis pellentesquetempor</a></li>
                    <li>
                        <i class="icon-caret-right"></i>
                        <a title="title" href="#">Suspendisse vulputate venenatis pellentesque
                            quis</a></li>
                </ul>
            </div>
        </div>-->
        <!-- .span4 -->
    </div>
    <!-- .row -->
</div>
<!-- .container -->
<#include "modules/footer/footer.ftl">
<#include "footer.ftl">

<#macro renderPropertyItem p>
<li class="span4 box-container">
    <div class="holder">
        <a class="overlay" title="${p.propertyTitle}" href="/property/${p.propertyId?c}">
            <span class="more"></span>
            <#if ((p.images?size > 0) && (p.images[0].cloudinaryHighlightImageUrl??))>
                <img alt="image" src="${p.images[0].cloudinaryHighlightImageUrl}" class="media-object" />
            <#else>
                <img alt="image" src="http://placehold.it/370x210" class="media-object" />
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
                    <span class="qty pull-right">
                        ${p.propertyRegion.regionName?cap_first}
                    </span>
                </li>
                <li class="info-label clearfix">
                    <span class="pull-left">
                        ${p.propertyPrice?string.number}&euro;
                    </span><#-- <span class="qty pull-right">2</span>-->
                </li>
                <li class="info-label clearfix">
                    <span class="pull-left">
                        <@renderFBLikeBtn p />
                    </span>
                </li>
            </ul>
        </div>
    </div>
</li>
</#macro>

<#macro renderFBLikeBtn p><#--TODO:should be https procurarcasa.pt, 240px width of mobile-->
<div class="fb-like"
     data-href="https://procurarcasa.pt/property/${p.propertyId?c}"
     data-layout="button_count"
     data-action="like"
     data-show-faces="true"
     data-share="true"
     data-width="240px">
</div>
</#macro>