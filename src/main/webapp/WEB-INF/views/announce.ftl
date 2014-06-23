<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>
<#include "modules/header/header.ftl">
<div class="container page-content">
    <div class="row">
        <div class="span8">
            <div class="box-container">
                <div class="padding30">
                    <h2 class="page-title">
                        <@spring.messageText "ANNOUNCES.NEW.ANNOUNCE", "Novo Anúncio"/>
                    </h2>
                        <div id="wizard">
                            <@renderNewAnnounceTabs />
                            <div class="announces-first-panel">
                                 <@renderFirstPanelFields />
                            </div>
                            <div class="announces-second-panel">
                                <@renderSecondPanelFields />
                            </div>
                            <div class="announces-third-panel">
                                <@renderThirdPanelFields />
                            </div>
                            <div class="announces-fourth-panel">
                                <@renderFourthPanelFields />
                            </div>
                            <div class="announces-fourth-panel">
                                <@renderFifthPanelFields />
                            </div>
                        </div>
                </div>
            </div>
        </div>
        <!-- .span8 -->
        <@renderInstantPreview />
    </div>
    <!-- .row -->
</div>

    <#---->

    <#include "modules/footer/footer.ftl">
    <#include "footer.ftl">

<#macro renderNewAnnounceTabs>
    <ol>
        <li><@spring.messageText "ANNOUNCES.PROPERTY.HIGHLIGHT", "Destaques"/></li>
        <li><@spring.messageText "ANNOUNCES.PROPERTY.DETAIL", "Detalhe"/></li>
        <li><@spring.messageText "ANNOUNCES.PROPERTY.IMAGES", "Imagens"/></li>
        <li><@spring.messageText "ANNOUNCES.PROPERTY.PREVIEW", "Pré-visualização"/></li>
        <li><@spring.messageText "ANNOUNCES.PROPERTY.ORDER", "Encomendar"/></li>
    </ol>
</#macro>

<#macro renderInstantPreview>
    <div class="span4 widget">
        <div class="widget box-container padding010">
            <h3 class="announce-preview-title">
                <@spring.messageText "ANNOUNCES.PROPERTY.PREVIEW", "Pré-visualização"/>
            </h3>
            <div class="item active">
                <ul class="thumbnails">
                    <@renderPropertyItem/>
                </ul>
            </div><!-- .item -->
        </div>
    </div>
</#macro>

<#macro renderPropertyItem>
<li class="span3">
    <div class="holder">
        <a class="overlay" title="" href="/property/">
            <span class="more"></span>
                <img alt="image" src="http://placehold.it/800x454" class="media-object" />
        <#--<img alt="image" src="<@spring.url '/static/resources/realto-html/images/04.jpg'/>" class="media-object" />-->
        </a>
            <span class="prop-tag">
                <#--<@spring.messageText "FOR.${p.businessType?upper_case}", "${p.businessType?cap_first}"/>-->
            </span>
        <div class="prop-info">
            <h3 class="announce-preview-prop-title"></h3>
            <ul class="more-info clearfix">
                <li class="info-label clearfix">
                    <span class="pull-left"></span>
                <#--${p.tipology!""}
                ${p.vilageTipology!""}
                -->    <@spring.messageText "IN", "em"/>
                    <span class="qty pull-right"></span>
                </li>
                <li class="info-label clearfix">
                    <span class="pull-left">&euro;</span>
                <#-- <span class="qty pull-right">2</span>-->
                </li>
                <li class="info-label clearfix">
                    <span class="pull-left">
                        <#--<@renderFBLikeBtn p />-->
                    </span>
                    <span class="pull-right">
                       <#--<@renderTwitterBtn p />-->
                    </span>
                </li>
            </ul>
        </div>
    </div>
</li>
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
    <@renderPropertyDescription />
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
    <@renderPropertyBathroomsNumber />
    <@renderPropertyEnergyCertificate />
    <@renderPropertyGarage />
    <@renderPropertyExtras />
</#macro>

