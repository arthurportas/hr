<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>

<#include "modules/header/header.ftl">
<#include "modules/theme-chooser/theme-chooser.ftl">
<#include "modules/search/search.ftl">

<#include "modules/latestProperties/latest-properties.ftl">


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


<#--<div class="container">
    <div class="row">
        <div class="span12 box-container">
            <div class="row adv-message clearfix">
                <div class="pull-left span7">
                    <p class="upper-line serif italic">Realto xHTML/CSS Template is The
                        Best Solution To Sell House Online</p>
                    <p class="lower-line">This template is appropriate for Real Estate
                        Company, who need to do their business online via websites.</p>
                </div>
                <!-- .pull-left &ndash;&gt;
                <a class="pull-right btn btn-large btn-realto span3" href="#" title="Buy It Now">Buy
                    It Now!</a>
            </div>
            <!-- .adv-message  &ndash;&gt;
        </div>
    </div>
</div>-->


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
