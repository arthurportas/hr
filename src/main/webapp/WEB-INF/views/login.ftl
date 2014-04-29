<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>
<#include "modules/header/header.ftl">
<div class="container page-content">
    <div class="row">
        <div class="span12">
            <div class="box-container">
                <div class="padding30">
                    <#--<h2 class="page-title">Login</h2>-->
                    <div class="row-fluid" id="demo-1">
                    <div class="span10 offset1">
                    <div class="tabbable custom-tabs tabs-animated  flat flat-all hide-label-980 shadow track-url auto-scroll">
                    <ul class="nav nav-tabs">
                        <li class="active"><a href="#panel1" data-toggle="tab" class="active "><i class="icon-lock"></i>&nbsp;<span>Login Panel</span></a></li>
                        <li><a href="#panel2" data-toggle="tab"><i class="icon-user"></i>&nbsp;<span>Register Panel</span></a></li>
                        <li><a href="#panel3" data-toggle="tab"><i class="icon-key"></i>&nbsp;<span>Forgot Password</span></a></li>
                        <li><a href="#panel4" data-toggle="tab"><i class="icon-envelope-alt"></i>&nbsp;<span>Contact Us</span></a></li>
                    </ul>
                    <div class="tab-content ">
                        <div class="tab-pane active" id="panel1">
                            <div class="row-fluid">
                                <div class="span5">
                                    <h4><i class="icon-user"></i>&nbsp;&nbsp; Login Here</h4>
                                    <form name='loginForm' action="<@spring.url 'j_spring_security_check'/>" method='POST'>
                                        <label>Username</label>
                                        <input type="text" name='j_username' class="input-block-level" />
                                        <label>Password<a href="#" class="pull-right"><i class="icon-question-sign"></i>&nbsp;Forgot Password</a> </label>
                                        <input type="password" name='j_password' class="input-block-level" />
                                        <label>
                                            <button type="button" data-toggle="button" class="btn btn-mini custom-checkbox active"><i class="icon-ok"></i></button>
                                            &nbsp;&nbsp;&nbsp;Remember Me
                                        </label>
                                        <br />
                                        <button name="submit" type="submit" value="submit">Sign In&nbsp;&nbsp;&nbsp;<i class="icon-chevron-sign-right"></i></button>
<#--
                                        <a href="#" class=" btn  ">Sign In&nbsp;&nbsp;&nbsp;<i class="icon-chevron-sign-right"></i></a>
