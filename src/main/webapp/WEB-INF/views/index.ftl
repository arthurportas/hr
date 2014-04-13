<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>

<#include "modules/header/header.ftl">

<!-- theme panel -->
<div id="themes_panel">
    <div id="themes_menu">
        <div class="segment">
            <h6>Theme Colour</h6>
            <ul class="theme buttons">
                <li>
                    <a href="#" title="green">
                        <img alt="" src="<@spring.url '/static/resources/realto-html/theme-panel/buttons/theme_green.jpg'/>"/>
                    </a>
                </li>
                <li>
                    <a href="#" title="purple">
                        <img alt="" src="<@spring.url '/static/resources/realto-html/theme-panel/buttons/theme_purple.jpg'/>"/>
                    </a>
                </li>
                <li>
                    <a href="#" title="pink">
                        <img alt="" src="<@spring.url '/static/resources/realto-html/theme-panel/buttons/theme_pink.jpg'/>"/>
                    </a>
                </li>
                <li>
                    <a href="#" title="blue">
                        <img alt="" src="<@spring.url '/static/resources/realto-html/theme-panel/buttons/theme_blue.jpg'/>"/>
                    </a>
                </li>
                <li>
                    <a href="#" title="orange">
                        <img alt="" src="<@spring.url '/static/resources/realto-html/theme-panel/buttons/theme_orange.jpg'/>"/>
                    </a>
                </li>
                <li>
                    <a href="#" title="red">
                        <img alt="" src="<@spring.url '/static/resources/realto-html/theme-panel/buttons/theme_red.jpg'/>"/>
                    </a>
                </li>
            </ul>
        </div>
        <div class="segment noborder">
            <a class="reset_btn" href="#">Reset</a>
        </div>
    </div>
    <div id="toggle_button">
        <a href="#"></a>
    </div>
</div>






<div id="home-search-container">
    <div class="container">
        <div class="row">
            <div class="span12">
                <div class="widget pull-right">
                    <div class="row">
                        <div class="span12 head-container">
                            <div class="row">
                                <div class="span8 hidden-phone">
                                    <h2 class="head-title">Welcome to Realto</h2>
                                    <p class="head-message"><strong>Realto xHTML/CSS Template is The Best Solution To Sell House Online.</strong><br />
                                        This template is appropriate for Real Estate Company, who need to do their business online via websites.</p>
                                    <a class="btn btn-large btn-realto span3 header-cta" href="#" title="Buy It Now">Buy It Now!</a>
                                </div>
                                <div class="span4">
                                    <div class="search-form">
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
                                    <!-- .search-form -->
                                </div>
                                <!-- .span4 -->
                            </div>
                        </div>
                    </div>
                    <!-- .row -->
                </div>
                <!-- .search-holder -->
            </div>
            <!-- .span12 -->
        </div>
        <!-- .row -->
    </div>
    <!-- .container -->
</div>



