<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>
<#include "modules/header/header.ftl">
<div class="container page-content">
    <div class="row">
        <div class="span8">
            <div class="box-container">
                <div class="padding30">
                    <h2 class="page-title"><@spring.messageText "CONTACT.US", "Contatos"/></h2>
                    login failed!!

                    <div class="row-fluid contacts-blockUI">

                        <div class="contacts-alert"></div>

                        <form class="margin300" method="post">
                            <input class="span6 contacts-email-name" placeholder="<@spring.messageText "PLEASE.INSERT.YOUR.NAME", "Pf, preencha o nome"/>" type="text" name="name">
                            <input class="span6 pull-right contacts-email-from" placeholder="<@spring.messageText "PLEASE.INSERT.YOUR.EMAIL", "Pf, preencha o seu email"/>" type="text" name="emailFrom">
                            <textarea class="span12 contacts-email-msg" placeholder="<@spring.messageText "WRITE.YOUR.MESSAGE", "Escreva mensagem"/>" rows="6" name="message"></textarea>
                            <div class="clearfix">
                                <button class="btn btn-realto span6 contacts-email"><@spring.messageText "SUBMIT", "Enviar"/></button>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>
        <!-- .span8 -->
        <#include "modules/directions/directions.ftl">
    </div>
    <!-- .row -->
</div>
<#include "modules/footer/footer.ftl">
<#include "footer.ftl">