<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>
<#include "modules/header/header.ftl">
<div class="container page-content">
    <div class="row-fluid padding30 box-container">
    <div class="row">
        <div class="span8">
            <div class="box-container">
                <div class="padding30">
                    <h2 class="page-title">TODO: formulário para editar dados conta</h2>
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