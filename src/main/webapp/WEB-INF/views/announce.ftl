<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>
<#include "modules/header/header.ftl">
<div class="container page-content">
    <div class="row">
        <div class="span8">
            <div class="box-container">
                <div class="padding30">
                    <h2 class="page-title">Novo Anúncio</h2>
                        <div id="wizard">
                            <@renderNewAnnounceTabs />
                            <div>
                                <@renderFirstPanelFields />
                            </div>
                            <div>
                                <@renderSecondPanelFields />
                            </div>
                            <div>
                                <@renderThirdPanelFields />
                            </div>
                        </div>
                </div>
            </div>
        </div>
    </div>
</div>

    <!-- .span8 -->
    <#--<@renderAds />-->
    <!-- .row -->
    <#include "modules/footer/footer.ftl">
    <#include "footer.ftl">

<#macro renderNewAnnounceTabs>
<ol>
    <li>Large Paragraph</li>
    <li>Paragraph</li>
    <li>Unordered List</li>
</ol>
</#macro>


<#macro renderAds>
<div class="span4 widget">
<#--<div class="widget map box-container padding30">
                    <h3 class="widget-title">Get Directions</h3>
                    <iframe src="http://maps.google.it/maps?f=q&amp;source=s_q&amp;hl=it&amp;geocode=&amp;q=miami+beach+collins+ave+1220&amp;aq=&amp;sll=25.861386,-80.120888&amp;sspn=0.205136,0.347786&amp;ie=UTF8&amp;hq=&amp;hnear=1220+Collins+Ave,+Miami+Beach,+Miami-Dade,+Florida+33139,+Stati+Uniti&amp;t=m&amp;z=14&amp;ll=25.783255,-80.131265&amp;output=embed"></iframe>
                    <dl class="margin0">
                        <dt>Realto</dt>
                        <dd class="margin0">1680 Washington Avenue</dd>
                        <dd class="margin0">Miami Beach, FL 33139</dd>
                    </dl>
                </div>-->
</div>
<!-- .span4 -->
</#macro>

<#macro renderFirstPanelFields >
    <@renderPropertyKind />
    <@renderPropertyTitle />
    <@renderPropertyDescription /><#--TODO: work from here-->
    <@renderPropertyPrice />
    <@renderPropertyPriceNegotiable />
    <@renderPropertyPossibleExchange />
    <@renderPropertyState />
    <@renderPropertyUsefullArea />
    <@renderPropertyBruteArea />
    <@renderPropertyConstructionYear />
    <@renderPropertyCountryLocation />
    <@renderpropertyDistrict />
    <@renderPropertyRegion />
    <@renderPropertyParish />

</#macro>

<#macro renderSecondPanelFields>
    <@renderPropertyAddress />
    <@renderPropertyDoorNumber />
    <@renderPropertyZipCode />
    <@renderPropertyTipology />
</#macro>

<#macro renderThirdPanelFields>

</#macro>

<#-- Property District-->
<#macro renderpropertyDistrict >
    <div class="form-group">
        <label class="col-md-4 control-label" for="selectbasic">Distrito</label>
        <div class="col-md-4">
            <select id="selectbasic" name="selectbasic" class="form-control">
                <option value="1">Option one</option>
                <option value="2">Option two</option>
            </select>
        </div>
    </div>
</#macro>

<#macro renderPropertyKind>
    <div class="form-group">
        <label class="col-md-4 control-label" for="category">
            <@spring.messageText "ANNOUNCES.CATEGORY", "Categoria"/>
        </label>
        <select class="span4 select property-kind" name="type">
            <option disabled="disabled" selected="selected" value="null"/>
            ---<@spring.messageText "PROPERTY.KIND", "Tipo de Imóvel"/>---

            <#list propertyKinds as pk>
                <option value="${pk.value}"><@spring.messageText "${(pk.value)?string?upper_case}", "${pk.value}"/></option>
            </#list>
        </select>
    </div>
</#macro>

