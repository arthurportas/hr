<div class="span4">

<#if LOGGEDIN_USER??>
    tretas->${LOGGEDIN_USER}
</#if>


    <div class="phone-number pull-right">
        <!-- Button trigger modal -->
        <button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
            <i class="icon-user"></i> Entrar</a>
        </button>


        <a href="#" id="newAnnounce" class="btn btn-success">Novo Anúncio</a>



        <!-- Modal -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title" id="myModalLabel">Login</h4>
                    </div>
                    <div class="modal-body">
                        <div class="login-container">
                            <form role="form">
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                            <input type="email" name="email" id="email" class="form-control input-lg" placeholder="Email Address">
                                        </div>
                                        </div>
                                    <div class="form-group">
                                        <div class="col-sm-10">
                                        <input type="password" name="password" id="password" class="form-control input-lg" placeholder="Password">

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
    </div><!--/phone-number-->
</div>