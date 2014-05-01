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
                        <a href="/financing" title="Financing"><@spring.messageText "FINANCING", "Financiamento"/></a>
                    </li>
                    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><@spring.messageText "LAW", "Legislação"/><i class="icon-caret-down"></i></a>
                        <ul class="dropdown-menu">
                            <li><a href="/law/rental" title="<@spring.messageText "RENTAL", "Aluguer"/>"><@spring.messageText "RENTAL", "Aluguer"/></a></li>
                            <li><a href="/law/sale" title="<@spring.messageText "SALE", "Venda"/>"><@spring.messageText "SALE", "Venda"/></a></li>
                        </ul>
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