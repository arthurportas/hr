<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>
<#include "modules/header/header.ftl">
<div class="container page-content">
    <div class="row">
        <div class="span8">
            <div class="box-container">
                <div class="padding30">
                    <#--<h2 class="page-title">Login</h2>-->
                    <div class="row-fluid" id="demo-1">
                        <div><#-- class="span8" offset1-->
                            <div class="tabbable custom-tabs tabs-animated flat flat-all hide-label-980 shadow track-url auto-scroll">
                                <@renderTabs />
                                <div class="tab-content ">
                                <#import "modules/header/login/login-panel1.ftl" as tab1>
                                    <@tab1.renderTab1 />
                                <#import "modules/header/login/register-panel1.ftl" as tab2>
                                    <@tab2.renderTab2 />
                                <#import "modules/header/login/forgot-password-panel1.ftl" as tab3>
                                    <@tab3.renderTab3 />
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
        <!-- .span8 -->
<#--        <div class="span4 widget">
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
        <!-- .span4 &ndash;&gt;-->
    </div>
    <!-- .row -->
</div>
<#include "modules/footer/footer.ftl">
<#include "footer.ftl">

<#macro renderTabs>
    <ul class="nav nav-tabs">
        <li class="active login">
            <a href="#panel1" data-toggle="tab" class="active ">
                <i class="icon-lock"></i>&nbsp;
                <span><@spring.messageText "LOGIN.PANEL", "Login"/></span>
            </a>
        </li>
        <li class="register">
            <a href="#panel2" data-toggle="tab">
                <i class="icon-user"></i>&nbsp;
                <span><@spring.messageText "REGISTER.PANEL", "Registar"/></span>
            </a>
        </li>
        <li class="forgot-password">
            <a href="#panel3" data-toggle="tab"><i class="icon-key"></i>&nbsp;
                <span><@spring.messageText "FORGOT.PASSWORD", "Recuperar Password"/></span>
            </a>
        </li>
    </ul>
</#macro>

