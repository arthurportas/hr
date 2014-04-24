<!-- begin header -->
<header>
    <#--<#include "navigation/navigation.ftl">-->
    <div class="navbar navbar-inverse navbar-static-top">
        <div class="navbar-inner">
            <div class="container">
                <button class="btn btn-navbar" data-target=".nav-collapse" data-toggle="collapse" type="button">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <div class="nav-collapse collapse">
                    <ul class="nav">
                        <li class="active">
                            <a href="/"><i class="icon-home"></i></a>
                        </li>
                        <li>
                            <a href="/news" title="News"><@spring.messageText "NEWS", "Notícias"/></a>
                        </li>
                        <li>
                            <a href="/professionals" title="Professionals"><@spring.messageText "PROFESSIONALS", "Profissionais"/></a>
                        </li>
                        <li>
                            <a href="/services" title="Financing"><@spring.messageText "SERVICES", "Serviços"/></a>
                        </li>

                        <li>
                            <a href="/contacts" title="Contactos"><@spring.messageText "CONTACTS", "Contatos"/></a>
                        </li>
                    </ul>
                </div>
                <!--/.nav-collapse -->
            </div>
        </div>
    </div>

    <div id="logo-container">
        <div class="container">
            <div class="row">
                <div class="span8">
                    <a class="brand" href="index.html"><span class="logo-text">ImoWeb</span></a>
                    <span class="tag-line hidden-phone"><@spring.message "TAG.LINE" /></span>
                </div>
                <#include "login/login.ftl">
            </div>
        </div>
    </div>
    <!-- #logo-container -->
</header>
<!-- end header -->