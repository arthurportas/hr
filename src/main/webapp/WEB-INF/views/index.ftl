<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>

<#include "modules/header/header.ftl">
<#include "modules/theme-chooser/theme-chooser.ftl">
<#include "modules/search/search.ftl">


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
                                        <img alt="image" src="<@spring.url '/static/resources/realto-html/images/04.jpg'/>" class="media-object" />
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


<#--<div class="container">
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
                    <!-- .home-agents &ndash;&gt;
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
                    <!-- .home-agents &ndash;&gt;
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
                    <!-- .home-agents &ndash;&gt;
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
                    <!-- .home-agents &ndash;&gt;
                </div>
            </div>
        </div>
        <!-- .span8  &ndash;&gt;
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
        <!-- .span4  &ndash;&gt;
    </div>
</div>-->

<#include "modules/footer/footer.ftl">

<!-- end footer -->
<#include "footer.ftl">
