<#macro renderTab1>
    <div class="tab-pane active login" id="panel1">
        <div class="row-fluid">
            <@renderTab1LoginForm />
            <#--<@renderTab1LoginSocial />-->
            <@renderTab1Registration/>
        </div>
    </div>
</#macro>

<#macro renderTab1LoginForm>
    <div class="span5">
        <#if RequestParameters.auth??>
            <div class="alert alert-warning alert-dismissable">
                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                <strong>
                    <@spring.messageText "LOGIN.FAILED", "Erro no login"/>
                </strong>
                <br />
                <@spring.messageText "PLEASE.TRY.AGAIN", "Por favor, tente novamente"/>
            </div>
        </#if>

        <h4>
            <i class="icon-user"></i>&nbsp;&nbsp; <@spring.messageText "LOGIN.HERE", "Efetue Login"/>
        </h4>
        <form name='loginForm' action="<@spring.url 'j_spring_security_check'/>" method='POST' role="form">

            <div class="form-group">
                <label for="login-form-username">
                    <@spring.messageText "USERNAME", "Utilizador"/>
                </label>
                <input type="text" name='j_username' class="input-block-level form-control"
                       id="login-form-username" placeholder="<@spring.messageText "ENTER.EMAIL", "Introduza Email"/>"/>
            </div>

            <div class="form-group">
                <label for="login-form-password">
                    <@spring.messageText "PASSWORD", "Password"/>
                    <a href="#" class="pull-right recover-password" data-toggle="tooltip" data-placement="top"
                       title="<@spring.messageText "FORGOT.PASSWORD", "Recuperar Password"/>">
                        <i class="icon-question-sign"></i>&nbsp;
                        <@spring.messageText "FORGOT.PASSWORD", "Recuperar Password"/>
                    </a>
                </label>
                <input type="password" name='j_password' class="input-block-level form-control"
                       id="login-form-password" placeholder="<@spring.messageText "ENTER.PASSWORD", "Introduza Password"/>"/>
            </div>

            <div class="checkbox">
                <label>
                    <input type="checkbox" name="_spring_security_remember_me"> <@spring.messageText "REMEMBER.ME", "Lembrar-me"/>
                </label>
            </div>

            <button name="submit" type="submit" class="btn btn-default" value="submit">
                <@spring.messageText "SIGN.IN", "Entrar"/><i class="icon-chevron-sign-right"></i>
            </button>

        </form>
    </div>
</#macro>

<#macro renderTab1LoginSocial>
<div id="status"></div>
    <div class="span3">
        <h4><i class="icon-expand-alt"></i>&nbsp;&nbsp;Social</h4>
        <div class="socials clearfix">
            <a href="#" class="icon-facebook facebook tab-login-fblogin" title="<@spring.messageText "LOGIN.WITH.FACEBOOK", "Entrar com credenciais Facebook"/>"></a>
            <a href="#" class="icon-twitter twitter" title="<@spring.messageText "LOGIN.WITH.TWITTER", "Entrar com credenciais Twitter"/>"></a>
            <a href="#" class="icon-google-plus google-plus" title="<@spring.messageText "LOGIN.WITH.GPLUS", "Entrar com credenciais Google Plus"/>"></a>
            <a href="#" class="icon-linkedin linked-in" title="<@spring.messageText "LOGIN.WITH.LINKEDIN", "Entrar com credenciais LinkedIn"/>"></a>
        </div>
    </div>
</#macro>

<#macro renderTab1Registration>
    <div class="span4">
        <h4><i class="icon-question"></i>&nbsp;&nbsp;
            <@spring.messageText "REGISTRATION", "Registar"/>
        </h4>
        <div class="box">
            <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit fusce vel.
            </p>
            <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit fusce vel sapien elit in.
            </p>
        </div>
        <div class="box">
            <@spring.messageText "DONT.HAVE.AN.ACCOUNT", "Não possui uma conta."/><br />
            <@spring.messageText "CLICK.HERE.FOR", "Click Aqui para."/>
            <a href="#" class="register-free" data-toggle="tab" data-toggle="tooltip" data-placement="top"
               title="<@spring.messageText "FREE.REGISTER", "Registo grátis"/>">
                <@spring.messageText "FREE.REGISTER", "Registo grátis"/></a>
        </div>
    </div>
</#macro>