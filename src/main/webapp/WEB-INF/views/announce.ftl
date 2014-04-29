<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>
<#include "modules/header/header.ftl">
<div class="container page-content">
    <div class="row">
        <div class="span8">
            <div class="box-container">
                <div class="padding30">

                    <h2 class="page-title">Contact us</h2>
                    <#--<ul class="unstyled">
                        <li>
                            <i class="icon-envelope-alt"></i>
                            Email: realto@realto.com</li>
                        <li>
                            <i class="icon-phone"></i>
                            Phone: +1 786 345 6789</li>
                        <li>
                            <i class="icon-linkedin"></i>
                            linkedin.com/realto</li>
                        <li>
                            <i class="icon-twitter"></i>
                            twitter.com/realto</li>
                    </ul>

                    <div class="row-fluid contacts-blockUI">

                        <div class="contacts-alert"></div>

                        <form class="margin300" method="post">
                            <input class="span6 contacts-email-name" placeholder="Please, insert your name" type="text" name="name">
                            <input class="span6 pull-right contacts-email-from" placeholder="Please, insert your email" type="text" name="emailFrom">
                            <textarea class="span12 contacts-email-msg" placeholder="Write your message" rows="6" name="message"></textarea>
                            <div class="clearfix">
                                <button class="btn btn-realto span6 contacts-email">Submit</button>
                            </div>
                        </form>
                    </div>-->
                    <div id="wizard">
                        <ol>
                            <li>Large Paragraph</li>
                            <li>Paragraph</li>
                            <li>Unordered List</li>
                            <li>Kitchen Sink</li>
                        </ol>
                        <div>
                            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo. Quisque sit amet est et sapien ullamcorper pharetra. Vestibulum erat wisi, condimentum sed, commodo vitae, ornare sit amet, wisi. Aenean fermentum, elit eget tincidunt condimentum, eros ipsum rutrum orci, sagittis tempus lacus enim ac dui. Donec non enim in turpis pulvinar facilisis. Ut felis. Praesent dapibus, neque id cursus faucibus, tortor neque egestas augue, eu vulputate magna eros eu erat. Aliquam erat volutpat. Nam dui mi, tincidunt quis, accumsan porttitor, facilisis luctus, metus</p>
                        </div>
                        <div>
                            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.</p>
                        </div>
                        <div>
                            <ul>
                                <li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>
                                <li>Aliquam tincidunt mauris eu risus.</li>
                                <li>Vestibulum auctor dapibus neque.</li>
                            </ul>
                        </div>
                        <div>
                            <h1>Kitchen Sink</h1>

                            <p><strong>Pellentesque habitant morbi tristique</strong> senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. <em>Aenean ultricies mi vitae est.</em> Mauris placerat eleifend leo. Quisque sit amet est et sapien ullamcorper pharetra. Vestibulum erat wisi, condimentum sed, <code>commodo vitae</code>, ornare sit amet, wisi. Aenean fermentum, elit eget tincidunt condimentum, eros ipsum rutrum orci, sagittis tempus lacus enim ac dui. <a href="#">Donec non enim</a> in turpis pulvinar facilisis. Ut felis.</p>

                            <h2>Header Level 2</h2>

                            <ol>
                                <li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>
                                <li>Aliquam tincidunt mauris eu risus.</li>
                            </ol>

                            <blockquote><p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus magna. Cras in mi at felis aliquet congue. Ut a est eget ligula molestie gravida. Curabitur massa. Donec eleifend, libero at sagittis mollis, tellus est malesuada tellus, at luctus turpis elit sit amet quam. Vivamus pretium ornare est.</p></blockquote>

                            <h3>Header Level 3</h3>

                            <ul>
                                <li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>
                                <li>Aliquam tincidunt mauris eu risus.</li>
                            </ul>

				<pre><code>
                    #header h1 a {
                    display: block;
                    width: 300px;
                    height: 80px;
                    }
                </code></pre>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- .span8 -->
        <div class="span4 widget">
            <div class="widget map box-container padding30">
                <h3 class="widget-title">Get Directions</h3>
                <iframe src="http://maps.google.it/maps?f=q&amp;source=s_q&amp;hl=it&amp;geocode=&amp;q=miami+beach+collins+ave+1220&amp;aq=&amp;sll=25.861386,-80.120888&amp;sspn=0.205136,0.347786&amp;ie=UTF8&amp;hq=&amp;hnear=1220+Collins+Ave,+Miami+Beach,+Miami-Dade,+Florida+33139,+Stati+Uniti&amp;t=m&amp;z=14&amp;ll=25.783255,-80.131265&amp;output=embed"></iframe>
                <dl class="margin0">
                    <dt>Realto</dt>
                    <dd class="margin0">1680 Washington Avenue</dd>
                    <dd class="margin0">Miami Beach, FL 33139</dd>
                </dl>
            </div>
        </div>
        <!-- .span4 -->
    </div>
    <!-- .row -->
</div>
<#include "modules/footer/footer.ftl">
<#include "footer.ftl">