<div id="latest-properties">
    <div class="container">
        <div class="row">
            <div class="span12">
                <h2 class="secion-title">Properties</h2>
            </div>
        </div>


        <!-- Begin Carousel -->
        <div class="row">
            <div id="realto-carousel" class="carousel slide span12">
                <div class="carousel-navigation pull-right">
                    <a class="serif italic pull-left view-all-carousel" href="#">View all</a>
                    <a class="left carousel-control pull-left" href="#realto-carousel" data-slide="prev">‹</a>
                    <a class="right carousel-control pull-right" href="#realto-carousel" data-slide="next">›</a>
                </div>
                <div class="carousel-inner">
                    <div class="item active">
                        <ul class="thumbnails">
                            <li class="span4 box-container">
                                <div class="holder">
                                    <a class="overlay" title="property title" href="#">
                                        <span class="more"></span>
                                        <img alt="image" src="<@spring.url '/static/resources/realto-html/images/01.jpg'/>" class="media-object" />
                                    </a>
                                    <span class="prop-tag">For Sale</span>
                                    <div class="prop-info">
                                        <h3 class="prop-title">379 Michigan Avenue New York 33139 NY</h3>
                                        <ul class="more-info clearfix">
                                            <li class="info-label clearfix"><span class="pull-left">Beds:</span> <span class="qty pull-right">4</span></li>
                                            <li class="info-label clearfix"><span class="pull-left">Baths:</span> <span class="qty pull-right">2</span></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li class="span4 box-container">
                                <div class="holder">
                                    <a class="overlay" title="property title" href="#">
                                        <span class="more"></span>
                                        <img alt="image" src="<@spring.url '/static/resources/realto-html/images/02.jpg'/>" class="media-object">
                                    </a>
                                    <span class="prop-tag">For Rent</span>
                                    <div class="prop-info">
                                        <h3 class="prop-title">8745 Annox Avenue Orlando 33139 FL</h3>
                                        <ul class="more-info clearfix">
                                            <li class="info-label clearfix"><span class="pull-left">Beds:</span> <span class="qty pull-right">4</span></li>
                                            <li class="info-label clearfix"><span class="pull-left">Baths:</span> <span class="qty pull-right">2</span></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li class="span4 box-container">
                                <div class="holder">
                                    <a class="overlay" title="property title" href="#">
                                        <span class="more"></span>
                                        <img alt="image" src="<@spring.url '/static/resources/realto-html/images/03.jpg'/>" class="media-object">
                                    </a>
                                    <span class="prop-tag">For Sale</span>
                                    <div class="prop-info">
                                        <h3 class="prop-title">1630 Washington Avenue Miami Beach 33139 FL</h3>
                                        <ul class="more-info clearfix">
                                            <li class="info-label clearfix"><span class="pull-left">Beds:</span> <span class="qty pull-right">4</span></li>
                                            <li class="info-label clearfix"><span class="pull-left">Baths:</span> <span class="qty pull-right">2</span></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div><!-- .item -->
                    <div class="item">
                        <ul class="thumbnails">
                            <li class="span4 box-container">
                                <div class="holder">
                                    <a class="overlay" title="property title" href="#">
                                        <span class="more"></span>
                                        <img alt="image" src="images/04.jpg" class="media-object">
                                    </a>
                                    <span class="prop-tag">For Rent</span>
                                    <div class="prop-info">
                                        <h3 class="prop-title">1290 Collins Avenue Miami Beach 33139 FL</h3>
                                        <ul class="more-info clearfix">
                                            <li class="info-label clearfix"><span class="pull-left">Beds:</span> <span class="qty pull-right">4</span></li>
                                            <li class="info-label clearfix"><span class="pull-left">Baths:</span> <span class="qty pull-right">2</span></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li class="span4 box-container">
                                <div class="holder">
                                    <a class="overlay" title="property title" href="#">
                                        <span class="more"></span>
                                        <img alt="image" src="<@spring.url '/static/resources/realto-html/images/06.jpg'/>" class="media-object"/>
                                    </a>
                                    <span class="prop-tag">For Sale</span>
                                    <div class="prop-info">
                                        <h3 class="prop-title">6253 Jefferson Avenue Los Angeles 33139 CA</h3>
                                        <ul class="more-info clearfix">
                                            <li class="info-label clearfix"><span class="pull-left">Beds:</span> <span class="qty pull-right">4</span></li>
                                            <li class="info-label clearfix"><span class="pull-left">Baths:</span> <span class="qty pull-right">2</span></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li class="span4 box-container">
                                <div class="holder">
                                    <a class="overlay" title="property title" href="#">
                                        <span class="more"></span>
                                        <img alt="image" src="<@spring.url '/static/resources/realto-html/images/07.jpg'/>" class="media-object">
                                    </a>
                                    <span class="prop-tag">For Rent</span>
                                    <div class="prop-info">
                                        <h3 class="prop-title">7654 West Avenue Miami Beach 33139 FL</h3>
                                        <ul class="more-info clearfix">
                                            <li class="info-label clearfix"><span class="pull-left">Beds:</span> <span class="qty pull-right">4</span></li>
                                            <li class="info-label clearfix"><span class="pull-left">Baths:</span> <span class="qty pull-right">2</span></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div><!-- .item -->

                </div><!-- .carousel-inner -->
            </div>
        </div><!--End Carousel-->

    </div><!-- .container  -->
</div><!-- #latest-properties  -->






