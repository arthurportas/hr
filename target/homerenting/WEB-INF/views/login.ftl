<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>
<#include "modules/header/header.ftl">
<div class="container page-content">
    <div class="row">
        <div class="span8">
            <div class="box-container">
                <div class="padding30">
                    <h2 class="page-title">Login</h2>

                    <div class="row-fluid">
                        <form name='loginForm' action="<@spring.url 'j_spring_security_check'/>" method='POST'>
                            <table>
                                <tr>
                                    <td>User:</td>
                                    <td><input type='text' name='j_username' value=''></td>
                                </tr>
                                <tr>
                                    <td>Password:</td>
                                    <td><input type='password' name='j_password' /></td>
                                </tr>
                                <tr>
                                    <td colspan='2'><input name="submit" type="submit" value="submit" /></td>
                                </tr>
                            </table>

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