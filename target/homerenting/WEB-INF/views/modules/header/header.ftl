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
                            <a href="/news" title="News">News</a>
                        </li>
                        <li>
                            <a href="/professionals" title="Professionals">Professionals</a>
                        </li>
                        <li>
                            <a href="/financing" title="Financing">Financing</a>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Law <i class="icon-caret-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="properties-grid-layout-1.html" title="Properties Grid Layout 1">Rental</a></li>
                                <li><a href="properties-grid-layout-2.html" title="Properties Grid Layout 2">Sale</a></li>
                            </ul>
                        </li>
                        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#" title="Agents">Agents<i class="icon-caret-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="agents.html" title="All Agents">All Agents</a></li>
                                <li><a href="agent-profile.html" title="Agent Profile">Agent Profile</a></li>
                            </ul>
                        </li>
                        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Blog<i class="icon-caret-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="blog-layout-1.html" title="Blog Layout 1">Blog Layout 1</a></li>
                                <li><a href="blog-layout-2.html" title="Blog Layout 2">Blog Layout 2</a></li>
                                <li><a href="blog-layout-3.html" title="Blog Layout 3">Blog Layout 3</a></li>
                                <li><a href="blog-layout-4.html" title="Blog Layout 4">Blog Layout 4</a></li>
                                <li><a href="single-post.html" title="Single Blog Post">Single Blog Post</a></li>
                            </ul>
                        </li>
                        <li><a href="financing.html" title="Financing">Financing</a></li>
                        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Features<i class="icon-caret-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="typography.html" title="Typography">Typography</a></li>
                                <li><a href="tabs-and-toggle.html" title="Tabs and Toggle">Tabs and Toggle</a></li>
                                <li><a href="buttons-and-boxes.html" title="Buttons and Boxes">Buttons and Boxes</a></li>
                                <li><a href="columns.html" title="Columns">Columns</a></li>
                                <li><a href="icons.html" title="Icons">Icons</a></li>
                            </ul>
                        </li>
                        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Pages <i class="icon-caret-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="page-with-sidebar.html" title="Sidebar Page">Sidebar Page</a></li>
                                <li><a href="wide-page.html" title="Homepage 3">Wide Page</a></li>
                            </ul>
                        </li>
                        <li><a href="/contacts" title="Contactos">Contactos</a></li>
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