<#macro renderPropertyTitle>
    <div class="form-group">
        <label class="col-md-4 control-label" for="textinput">
            <@spring.messageText "ANNOUNCES.TITLE", "Título"/>
        </label>
        <div class="col-md-4 property-title">
            <input id="announces-title" name="announces-title" type="text"
                   placeholder="<@spring.messageText "ANNOUNCES.TITLE", "Título"/>"
                   class="form-control input-md span4 property-kind" required="true">
        </div>
    </div>
</#macro>

<#macro renderPropertyDescription>
    <div class="form-group">
        <label class="col-md-4 control-label" for="textinput">Descrição</label>
        <div class="col-md-4">
            <input id="textinput" name="textinput" type="text" placeholder="placeholder"
                   class="form-control input-md">
        </div>
    </div>
</#macro>

<#macro renderPropertyPrice>
    <div class="form-group">
        <label class="col-md-4 control-label" for="price">Preço</label>
        <div class="col-md-4">
            <input id="price" name="price" type="text" placeholder="placeholder" class="form-control input-md">
        </div>
    </div>
</#macro>

<#macro renderPropertyPriceNegotiable>
    <div class="form-group">
        <label class="col-md-4 control-label" for="radios">Negociável?</label>

        <div class="col-md-4">
            <div class="radio">
                <label for="radios-0">
                    <input type="radio" name="radios" id="radios-0" value="1" checked="checked">
                    Sim
                </label>
            </div>
            <div class="radio">
                <label for="radios-1">
                    <input type="radio" name="radios" id="radios-1" value="2">
                    Não
                </label>
            </div>
        </div>
    </div>
</#macro>

<#macro renderPropertyState>
    <div class="form-group">
        <label class="col-md-4 control-label" for="selectbasic">Estado</label>

        <div class="col-md-4">
            <select id="selectbasic" name="selectbasic" class="form-control">
                <option value="1">Novo</option>
                <option value="2">Usado</option>
                <option value="">Restaurado</option>
            </select>
        </div>
    </div>
</#macro>

<#macro renderPropertyUsefullArea>
    <div class="form-group">
        <label class="col-md-4 control-label" for="area">Área Útil</label>
        <div class="col-md-4">
            <input id="area" name="area" type="text" placeholder="placeholder" class="form-control input-md">
        </div>
    </div>
</#macro>

<#macro renderPropertyBruteArea>
    <div class="form-group">
        <label class="col-md-4 control-label" for="textinput">Área Bruta</label>
        <div class="col-md-4">
            <input id="textinput" name="textinput" type="text" placeholder="placeholder" class="form-control input-md">
        </div>
    </div>
</#macro>

<#macro renderPropertyTipology>
    <div class="form-group">
        <label class="col-md-4 control-label" for="selectbasic">Tipologia</label>
        <div class="col-md-4">
            <select id="selectbasic" name="selectbasic" class="form-control">
                <option value="1">T0</option>
                <option value="2">T0+1</option>
                <option value="">T1</option>
                <option value="">T1+1</option>
                <option value="">T2</option>
                <option value="">T2+1</option>
                <option value="">T3</option>
                <option value="">T3+1</option>
            </select>
        </div>
    </div>
</#macro>

<#macro renderPropertyConstructionYear>
    <div class="form-group">
        <label class="col-md-4 control-label" for="textinput">Ano de Construção</label>
        <div class="col-md-4">
            <input id="textinput" name="textinput" type="text" placeholder="placeholder" class="form-control input-md">
        </div>
    </div>
</#macro>

<#macro renderPropertyCountryLocation>
    <div class="form-group">
        <label class="col-md-4 control-label" for="selectbasic">País</label>
        <div class="col-md-4">
            <select id="selectbasic" name="selectbasic" class="form-control">
                <option value="1">Option one</option>
                <option value="2">Option two</option>
            </select>
        </div>
    </div>
</#macro>

