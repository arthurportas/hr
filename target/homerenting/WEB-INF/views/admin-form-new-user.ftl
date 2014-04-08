<#import "spring.ftl" as spring />
<div class="row">
	<div class="container">
    	<div class="row well">
    		<form id="admin-form-new-user" class="form-horizontal" role="form">
                <fieldset>
                    <!-- Form Name -->
                    <legend>Registo de Clientes</legend>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="name">
                            <@spring.message "label.firstname" />
                        </label>
                        <div class="col-md-4">
                            <input id="name" name="name" type="text" placeholder="name"
                                   class="form-control input-md" required
                                   data-validation-required-message="Please fill out this field"
                                   data-validation-text-message="Must be a number" >

                            <p class="help-block"></p>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="surname">
                            <@spring.messageText "label.lastname", "Apelido"/>
                        </label>
                        <div class="col-md-4">
                            <input id="surname" name="surname" type="text" placeholder="surname"
                                   class="form-control input-md" required>
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <@renderCountries />

                    <@renderLocalities />

                    <@renderRegions />

                    <@renderParishes />

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="address">Morada</label>
                        <div class="col-md-4">
                            <input id="address" name="address" type="text" placeholder="address"
                                   class="form-control input-md" required>
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="number">Numero</label>
                        <div class="col-md-1">
                            <input id="number" name="number" type="text" placeholder="42" class="form-control input-md" required>
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="postal_code">Código Postal</label>
                        <div class="col-md-4">
                            <input id="postal_code" name="postal_code" type="text" placeholder="4250-551" class="form-control input-md" required>
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <@renderUserType />

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="textinput">Empresa</label>
                        <div class="col-md-4">
                            <input id="company" name="textinput" type="text" placeholder="company" class="form-control input-md">
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="nif">Numero de Contribuinte</label>
                        <div class="col-md-4">
                            <input id="nif" name="nif" type="text" placeholder="nif" class="form-control input-md" required>
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="textinput">Telefone</label>
                        <div class="col-md-4">
                            <input id="phone" name="phone" type="tel" placeholder="phone" class="form-control input-md" required>
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="textinput">Telemóvel</label>
                        <div class="col-md-4">
                            <input id="cellPhone" name="cellPhone" type="tel" placeholder="cellPhone" class="form-control input-md">
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="fax">Fax</label>
                        <div class="col-md-4">
                            <input id="fax" name="fax" type="tel" placeholder="fax" class="form-control input-md">
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="mail">E-mail</label>
                        <div class="col-md-4">
                            <input id="mail" name="mail" type="text" placeholder="email" class="form-control
                            input-md" required
                                   data-validation-matches-match="email"
                                   data-validation-matches-message=
                                           "Must match email address entered above" >
                            <span class="help-block"></span>
                        </div>
                    </div>

                    <!-- Multiple Radios (inline) -->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="radios">Pretende que seja divulgado publicamente o contacto?</label>
                        <div class="col-md-4">
                            <label class="radio-inline" for="radios-0">
                                <input type="radio" name="radios" id="radios-0" value="sim" checked="checked">
                                Sim
                            </label>
                            <label class="radio-inline" for="radios-1">
                                <input type="radio" name="radios" id="radios-1" value="nao">
                                Não
                            </label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="submit"></label>
                        <div class="col-md-4">
                            <button id="submit" name="submit" class="btn btn-primary">Submeter
                                <i class="icon-ok icon-white"></i></button>
                        </div>
                    </div>
                </fieldset>
            </form>
    	</div><!-- /.row well -->
	</div><!-- /.container-->
</div><!-- /.row -->

<#--render países-->
<#macro renderCountries>
    <div class="form-group">
        <label class="col-md-4 control-label" for="coutry">País</label>
        <div class="col-md-2">
            <select id="country" name="country" class="form-control">
                <#list countries as c>
                    <option value="${c.value}">${c.value?string?cap_first}</option>
                </#list>
            </select>
        </div>
    </div>
</#macro>

<#--render concelhos-->
<#macro renderRegions>
    <div class="form-group">
        <label class="col-md-4 control-label" for="coutry">Concelho</label>
        <div class="col-md-2">
            <select id="region" name="region" class="form-control">
                <#list regions as r>
                    <option value="${r.name}">${r.name?string?cap_first}</option>
                </#list>
            </select>
        </div>
    </div>
</#macro>

<#--render freguesias-->
<#macro renderParishes>
    <div class="form-group">
        <label class="col-md-4 control-label" for="coutry">Freguesias</label>
        <div class="col-md-2">
            <select id="parish" name="parish" class="form-control">
                <#list parishes as p>
                    <option value="${p.name}">${p.name?string?cap_first}</option>
                </#list>
            </select>
        </div>
    </div>
</#macro>

<#--render distritos-->
<#macro renderLocalities>
    <div class="form-group">
        <label class="col-md-4 control-label" for="coutry">Distrito</label>
        <div class="col-md-2">
            <select id="parish" name="parish" class="form-control">
                <#list localities as l>
                    <option value="${l.name}">${l.name?string?cap_first}</option>
                </#list>
            </select>
        </div>
    </div>
</#macro>

<#--render tipo de utilizador-->
<#macro renderUserType>
    <div class="form-group">
        <label class="col-md-4 control-label" for="type">Tipo</label>
        <div class="col-md-4">
            <#list userTypes as ut>
                <div class="radio">
                    <label for="${ut.value}">
                        <input type="radio" name="type" id="${ut.value}" value="${ut.value}" <#if (ut_index ==0)>checked="checked"</#if> >
                            ${ut.value?string?cap_first}
                    </label>
                </div>
            </#list>
        </div>
    </div>
</#macro>