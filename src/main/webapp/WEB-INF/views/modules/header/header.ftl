<#import "spring.ftl" as spring />
<!-- begin header -->
<header>
    <#include "navigation/navigation.ftl">

    <div id="logo-container">
        <div class="container">
            <div class="row">
                <div class="span8">
                    <a class="brand" href="index.html"><span class="logo-text">Realto</span></a>
                    <span class="tag-line hidden-phone">Your tag line here</span>
                </div>
                <#include "login/login.ftl">
            </div>
        </div>
    </div>
    <!-- #logo-container -->
</header>
<!-- end header -->