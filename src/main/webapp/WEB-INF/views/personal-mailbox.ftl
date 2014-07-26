<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>
<#include "modules/header/header.ftl">
<div class="container page-content">
    <div class="row">
        <div class="span8">
            
            <div class="row-fluid padding30 box-container">
                <#include "modules/my-account/mailbox-tabs.ftl">   
            </div>
            <!-- .row-fluid -->
            <#--
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
            <#--</div>-->
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