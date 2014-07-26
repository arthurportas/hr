<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>
<#include "modules/header/header.ftl">
<#--<div class="container page-content">
    <div class="row">
        <div class="span8">
            <div class="box-container">
                <div class="padding30">
                    <h2 class="page-title">Personal TODO...</h2>
                    <ul class="unstyled">
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
                    </div>

                </div>
            </div>
        </div>-->
        
        <div class="container page-content">
            <h2 class="page-title">Tabs</h2>
            <div class="row-fluid padding30 box-container">
                <div class="tabbable" id="myTab">
                     
                    <!-- Only required for left/right tabs -->
                    <ul class="nav nav-tabs">
                        <li class="active"><a href="#tab1" data-toggle="tab">Section 1</a></li>
                        <li><a href="#tab2" data-toggle="tab">Section 2</a></li>
                        <li><a href="#tab3" data-toggle="tab">Section 3</a></li>
                    </ul>
                    <div class="tab-content">
                        <div class="tab-pane active" id="tab1">
                            <p>I'm in Section 1.</p>
                            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada
                                fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                                ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                                egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend
                                leo.</p>
                        </div>
                        <div class="tab-pane" id="tab2">
                            <p>Howdy, I'm in Section 2.</p>
                            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada
                                fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                                ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                                egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend
                                leo.</p>
                        </div>
                        <div class="tab-pane" id="tab3">
                            <p>Yo, I'm in Section 3.</p>
                            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada
                                fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                                ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                                egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend
                                leo.</p>
                        </div>
                    </div>
                </div>
                <!-- .tabbable -->
            </div>
            <!-- .row-fluid -->
            <h2 class="page-title">Toggle</h2>
            <div class="row-fluid padding30 box-container">
                <div class="accordion">
                    <div class="accordion-group">
                        <div class="accordion-heading">
                            <a class="accordion-toggle" data-parent="#accordion" data-toggle="collapse" href="#collapseOne">
                                Toggle Group Item #1
                            </a>
                        </div>
                        <div class="accordion-body collapse" id="collapseOne">
                            <div class="accordion-inner">
                                <p>Pellentesque habitant morbi tristique senectus et netus et malesuada
                                    fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                                    ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                                    egestas semper. Aenean ultricies mi vitae est. Vestibulum tortor quam,
                                    feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero
                                    sit amet quam egestas semper. Mauris placerat eleifend leo.</p>
                            </div>
                        </div>
                    </div>
                    <div class="accordion-group">
                        <div class="accordion-heading">
                            <a class="accordion-toggle" data-parent="#accordion" data-toggle="collapse" href="#collapseTwo">
                                Toggle Group Item #2
                            </a>
                        </div>
                        <div class="accordion-body collapse" id="collapseTwo">
                            <div class="accordion-inner">
                                <p>Aenean ultricies mi vitae est. Vestibulum tortor quam, feugiat vitae,
                                    ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                                    egestas semper. Pellentesque habitant morbi tristique senectus et netus
                                    et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat
                                    vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet
                                    quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat
                                    eleifend leo. Donec eu libero sit amet quam egestas semper. Aenean
                                    ultricies mi vitae est. Vestibulum tortor quam, feugiat vitae, ultricies
                                    eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
                                    semper.
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="accordion-group">
                        <div class="accordion-heading">
                            <a class="accordion-toggle" data-parent="#accordion" data-toggle="collapse" href="#collapseTree">
                                Toggle Group Item #3
                            </a>
                        </div>
                        <div class="accordion-body collapse" id="collapseTree">
                            <div class="accordion-inner">
                                <p>Donec eu libero sit amet quam egestas semper. Aenean ultricies mi
                                    vitae est. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor
                                    sit amet, ante. Donec eu libero sit amet quam egestas semper.
                                    Pellentesque habitant morbi tristique senectus et netus et malesuada
                                    fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                                    ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                                    egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend
                                    leo.</p>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- .accordion -->
            </div>
            <!-- .row-fluid -->
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