<#macro renderThirdPanelFields>
    <@renderImagesInput />
</#macro>

<#macro renderFourthPanelFields>

</#macro>

<#macro renderFifthPanelFields>

</#macro>

<#macro renderpropertyDistrict >
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-district">
            <@spring.messageText "ANNOUNCES.PROPERTY.DISTRICT", "Distrito"/>
        </label>
        <select id="property-district" class="span4 select property-district" name="property-district">
            <option disabled="disabled" selected="selected" value="null"/>
            ---<@spring.messageText "ANNOUNCES.PROPERTY.DISTRICT", "Distrito"/>---
            <#list districts as d>
                <option value="${d.districtId}">${d.districtName?string?cap_first}</option>
            </#list>
        </select>
    </div>
</#macro>

<#macro renderPropertyKind>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-kind">
            <@spring.messageText "ANNOUNCES.PROPERTY.CATEGORY", "Categoria"/>
        </label>
        <select id="property-kind" class="span2 select property-kind" name="property-kind">
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
        <label class="col-md-4 control-label" for="property-title">
            <@spring.messageText "ANNOUNCES.PROPERTY.TITLE", "Título"/>
        </label>
        <div class="col-md-4 property-title">
            <input id="property-title" name="property-title" type="text"
                   placeholder="<@spring.messageText "ANNOUNCES.PROPERTY.TITLE", "Título"/>"
                   class="form-control input-md span4 property-kind" required="true" />
        </div>
    </div>
</#macro>

<#macro renderPropertyDescription>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-description">
            <@spring.messageText "ANNOUNCES.PROPERTY.SHORT.DESCRIPTION", "Descrição"/>
        </label>
        <span id="property-description-feedback"></span>
        <@spring.messageText "ANNOUNCES.PROPERTY.DESCRIPTION.REMAINING.CHARS", "carateres restantes"/>

        <div class="col-md-4">
            <textarea rows="3" id="property-description" name="property-description"
                   class="form-control span4 property-description" wrap="physical"
                   maxlength="99"></textarea><#--TODO: correct maxlength value-->
        </div>
    </div>
</#macro>

<#macro renderPropertyPrice>
    <div class="form-group">
        <label class="col-md-4 control-label" for="price">
            <@spring.messageText "ANNOUNCES.PROPERTY.PRICE", "Preço"/>
        </label>
        <div class="col-md-4">
            <input id="price" name="price" type="number"
                   placeholder="<@spring.messageText "ANNOUNCES.PROPERTY.PRICE", "Preço"/>"
                   class="form-control span2 input-md property-price" />
        </div>
    </div>
</#macro>

<#macro renderPropertyPriceNegotiable>
    <div class="form-group">
        <label class="col-md-4 control-label" for="price-negotiable-options">
            <@spring.messageText "ANNOUNCES.PROPERTY.PRICE.NEGOTIABLE", "Preço Negociável"/>?
        </label>

        <div class="col-md-4">
            <div class="radio">
                <label for="price-negotiable-option-yes">
                    <input type="radio" name="price-negotiable-options" id="price-negotiable-option-yes" value="1" checked="checked" />
                    <@spring.messageText "ANNOUNCES.YES", "Sim"/>
                </label>
            </div>
            <div class="radio">
                <label for="price-negotiable-option-no">
                    <input type="radio" name="price-negotiable-options" id="price-negotiable-option-no" value="2" />
                    <@spring.messageText "ANNOUNCES.NO", "Não"/>
                </label>
            </div>
        </div>
    </div>
</#macro>

<#macro renderPropertyState>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-state">
            <@spring.messageText "ANNOUNCES.PROPERTY.STATE", "Estado da Propriedade"/>
        </label>

        <div class="col-md-4">
            <select id="property-state" name="property-state" class="span2 select property-state">
                <option disabled="disabled" selected="selected" value="null"/>
                ---<@spring.messageText "PROPERTY.KIND", "Tipo de Imóvel"/>---
                <#list propertyStatus as ps>
                    <option value="${ps.value}"><@spring.messageText "ANNOUNCES.PROPERTY.STATE.${(ps.value)?string?upper_case}", "${ps.value}"/></option>
                </#list>
            </select>
        </div>
    </div>