<#macro renderPropertyEnergyCertificate>
    <div class="form-group">
        <label class="col-md-4 control-label" for="selectbasic">Certificado Energético</label>
        <div class="col-md-4">
            <select id="selectbasic" name="selectbasic" class="form-control">
                <option value="1">A+</option>
                <option value="2">A</option>
                <option value="">B</option>
                <option value="">C</option>
                <option value="">D</option>
                <option value="">E</option>
                <option value="">F</option>
            </select>
        </div>
    </div>
</#macro>

<#macro renderPropertyParish>
    <div class="form-group">
        <label class="col-md-4 control-label" for="selectbasic">Freguesia</label>
        <div class="col-md-4">
            <select id="selectbasic" name="selectbasic" class="form-control">
                <option value="1">Option one</option>
                <option value="2">Option two</option>
            </select>
        </div>
    </div>
</#macro>

<#macro renderPropertyAddress>
    <div class="form-group">
        <label class="col-md-4 control-label" for="textinput">Morada</label>
        <div class="col-md-4">
            <input id="textinput" name="textinput" type="text" placeholder="placeholder" class="form-control input-md">
        </div>
    </div>
</#macro>

<#macro renderPropertyBathroomsNumber>
    <div class="form-group">
        <label class="col-md-4 control-label" for="selectbasic">Casas de Banho</label>

        <div class="col-md-4">
            <select id="selectbasic" name="selectbasic" class="form-control">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="">3</option>
                <option value="">4</option>
                <option value="">5</option>
                <option value="">6</option>
                <option value="">7</option>
                <option value="">8</option>
                <option value="">9</option>
                <option value="">10</option>
            </select>
        </div>
    </div>
</#macro>

<#macro renderPropertyGarage>
    <div class="form-group">
        <label class="col-md-4 control-label" for="selectbasic">Garagem</label>

        <div class="col-md-4">
            <select id="selectbasic" name="selectbasic" class="form-control">
                <option value="1">1 Carro</option>
                <option value="2">2 Carros</option>
                <option value="">3 ou mais carros</option>
            </select>
        </div>
    </div>
</#macro>

<#macro renderPropertyDoorNumber>
    <div class="form-group">
        <label class="col-md-4 control-label" for="textinput">Numero</label>
        <div class="col-md-4">
            <input id="textinput" name="textinput" type="text" placeholder="placeholder" class="form-control input-md">
        </div>
    </div>
</#macro>

<#macro renderPropertyPossibleExchange>
    <div class="form-group">
        <label class="col-md-4 control-label" for="permuta">Possiblidade de Permuta?</label>

        <div class="col-md-4">
            <div class="radio">
                <label for="permuta-0">
                    <input type="radio" name="permuta" id="permuta-0" value="1" checked="checked">
                    Sim
                </label>
            </div>
            <div class="radio">
                <label for="permuta-1">
                    <input type="radio" name="permuta" id="permuta-1" value="2">
                    Não
                </label>
            </div>
        </div>
    </div>
</#macro>

