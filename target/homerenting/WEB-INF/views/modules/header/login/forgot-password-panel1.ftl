<#macro renderTab3>
    <div class="tab-pane" id="panel3">
        <div class="row-fluid">
            <@renderTab3ForgotPasswordForm />
            <@renderTab3Help />
        </div>
    </div>
</#macro>

<#macro renderTab3ForgotPasswordForm>
    <div class="span5">
        <h4><i class="icon-unlock"></i>&nbsp;&nbsp;
            <@spring.messageText "PASSWORD.RECOVERY", "Recuperar Password"/>
        </h4>

        <form name='recover-user-password-form' action="" method='POST' role="form">

            <div class="form-group">
                <label for="recover-user-password-form-email">
                    Email
                </label>
                <input type="text" name="recover-user-password-form-email" class="input-block-level form-control"
                       id="recover-user-password-form-email" placeholder="<@spring.messageText "ENTER.EMAIL", "Introduza Email"/>"/>
            </div>


            <#--<div class="form-group">
                <label for="recover-user-password-form-security-question">
                    <@spring.messageText "SECURITY.QUESTION", "Questão de Segurança"/>
                </label>

                <@renderSecurityQuestions />

            </div>

            <div class="form-group">
                <label for="recover-user-password-form-security-question-answer">
                    <@spring.messageText "ANSWER", "Resposta"/>
                </label>
                <input type="text" name="recover-user-password-form-security-question-answer" class="input-block-level form-control"
                       id="recover-user-password-form-security-question-answer" placeholder="<@spring.messageText "ENTER.ANSWER", "Introduza Resposta"/>"/>
            </div>-->

            <button name="submit" type="submit" class="btn btn-default" value="submit">
                <@spring.messageText "RECOVER.PASSWORD", "Recuperar Password"/><i class="icon-chevron-sign-right"></i>
            </button>

        </form>
    </div>
</#macro>

<#macro renderTab3Help>
    <div class="span7">
        <h4><i class="icon-question"></i>&nbsp;&nbsp;<@spring.messageText "HELP", "Ajuda"/></h4>
        <div class="box">
            <p><@spring.messageText "GETTING.ERROR.WITH.PASSWORD.RECOVERY", "Dificuldade na Recuperação de Password Click Aqui Para"/>
                <a href="/support"><@spring.messageText "SUPPORT", "Suporte"/></a></p>
            <ul>
                <li>Vestibulum pharetra lectus montes lacus!</li>
                <li>Iaculis lectus augue pulvinar taciti.</li>
            </ul>

        </div>
        <div class="box">
            <ul>
                <li>Potenti facilisis felis sociis blandit euismod.</li>
                <li>Odio mi hendrerit ad nostra.</li>
                <li>Rutrum mi commodo molestie taciti.</li>
                <li>Interdum ipsum ad risus conubia, porttitor.</li>
                <li>Placerat litora, proin hac hendrerit ac volutpat.</li>
                <li>Ornare, aliquam condimentum  habitasse.</li>
            </ul>

        </div>
    </div>
</#macro>

<#macro renderSecurityQuestions>
    <select class="input-block-level" id="recover-user-password-form-security-question">
        <option disabled="disabled" selected="selected" />
        ---<@spring.messageText "SELECT", "Selecione"/>---
        <#list securityQuestions as sq>
            <option value="${sq.value}"><@spring.messageText "WHICH.IS.YOUR.${(sq.value)?string?upper_case?replace(' ' '.')}", "${sq.value?string?capitalize}"/></option>
        </#list>
    </select>
</#macro>