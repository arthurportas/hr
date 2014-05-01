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
        <h4><i class="icon-unlock"></i>&nbsp;&nbsp;Password Recovery</h4>

        <label>Email</label>
        <input type="text" class="input-block-level" />
        <label>Security Question</label>
        <select class="input-block-level">
            <option disabled="disabled" selected="selected" />---Select---
            <option />Which Is Your First Mobile
            <option />What Is Your Pet Name
            <option />What Is Your Mother Name
            <option />Which Is Your First Game
        </select>
        <label>Answer</label>
        <input type="text" class="input-block-level" />
        <br />
        <br />
        <a href="#" class=" btn  ">Recover Password&nbsp;&nbsp;&nbsp;<i class="icon-chevron-sign-right"></i></a>
    </div>
</#macro>

<#macro renderTab3Help>
    <div class="span7">
        <h4><i class="icon-question"></i>&nbsp;&nbsp;Help</h4>
        <div class="box">
            <p>Getting Error With Password Recovery Click Here For <a href="/support">Support</a></p>
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