</#macro>

<#macro renderPropertyUsefullArea>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-usefull-area">
            <@spring.messageText "ANNOUNCES.PROPERTY.USEFULL.AREA", "Área Útil"/> m&sup2;
        </label>
        <div class="col-md-4 property-usefull-area">
            <input id="property-usefull-area" name="property-usefull-area" type="number"
                   placeholder="<@spring.messageText "ANNOUNCES.PROPERTY.USEFULL.AREA", "Área Útil"/>"
                   class="form-control input-md span2 property-usefull-area" />
        </div>
    </div>
</#macro>

<#macro renderPropertyBruteArea>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-brute-area">
            <@spring.messageText "ANNOUNCES.PROPERTY.BRUTE.AREA", "Área Bruta"/> m&sup2;
        </label>
        <div class="col-md-4 property-brute-area">
            <input id="property-brute-area" name="property-brute-area" type="number"
                   placeholder="<@spring.messageText "ANNOUNCES.PROPERTY.BRUTE.AREA", "Área Bruta"/>"
                   class="form-control input-md span2 property-brute-area" />
        </div>
    </div>
</#macro>

<#macro renderPropertyTipology>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-tipology">
            <@spring.messageText "ANNOUNCES.PROPERTY.TIPOLOGY", "Número Quartos"/>
        </label>

        <div class="col-md-4">
            <select id="property-tipology" name="property-tipology" class="span2 select property-tipology">
                <option disabled="disabled" selected="selected" value="null"/>
                ---<@spring.messageText "ANNOUNCES.PROPERTY.TIPOLOGY", "Número Quartos"/>---
                <#local x=12>
                <#list 1..x as i>
                    <option value="${i}"> ${i}</option>
                </#list>
            </select>
        </div>
    </div>
</#macro>

<#macro renderPropertyConstructionYear>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-construction-year">
            <@spring.messageText "ANNOUNCES.PROPERTY.CONSTRUCTION.YEAR", "Ano de Construção"/>
        </label>
        <div class="col-md-4 property-construction-year">
            <input id="property-construction-year" name="property-construction-year" type="text"
                   pattern="\d{4}"
                   placeholder="<@spring.messageText "ANNOUNCES.PROPERTY.CONSTRUCTION.YEAR", "Ano de Construção"/>"
                   class="form-control input-md span2 property-construction-year" />
        </div>
    </div>
</#macro>

<#macro renderPropertyCountryLocation>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-country-location">
            <@spring.messageText "ANNOUNCES.PROPERTY.COUNTRY.LOCATION", "País"/>
        </label>
        <div class="col-md-4 property-country-location">
            <select id="property-country-location" name="property-country-location" class="span2 select property-country-location">
                <option disabled="disabled" selected="selected" value="null"/>
                ---<@spring.messageText "ANNOUNCES.PROPERTY.COUNTRY", "País"/>---
                <#list propertyLocalizationCountry as plc>
                    <option value="${plc.value}"><@spring.messageText "ANNOUNCES.PROPERTY.LOCALIZATION.${(plc.value)?string?upper_case}", "${plc.value}"/></option>
                </#list>
            </select>
        </div>
    </div>
</#macro>

<#macro renderPropertyEnergyCertificate>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-energy-efficiency">
            <@spring.messageText "ANNOUNCES.PROPERTY.ENERGY.EFFICIENCY", "Certificado Energético"/>
        </label>
        <div class="col-md-4 property-energy-efficiency">
            <select id="property-energy-efficiency" name="property-energy-efficiency" class="span2 select property-energy-efficiency">
                <option disabled="disabled" selected="selected" value="null"/>
                ---<@spring.messageText "ANNOUNCES.PROPERTY.ENERGY.EFFICIENCY", "Certificado Energéticos"/>---
                <#list energyEfficiencyValues as eev>
                    <option value="${eev.value}">${(eev.value)?string?upper_case}</option>
                </#list>
            </select>
        </div>
    </div>
