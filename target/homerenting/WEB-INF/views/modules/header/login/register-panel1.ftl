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
        <h4><i class="icon-user"></i>&nbsp;&nbsp; Register Here</h4>


        <label>Username</label>
        <input type="text" class="input-block-level" />
        <label>Password </label>
        <input type="password" class="input-block-level" />
        <label>Repeat Password</label>
        <input type="password" class="input-block-level" />
        <label>
            <button type="button" data-toggle="button" class="btn btn-mini custom-checkbox active"><i class="icon-ok"></i></button>
            &nbsp;&nbsp;&nbsp;I Aggree With <a href="/terms">Terms &amp; Conditions</a>
        </label>
        <br />

        <a href="#" class=" btn  ">Register Now&nbsp;&nbsp;&nbsp;<i class="icon-chevron-sign-right"></i></a>

    </div>
</#macro>

<#macro renderTab2RegisterSocial>
    <div class="span3">
        <h4><i class="icon-expand-alt"></i>&nbsp;&nbsp;Social</h4>
        <div class="socials clearfix">
            <a class="icon-facebook facebook"></a>
            <a class="icon-twitter twitter"></a>
            <a class="icon-google-plus google-plus"></a>
            <a class="icon-linkedin linked-in"></a>
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
            Already Have An Account.<br />
            Click Here For <a href="/login/new#panel1" data-toggle="tab">Login</a>
        </div>
    </div>
</#macro>