<!-- #latest-properties  -->
<div class="container">
    <div class="row">
        <div class="home-bottom-top">
            <div class="span4">
                <div class="info-box">
                    <h2 class="secion-title">Why choose us?</h2>
                    <p>Lorem ipsum dolor sit amet consectetur incididunt ut labore et dolore
                        magna aliqua adipisicing elit seddo eiusmod tempor.</p>
                    <p>Sed perspiciatis unde omnisiste natus error voluptatem remopa
                        accusantium doloremque laudantium, totam rem aperiam.</p>
                    <a class="serif italic" href="#" title="Continue">Continue &raquo;</a>
                </div>
            </div>
            <!-- .span4 -->
            <div class="span4">
                <div class="info-box">
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
                    <!-- .clearfix -->
                </div>
                <!-- .info-box -->
                <div class="info-box">
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
                    <!-- .clearfix -->
                </div>
                <!-- .info-box -->
            </div>
            <!-- .span4 -->
            <div class="span4">
                <div class="info-box">
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
                    <!-- .clearfix -->
                </div>
                <!-- .info-box -->
                <div class="info-box">
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
                    <!-- .clearfix -->
                </div>
                <!-- .info-box -->
            </div>
            <!-- .span4 -->
        </div>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="span12 box-container">
            <div class="row adv-message clearfix">
                <div class="pull-left span7">
                    <p class="upper-line serif italic">Realto xHTML/CSS Template is The
                        Best Solution To Sell House Online</p>
                    <p class="lower-line">This template is appropriate for Real Estate
                        Company, who need to do their business online via websites.</p>
                </div>
                <!-- .pull-left -->
                <a class="pull-right btn btn-large btn-realto span3" href="#" title="Buy It Now">Buy
                    It Now!</a>
            </div>
            <!-- .adv-message  -->
        </div>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="span8">
            <h2 class="secion-title">Meet our agents</h2>
            <div class="row">
                <div class="span2">
                    <div class="home-agents widget">
                        <a class="overlay" href="#" title="agent name">
                            <span class="more"></span>
                            <img alt="image" class="media-object" src="<@spring.url '/static/resources/realto-html/images/agent-01.jpg'/>" />
                        </a>
                        <p class="home-agent-name">John Doe</p>
                        <a class="serif italic" href="#" title="View profile page">View profile
                            page &raquo;</a>
                    </div>
                    <!-- .home-agents -->
                </div>
                <div class="span2">
                    <div class="home-agents widget">
                        <a class="overlay" href="#" title="agent name">
                            <span class="more"></span>
                            <img alt="image" class="media-object" src="<@spring.url '/static/resources/realto-html/images/agent-02.jpg'/>" />
                        </a>
                        <p class="home-agent-name">Susan Underwood</p>
                        <a class="serif italic" href="#" title="View profile page">View profile
                            page &raquo;</a>
                    </div>
                    <!-- .home-agents -->
                </div>
                <div class="span2">
                    <div class="home-agents widget">
                        <a class="overlay" href="#" title="agent name">
                            <span class="more"></span>
                            <img alt="image" class="media-object" src="<@spring.url '/static/resources/realto-html/images/agent-06.jpg'/>" />
                        </a>
                        <p class="home-agent-name">Erik Peterson</p>
                        <a class="serif italic" href="#" title="View profile page">View profile
                            page &raquo;</a>
                    </div>
                    <!-- .home-agents -->
                </div>
                <div class="span2">
                    <div class="home-agents widget">
                        <a class="overlay" href="#" title="agent name">
                            <span class="more"></span>
                            <img alt="image" class="media-object" src="<@spring.url '/static/resources/realto-html/images/agent-07.jpg'/>" />
                        </a>
                        <p class="home-agent-name">Lu Jackson</p>
                        <a class="serif italic" href="#" title="View profile page">View profile
                            page &raquo;</a>
                    </div>
                    <!-- .home-agents -->
                </div>
            </div>
        </div>
        <!-- .span8  -->
        <div class="span4">
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
        </div>
        <!-- .span4  -->
    </div>
</div>

<!-- begin footer -->
<footer>
    <div class="container">
        <div class="row">
            <div class="span3">
                <div class="footer-widget">
                    <h2 class="brand widget-title">Realto</h2>
                    <p class="footer-tag-line">Your Company Tag Line</p>
                    <p>Lorem ipsum dolor sit amet consectetur incididunt ut labore et dolore
                        magna aliqua adipisicing elit seddo eiusmod tempor.</p>
                </div>
                <!-- .footer-company-info -->
            </div>
            <!-- .span3 -->
            <div class="span3">
                <div class="footer-widget">
                    <h3 class="widget-title">Address</h3>
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
            <div class="span3">
                <div class="footer-widget">
                    <h3 class="widget-title">Company</h3>
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
                                    <img alt="" class="media-object" src="<@spring.url '/static/resources/realto-html/images/flickr-05.jpg'/>"/>
                                </a>
                            </li>
                            <li class="pull-left">
                                <a title="image" href="#">
                                    <img alt="" class="media-object" src="<@spring.url '/static/resources/realto-html/images/flickr-06.jpg'/>"/>
                                </a>
                            </li>
                        </ul>
                    </div>
                    <!-- .flickr-widget -->
                </div>
                <!-- .footer-widget -->
            </div>
            <!-- .span3 -->
        </div>
    </div>
</footer>

<!-- end footer -->
<#include "footer.ftl">
