<!-- begin header -->
<header>
    <#include "navigation/navigation.ftl">

    <div id="logo-container">
        <div class="container">
            <div class="row">
                <div class="span8">
                    <a class="brand" href="index.html"><span class="logo-text">HomeRenting</span></a>
                    <span class="tag-line hidden-phone"><@spring.message "tag.line" /></span>
                </div>
                <#include "login/login.ftl">
            </div>
        </div>
    </div>
    <!-- #logo-container -->
</header>
<!-- end header -->