<#macro renderPropertyExtras>
    <!-- Multiple Checkboxes (inline) -->
    <div class="form-group">
        <label class="col-md-4 control-label" for="checkboxes">Aquecimento Central</label>

        <div class="col-md-4">
            <label class="checkbox-inline" for="checkboxes-0">
                <input type="checkbox" name="checkboxes" id="checkboxes-0" value="1">
                Sim
            </label>
        </div>
    </div>

    <!-- Multiple Checkboxes (inline) -->
    <div class="form-group">
        <label class="col-md-4 control-label" for="checkboxes">Lareira</label>

        <div class="col-md-4">
            <label class="checkbox-inline" for="checkboxes-0">
                <input type="checkbox" name="checkboxes" id="checkboxes-0" value="1">
                Sim
            </label>
        </div>
    </div>

    <!-- Multiple Checkboxes (inline) -->
    <div class="form-group">
        <label class="col-md-4 control-label" for="checkboxes">Imóvel do Banco</label>

        <div class="col-md-4">
            <label class="checkbox-inline" for="checkboxes-0">
                <input type="checkbox" name="checkboxes" id="checkboxes-0" value="1">
                Sim
            </label>
        </div>
    </div>

    <!-- Multiple Checkboxes (inline) -->
    <div class="form-group">
        <label class="col-md-4 control-label" for="checkboxes">Varanda</label>

        <div class="col-md-4">
            <label class="checkbox-inline" for="checkboxes-0">
                <input type="checkbox" name="checkboxes" id="checkboxes-0" value="1">
                Sim
            </label>
        </div>
    </div>

    <!-- Multiple Checkboxes (inline) -->
    <div class="form-group">
        <label class="col-md-4 control-label" for="checkboxes">Vista de Serra</label>

        <div class="col-md-4">
            <label class="checkbox-inline" for="checkboxes-0">
                <input type="checkbox" name="checkboxes" id="checkboxes-0" value="1">
                Sim
            </label>
        </div>
    </div>

    <!-- Multiple Checkboxes (inline) -->
    <div class="form-group">
        <label class="col-md-4 control-label" for="checkboxes">Vista de Mar</label>

        <div class="col-md-4">
            <label class="checkbox-inline" for="checkboxes-0">
                <input type="checkbox" name="checkboxes" id="checkboxes-0" value="1">
                Sim
            </label>
        </div>
    </div>

    <!-- Multiple Checkboxes (inline) -->
    <div class="form-group">
        <label class="col-md-4 control-label" for="checkboxes">Condomínio Fechado</label>

        <div class="col-md-4">
            <label class="checkbox-inline" for="checkboxes-0">
                <input type="checkbox" name="checkboxes" id="checkboxes-0" value="1">
                Sim
            </label>
        </div>
    </div>

    <!-- Multiple Checkboxes (inline) -->
    <div class="form-group">
        <label class="col-md-4 control-label" for="checkboxes">Alarme</label>

        <div class="col-md-4">
            <label class="checkbox-inline" for="checkboxes-0">
                <input type="checkbox" name="checkboxes" id="checkboxes-0" value="1">
                Sim
            </label>
        </div>
    </div>

    <!-- Multiple Checkboxes (inline) -->
    <div class="form-group">
        <label class="col-md-4 control-label" for="checkboxes">Elevador</label>

        <div class="col-md-4">
            <label class="checkbox-inline" for="checkboxes-0">
                <input type="checkbox" name="checkboxes" id="checkboxes-0" value="1">
                Sim
            </label>
        </div>
    </div>

    <!-- Multiple Checkboxes (inline) -->
    <div class="form-group">
        <label class="col-md-4 control-label" for="checkboxes">Som Ambiente</label>

        <div class="col-md-4">
            <label class="checkbox-inline" for="checkboxes-0">
                <input type="checkbox" name="checkboxes" id="checkboxes-0" value="1">
                Sim
            </label>
        </div>
    </div>
</#macro>

<#macro renderPropertyRegion>
    <div class="form-group">
        <label class="col-md-4 control-label" for="selectbasic">Concelho</label>
        <div class="col-md-4">
            <select id="selectbasic" name="selectbasic" class="form-control">
                <option value="1">Option one</option>
                <option value="2">Option two</option>
            </select>
        </div>
    </div>
</#macro>

<#macro renderPropertyZipCode>
    <div class="form-group">
        <label class="col-md-4 control-label" for="textinput">Código Postal</label>
        <div class="col-md-4">
            <input id="textinput" name="textinput" type="text" placeholder="placeholder" class="form-control input-md">
        </div>
    </div>
</#macro>

<#macro renderImageInput>
    <!-- File Button -->
    <div class="form-group">
        <label class="col-md-4 control-label" for="filebutton">Fotografias</label>
        <div class="col-md-4">
            <input id="filebutton" name="filebutton" class="input-file" type="file">
        </div>
    </div>
</#macro>

<#macro renderSubmitButton>
    <!-- Button -->
    <div class="form-group">
        <label class="col-md-4 control-label" for="singlebutton"></label>
        <div class="col-md-4">
            <button id="singlebutton" name="singlebutton" class="btn btn-primary">Submeter Imóvel</button>
        </div>
    </div>
</#macro>