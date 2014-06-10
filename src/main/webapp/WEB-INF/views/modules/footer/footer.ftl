<!-- begin footer -->
<footer>
    <div class="container">
        <div class="row">
            <@renderCompanyMOTD />
            <@renderCompanyContacts />
            <@renderSiteMap/>
            <@renderFlickrHighlights/>
        </div>
    </div>
</footer>

<#macro renderCompanyMOTD>
    <div class="span3">
        <div class="footer-widget">
            <h2 class="brand widget-title">ProcurarCasa.pt</h2>
            <p class="footer-tag-line"><@spring.messageText "FOOTER.TAG.LINE", "Anúncie o seu imóvel"/></p>
            <p><#if motd?has_content>
                ${motd.motd}
            </#if></p>
        </div>
        <!-- .footer-company-info -->
    </div>
    <!-- .span3 -->
</#macro>

<#macro renderCompanyContacts>
    <div class="span3">
        <div class="footer-widget">
            <h3 class="widget-title"><@spring.messageText "ADDRESS", "Endereço"/></h3>
            <div class="clearfix">
                <ul>
                    <li class="clearfix">
                        <i class="icon-map-marker pull-left"></i>
                        <p class="pull-left">1680 Washington Avenue
                            <br/>Miami Beach 33139 FL</p></li>
                    <li class="clearfix">
                        <i class="icon-phone pull-left"></i>
                        <p class="pull-left">+1 (800) 765 4321</p></li>
                    <li class="clearfix">
                        <i class="icon-envelope-alt pull-left"></i>
                        <p class="pull-left"><a href="#">realto@realto.com</a></p>
                    </li>
                </ul>
            </div>
            <!-- .clearfix -->
        </div>
        <!-- .footer-widget -->
    </div>
    <!-- .span3 -->
</#macro>

<#macro renderSiteMap>
    <div class="span3">
        <div class="footer-widget">
            <h3 class="widget-title"><@spring.messageText "COMPANY", "Empresa"/></h3></h3>
            <ul>
                <li>
                    <i class="icon-caret-right"></i>
                    <a title="Home" href="#">Home</a></li>
                <li>
                    <i class="icon-caret-right"></i>
                    <a title="About Us" href="#">About Us</a></li>
                <li>
                    <i class="icon-caret-right"></i>
                    <a title="Properties" href="#">Properties</a></li>
                <li>
                    <i class="icon-caret-right"></i>
                    <a title="Agents" href="#">Agents</a></li>
                <li>
                    <i class="icon-caret-right"></i>
                    <a title="Blog" href="#">Blog</a></li>
                <li>
                    <i class="icon-caret-right"></i>
                    <a title="Financing" href="#">Financing</a></li>
                <li>
                    <i class="icon-caret-right"></i>
                    <a title="Contact Us" href="#">Contact Us</a></li>
            </ul>
        </div>
        <!-- .footer-widget -->
    </div>
    <!-- .span3 -->
</#macro>

<#macro renderFlickrHighlights>
    <div class="span3">
        <div class="footer-widget">
            <h3 class="widget-title">Flickr</h3>
            <div class="flickr-widget">
                <ul>
                    <li class="pull-left">
                        <a title="image" href="#">
                            <img alt="" class="media-object" src="<@spring.url '/static/resources/realto-html/images/flickr-01.jpg'/>"/>
                        </a>
                    </li>
                    <li class="pull-left">
                        <a title="image" href="#">
                            <img alt="" class="media-object" src="<@spring.url '/static/resources/realto-html/images/flickr-02.jpg'/>"/>
                        </a>
                    </li>
                    <li class="pull-left">
                        <a title="image" href="#">
                            <img alt="" class="media-object" src="<@spring.url '/static/resources/realto-html/images/flickr-03.jpg'/>"/>
                        </a>
                    </li>
                    <li class="pull-left">
                        <a title="image" href="#">
                            <img alt="" class="media-object" src="<@spring.url '/static/resources/realto-html/images/flickr-04.jpg'/>"/>
                        </a>
                    </li>
                    <li class="pull-left">
                        <a title="image" href="#">
                        <#--<img alt="" class="media-object" src="<@spring.url '/static/resources/realto-html/images/flickr-05.jpg'/>"/>-->
                            <img alt="" class="media-object" src="http://res.cloudinary.com/homerenting/image/upload/v1398720691/flickr-05_r40hki.jpg" />
                        </a>
                    </li>
                    <li class="pull-left">
                        <a title="image" href="#">
                        <#--<img alt="" class="media-object" src="<@spring.url '/static/resources/realto-html/images/flickr-06.jpg'/>"/>-->
                            <img alt="" class="media-object" src="http://res.cloudinary.com/homerenting/image/upload/v1398720690/flickr-06_ifrj9o.jpg" />
                        </a>
                    </li>
                </ul>
            </div>
            <!-- .flickr-widget -->
        </div>
        <!-- .footer-widget -->
    </div>
    <!-- .span3 -->
</#macro>