</#macro>

<#macro renderPropertyParish>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-parish">
            <@spring.messageText "ANNOUNCES.PROPERTY.PARISH", "Freguesia"/>
        </label>
        <select id="property-parish" class="span4 select property-parish" name="property-parish">
            <option disabled="disabled" selected="selected" value="null"/>
            ---<@spring.messageText "ANNOUNCES.PROPERTY.PARISH", "Freguesia"/>---
            <#list parishes as p>
                <option value="${p.parishId}">${p.parishName?string?cap_first}</option>
            </#list>
        </select>
    </div>
</#macro>

<#macro renderPropertyAddress>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-address">
            <@spring.messageText "ANNOUNCES.PROPERTY.ADDRESS", "Endereço"/>
        </label>
        <div class="col-md-4">
            <textarea rows="3" id="property-address" name="property-address"
                      class="form-control span4 property-address" >
            </textarea>
        </div>
    </div>
</#macro>

<#macro renderPropertyBathroomsNumber>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-bathrooms-number">
            <@spring.messageText "ANNOUNCES.PROPERTY.BATHROOM.NUMBER", "Número Casas de Banho"/>
        </label>

        <div class="col-md-4">
            <select id="property-bathrooms-number" name="property-bathrooms-number" class="span3 select property-bathrooms-number">
                <option disabled="disabled" selected="selected" value="null"/>
                ---<@spring.messageText "ANNOUNCES.PROPERTY.BATHROOM.NUMBER", "Número Casas de Banho"/>---
                <#local x=6>
                <#list 1..x as i>
                    <option value="${i}"> ${i}</option>
                </#list>
            </select>
        </div>
    </div>
</#macro>

<#macro renderPropertyGarage>
    <div class="form-group">
        <label class="col-md-4 control-label" for="selectbasic">
            <@spring.messageText "ANNOUNCES.PROPERTY.EXTRAS.GARAGE", "Garagem"/>
        </label>

        <div class="col-md-4">
            <select id="selectbasic" name="selectbasic" class="form-control">
                <option value="1">
                    <@spring.messageText "ANNOUNCES.PROPERTY.GARAGE.ONE.CAR", "1 carro"/>
                </option>
                <option value="2">
                    <@spring.messageText "ANNOUNCES.PROPERTY.GARAGE.TWO.CARS", "2 carros"/>
                </option>
                <option value="3_or_more">
                    <@spring.messageText "ANNOUNCES.PROPERTY.GARAGE.THREEORMORE.CARS", "3 ou mais carros"/>
                </option>
            </select>
        </div>
    </div>
</#macro>

<#macro renderPropertyDoorNumber>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-door-number">
            <@spring.messageText "ANNOUNCES.PROPERTY.DOOR.NUMBER", "Número"/>
        </label>
        <div class="col-md-4">
            <input id="property-door-number" name="property-door-number" type="number"
                   placeholder="<@spring.messageText "ANNOUNCES.PROPERTY.DOOR.NUMBER", "Número"/>"
                   class="form-control input-md span2 property-door-number">
        </div>
    </div>
</#macro>

<#macro renderPropertyPossibleExchange>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-possible-exchange">
            <@spring.messageText "ANNOUNCES.PROPERTY.POSSIBLE.EXCHANGE", "Possibilidade de Permuta"/>?
        </label>

        <div class="col-md-4">
            <div class="radio">
                <label for="permuta-0">
                    <input type="radio" name="permuta" id="permuta-0" value="1" checked="checked">
                    <@spring.messageText "ANNOUNCES.YES", "Sim"/>
                </label>
            </div>
            <div class="radio">
                <label for="permuta-1">
                    <input type="radio" name="permuta" id="permuta-1" value="2">
                    <@spring.messageText "ANNOUNCES.NO", "Não"/>
                </label>
            </div>
        </div>
    </div>