-->
                                    </form>
                                </div>
                                <div class="span3">
                                    <h4><i class="icon-expand-alt"></i>&nbsp;&nbsp;Social</h4>
                                    <div class="socials clearfix">
                                        <a class="icon-facebook facebook"></a>
                                        <a class="icon-twitter twitter"></a>
                                        <a class="icon-google-plus google-plus"></a>
                                        <a class="icon-pinterest pinterest"></a>
                                        <a class="icon-linkedin linked-in"></a>
                                        <a class="icon-github github"></a>
                                    </div>
                                </div>
                                <div class="span4">
                                    <h4><i class="icon-question"></i>&nbsp;&nbsp;Registration</h4>
                                    <div class="box">
                                        <p>
                                            Lorem ipsum dolor sit amet, consectetur adipiscing elit fusce vel.
                                        </p>
                                        <p>
                                            Lorem ipsum dolor sit amet, consectetur adipiscing elit fusce vel sapien elit in.
                                        </p>
                                    </div>
                                    <div class="box">
                                        Don't Have An Account.<br />
                                        Click Here For <a href="#" data-toggle="tab">Free Register</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="tab-pane" id="panel2">
                            <div class="row-fluid">
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
                                        &nbsp;&nbsp;&nbsp;I Aggree With <a href="#">Terms &amp; Conditions</a>
                                    </label>
                                    <br />

                                    <a href="#" class=" btn  ">Register Now&nbsp;&nbsp;&nbsp;<i class="icon-chevron-sign-right"></i></a>

                                </div>
                                <div class="span3">
                                    <h4><i class="icon-expand-alt"></i>&nbsp;&nbsp;Social</h4>
                                    <div class="socials clearfix">
                                        <a class="icon-facebook facebook"></a>
                                        <a class="icon-twitter twitter"></a>
                                        <a class="icon-google-plus google-plus"></a>
                                        <a class="icon-pinterest pinterest"></a>
                                        <a class="icon-linkedin linked-in"></a>
                                        <a class="icon-github github"></a>
                                    </div>
                                </div>
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
                                        Click Here For <a href="#" data-toggle="tab">Login</a>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="tab-pane" id="panel3">
                            <div class="row-fluid">
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
                                <div class="span7">
                                    <h4><i class="icon-question"></i>&nbsp;&nbsp;Help</h4>
                                    <div class="box">
                                        <p>Getting Error With Password Recovery Click Here For <a href="#">Support</a></p>
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
                            </div>


                        </div>
                        <div id="panel4" class="tab-pane">
                            <div class="row-fluid">
                                <div class="span5">
                                    <h4><i class="icon-envelope-alt"></i>&nbsp;&nbsp;Contact Us</h4>
                                    <label>Name</label>
                                    <input type="text" value="" id="" class="input-block-level" />
                                    <label>Email</label>
                                    <input type="text" value="" id="Text1" class="input-block-level" />
                                    <label>Mobile No</label>
                                    <input type="text" value="" id="Text2" class="input-block-level" />
                                    <label>Message</label>
                                    <textarea class="input-block-level" rows="5"></textarea>
                                    <a href="#" class=" btn ">Send Message&nbsp;&nbsp;&nbsp;<i class="icon-chevron-sign-right"></i></a>
                                    <br class="visible-phone" />
                                    <br class="visible-phone" />
                                </div>
                                <div class="span7">
                                    <div class="row-fluid">
                                        <div class="span12">
                                            <h4><i class="icon-location-arrow"></i>&nbsp;&nbsp;Locate Us</h4>

                                            <div class="map"></div>

                                        </div>
                                    </div>
                                    <div class="row-fluid">
                                        <div class="span6">
                                            <h4><i class="icon-envelope-alt"></i>&nbsp;&nbsp;Contact Us</h4>
                                            <address>
                                                <strong>Full Name</strong><br />
                                                <a href="mailto:#">first.last@example.com</a>
                                            </address>
                                        </div>
                                        <div class="span6">
                                            <h4><i class="icon-location-arrow"></i>&nbsp;&nbsp;Our Address</h4>

                                            <address>
                                                <strong>Twitter, Inc.</strong><br />
                                                795 Folsom Ave, Suite 600<br />
                                                San Francisco, CA 94107<br />
                                                <abbr title="Phone">P:</abbr>
                                                (123) 456-7890
                                            </address>
                                        </div>

                                    </div>

                                </div>
                            </div>
                        </div>

                    </div>

                    </div>
                    </div>
                    </div>
                    <#--<div class="row-fluid">
                        <form name='loginForm' action="<@spring.url 'j_spring_security_check'/>" method='POST'>
                            <table>
                                <tr>
                                    <td>User:</td>
                                    <td><input type='text' name='j_username' value=''></td>
                                </tr>
                                <tr>
                                    <td>Password:</td>
                                    <td><input type='password' name='j_password' /></td>
                                </tr>
                                <tr>
                                    <td colspan='2'><input name="submit" type="submit" value="submit" /></td>
                                </tr>
                            </table>

                        </form>
                    </div>-->
                </div>
            </div>
        </div>
        <!-- .span8 -->
<#--        <div class="span4 widget">
            <div class="widget map box-container padding30">
                <h3 class="widget-title">Get Directions</h3>
                <iframe src="http://maps.google.it/maps?f=q&amp;source=s_q&amp;hl=it&amp;geocode=&amp;q=miami+beach+collins+ave+1220&amp;aq=&amp;sll=25.861386,-80.120888&amp;sspn=0.205136,0.347786&amp;ie=UTF8&amp;hq=&amp;hnear=1220+Collins+Ave,+Miami+Beach,+Miami-Dade,+Florida+33139,+Stati+Uniti&amp;t=m&amp;z=14&amp;ll=25.783255,-80.131265&amp;output=embed"></iframe>
                <dl class="margin0">
                    <dt>Realto</dt>
                    <dd class="margin0">1680 Washington Avenue</dd>
                    <dd class="margin0">Miami Beach, FL 33139</dd>
                </dl>
            </div>
        </div>
        <!-- .span4 &ndash;&gt;-->
    </div>
    <!-- .row -->
</div>
<#include "modules/footer/footer.ftl">
<#include "footer.ftl">