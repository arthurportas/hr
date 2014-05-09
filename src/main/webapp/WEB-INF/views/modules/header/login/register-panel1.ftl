<#macro renderTab2>
    <div class="tab-pane" id="panel2">
        <div class="row-fluid">
            <@renderTab2RegisterForm />
            <@renderTab2RegisterSocial />
            <@renderTab2Login />
        </div>
    </div>
</#macro>

<#macro renderTab2RegisterForm>
    <div class="span5">
        <h4><i class="icon-user"></i>&nbsp;&nbsp;
            <@spring.messageText "REGISTER.HERE", "Registar-me Aqui"/>
        </h4>
        <div class="register-user-form-alert"></div>
        <div class="register-user-blockUI">
            <form name='register-user-form' action="" method='POST' role="form">

                <div class="form-group">
                    <label for="register-user-form-username">
                        <@spring.messageText "Email", "Email"/>
                    </label>
                    <div class="register-user-form-username-alert"></div>
                    <input type="text" name="register-user-form-username" class="input-block-level form-control register-user-form-username"
                            id="register-user-form-username" placeholder="<@spring.messageText "ENTER.EMAIL", "Introduza Email"/>"/>
                </div>

                <div class="form-group">
                    <label for="register-user-form-password">
                        <@spring.messageText "PASSWORD", "Password"/>
                    </label>
                    <div class="register-user-form-password-alert"></div>
                    <input type="password" name="register-user-form-password" class="input-block-level form-control register-user-form-password"
                           id="register-user-form-password" placeholder="<@spring.messageText "ENTER.PASSWORD", "Introduza Password"/>"/>
                </div>

                <div class="form-group">
                    <label for="register-user-form-repeat-password">
                        <@spring.messageText "REPEAT.PASSWORD", "Repetir Password"/>
                    </label>
                    <div class="register-user-form-repeat-password-alert"></div>
                    <input type="password" name="register-user-form-repeat-password" class="input-block-level form-control register-user-form-repeat-password"
                            id="register-user-form-repeat-password" placeholder="<@spring.messageText "REPEAT.PASSWORD", "Repetir Password"/>"/>
                </div>

                <div class="form-group">
                    <label>
                        <button type="button" data-toggle="button" class="btn btn-mini custom-checkbox active">
                            <i class="icon-ok"></i>
                        </button>
                        &nbsp;&nbsp;&nbsp;<@spring.messageText "I.AGREE.WITH", "Concordo com"/>
                        <a href="/terms" class="terms-and-conditions" data-toggle="tab" data-toggle="tooltip" data-placement="top"
                           title="<@spring.messageText "TERMS.AND.CONDITIONS", "Termos & Condições"/>"><@spring.messageText "TERMS.AND.CONDITIONS", "Termos & Condições"/></a>
                    </label>
                </div>

                <button name="submit" id="register-user-form-submit" class="btn btn-default register-user-form-submit disabled" value="submit">
                    <@spring.messageText "REGISTER.NOW", "Registar Agora"/><i class="icon-chevron-sign-right"></i>
                </button>
            </form>
        </div>
    </div>
</#macro>

<#macro renderTab2RegisterSocial>
    <div class="span3">
        <h4><i class="icon-expand-alt"></i>&nbsp;&nbsp;Social</h4>
        <div class="socials clearfix">
            <a href="#" class="icon-facebook facebook" title="registar com facebook"></a>
            <a href="#" class="icon-twitter twitter" title="registar com twitter"></a>
            <a href="#" class="icon-google-plus google-plus" title="registar com google-plus"></a>
            <a href="#" class="icon-linkedin linked-in" title="registar com linked-in"></a>
        </div>
    </div>
</#macro>

<#macro renderTab2Login>
    <div class="span4">
        <h4><i class="icon-question"></i>&nbsp;&nbsp;Login</h4>
        <div class="box">
            <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit fusce vel.
            </p>
            <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit fusce vel sapien elit in.
            </p>
        </div>
        <div class="box">
            <@spring.messageText "ALREADY.HAVE.AN.ACCOUNT", "Já Possuo Conta."/><br />
            <@spring.messageText "CLICK.HERE.FOR", "Click aqui Para"/>
            <a href="#" class="register-panel-login" data-toggle="tab" data-toggle="tooltip" data-placement="top"
               title="<@spring.messageText "LOGIN", "Entrar"/>">
                <@spring.messageText "LOGIN", "Entrar"/></a>
        </div>
    </div>
</#macro>