</#macro>

<#macro renderTableRowWithCheckboxes>
    <tr>
        <td>
            <@renderYesCheckbox />
        </td>
        <td>
            <@renderYesCheckbox />
        </td>
    </tr>
</#macro>
<#macro renderYesCheckbox>
    <label class="checkbox" for="checkboxes-0">
        <input type="checkbox" name="checkboxes" id="checkboxes-0" value="1">
        <@spring.messageText "ANNOUNCES.YES", "Sim"/>
    </label>
</#macro>

<#macro renderPropertyExtras>
    <table class="table table-striped table-hover span4" style=" float: inherit;margin-left: 0px; ">
        <thead>
        </thead>
        <tbody>
            <tr>
                <th>
                    <@spring.messageText "ANNOUNCES.PROPERTY.EXTRAS.HEATING", "Aquecimento Central"/>
                </th>
                <th>
                    <@spring.messageText "ANNOUNCES.PROPERTY.EXTRAS.FIREPLACE", "Lareira"/>
                </th>
            </tr>
            <@renderTableRowWithCheckboxes />
            <tr>
                <th>
                    <@spring.messageText "ANNOUNCES.PROPERTY.EXTRAS.BALCONY", "Varanda"/>
                </th>
                <th>
                    <@spring.messageText "ANNOUNCES.PROPERTY.EXTRAS.MOUNTAIN.VIEW", "Vista de Serra"/>
                </th>
            </tr>
            <@renderTableRowWithCheckboxes />
            <tr>
                <th>
                    <@spring.messageText "ANNOUNCES.PROPERTY.EXTRAS.SEA.VIEW", "Vista de Mar"/>
                </th>
                <th>
                    <@spring.messageText "ANNOUNCES.PROPERTY.EXTRAS.ALARM", "Alarme"/>
                </th>
            </tr>
            <@renderTableRowWithCheckboxes />
            <tr>
                <th>
                    <@spring.messageText "ANNOUNCES.PROPERTY.EXTRAS.ELEVATOR", "Elevador"/>
                </th>
                <th>
                    <@spring.messageText "ANNOUNCES.PROPERTY.EXTRAS.ALARM", "Alarme"/>
                </th>
            </tr>
            <@renderTableRowWithCheckboxes />
            <tr>
                <th>
                    <@spring.messageText "ANNOUNCES.PROPERTY.EXTRAS.GATED.COMMUNITY", "Condomínio Fechado"/>
                </th>
                <th>
                    <@spring.messageText "ANNOUNCES.PROPERTY.EXTRAS.NATURAL.GAS", "Gás Natural"/>
                </th>
            </tr>
                <@renderTableRowWithCheckboxes />
        </tbody>
    </table>
</#macro>

<#macro renderPropertyRegion>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-region">
            <@spring.messageText "ANNOUNCES.PROPERTY.REGION", "Concelho"/>
        </label>
        <select id="property-region" class="span4 select property-region" name="property-region">
            <option disabled="disabled" selected="selected" value="null"/>
            ---<@spring.messageText "ANNOUNCES.PROPERTY.REGION", "Concelho"/>---
            <#list regions as r>
                <option value="${r.regionId}">${r.regionName?string?cap_first}</option>
            </#list>
        </select>
    </div>
</#macro>

<#macro renderPropertyZipCode>
    <div class="form-group">
        <label class="col-md-4 control-label" for="property-zip-code">
            <@spring.messageText "ANNOUNCES.PROPERTY.ZIP.CODE", "Código Postal"/>
        </label>
        <div class="col-md-4 property-zip-code">
            <input id="property-zip-code" name="property-zip-code" type="text"
                   placeholder="<@spring.messageText "ANNOUNCES.PROPERTY.ZIP.CODE", "Código Postal"/>"
                   class="form-control input-md span2 property-zip-code" required />
        </div>
    </div>
</#macro>

