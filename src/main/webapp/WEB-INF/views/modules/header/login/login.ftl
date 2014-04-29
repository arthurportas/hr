<div class="span4">
    <div class="phone-number pull-right">
        <#if username?has_content && username!= "anonymousUser" >
            ${username}
            <a href="<@spring.url 'j_spring_security_logout'/>" id="logout" class="btn btn-warning">
                <@spring.messageText "LOGOUT", "Sair"/>
            </a>
        <#else>
            <a href="/login/new" class="btn btn-primary btn-lg">
                <i class="icon-user"></i> <@spring.messageText "LOGIN", "Entrar"/></a>
            </a>
            <a href="/announces" id="newAnnounce" class="btn btn-success">
                <@spring.messageText "INSERT.ANNOUNCE", "Inserir Anúncio"/>
            </a>
        </#if>

        <!-- Button trigger modal -->

        <!-- Modal -->
<#--
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title" id="myModalLabel"><@spring.messageText "LOGIN", "Entrar"/></h4>
                    </div>
                    <div class="modal-body">
                        <div class=""></div>
                        <div class="login-container">
                            <form role="form" class="login">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <input type="email" name="email" id="email" class="form-control input-lg login-email" placeholder="Email Address">
                                        </div>
                                        </div>
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                        <input type="password" name="password" id="password" class="form-control input-lg login-password" placeholder="Password">

                                        </div>
                                    </div>
                                    <a href="" class="btn btn-link pull-right">Forgot Password?</a>
                            </form>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary login">Sign In</button>
                    </div>
                </div>
            </div>
        </div>
-->
    </div><!--/phone-number-->
</div>