<#macro renderImagesInput>
    <div class="form-group">
        <label class="col-md-4 control-label" for="filebutton">
            <@spring.messageText "ANNOUNCES.PROPERTY.PHOTOS", "Fotografias"/>
        </label>
        <div class="col-md-4">
            <@renderImageUploadArea />
            <input id="filebutton" name="filebutton" class="input-file" type="file" />
        </div>
    </div>
</#macro>

<#macro renderSubmitButton>
    <div class="form-group">
        <label class="col-md-4 control-label" for="singlebutton">

        </label>
        <div class="col-md-4">
            <button id="singlebutton" name="singlebutton" class="btn btn-primary">
                Submeter Imóvel
            </button>
        </div>
    </div>
</#macro>

<#macro renderImageUploadArea>
<div class="upload_section">
    <form action="/share" class="share_form" method="POST">
        <div class="drag_area">
            <div class="drag_inner">
              <span>
                Drop Photo Here
                <span class="small">or</span>
              </span>
                <div class="upload_button_holder">
                    <input class="select_files" type="submit" value="Select Photo">
                    <input class="cloudinary-fileupload"
                           data-cloudinary-field="photo_id"
                           data-form-data="{&quot;timestamp&quot;:1403389689,&quot;transformation&quot;:&quot;c_limit,h_1200,w_1200&quot;,&quot;callback&quot;:&quot;http://edgedemo.cloudinary.com/cloudinary_cors.html&quot;,&quot;image_metadata&quot;:1,&quot;eager&quot;:&quot;c_fill,g_face,h_133,r_20,w_200/fl_relative,g_center,l_logo_watermark,o_40,w_0.9|c_fill,e_sepia,g_face,h_133,r_20,w_200/fl_relative,g_center,l_logo_watermark,o_40,w_0.9|c_fill,e_improve,g_face,h_133,r_20,w_200/fl_relative,g_center,l_logo_watermark,o_40,w_0.9|c_fill,e_hue:70,g_face,h_133,r_20,w_200/e_blue:40/fl_relative,g_center,l_logo_watermark,o_40,w_0.9|c_limit,h_600,w_600&quot;,&quot;signature&quot;:&quot;5a2f6fd6a9c0486f33831b22aaeccfbd176176db&quot;,&quot;api_key&quot;:&quot;584952392728183&quot;}"
                           data-url="https://api.cloudinary.com/v1_1/hzxyensd5/image/upload" name="file" type="file">
                </div>
            </div>
        </div>
        <div class="upload_progress">
            <span>Uploading...</span>
            <div class="progress_bar">
                <div class="completed" style="width: 100%;"></div>
            </div>
        </div>
        <div class="processing_progress">
            <span>Processing...</span>
            <img alt="Processing..." height="32" src="/ajax-loader.gif" width="32">
        </div>
        <div class="share_details_section">
            <ul class="kind_selection">
                <li class="natural">
                    <label for="kind_field_natural">
                        <span class="name">Natural</span>
                        <span class="image"></span>
                    </label>
                    <input checked="" id="kind_field_natural" name="kind" type="radio" value="natural">
                </li>
                <li class="sepia">
                    <label for="kind_field_sepia">
                        <span class="name">Sepia</span>
                        <span class="image"></span>
                    </label>
                    <input id="kind_field_sepia" name="kind" type="radio" value="sepia">
                </li>
                <li class="improved">
                    <label for="kind_field_improved">
                        <span class="name">Improved</span>
                        <span class="image"></span>
                    </label>
                    <input id="kind_field_improved" name="kind" type="radio" value="improved">
                </li>
                <li class="blue">
                    <label for="kind_field_blue">
                        <span class="name">Blue</span>
                        <span class="image"></span>
                    </label>
                    <input id="kind_field_blue" name="kind" type="radio" value="blue">
                </li>
            </ul>
            <input class="model_field" name="model" type="hidden" value="">
            <input class="taken_at_field" name="taken_at" type="hidden" value="">
            <input type="submit" value="Share Photo">
        </div>
    </form>
</div>
</#macro>
