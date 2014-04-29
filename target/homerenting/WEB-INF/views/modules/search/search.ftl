<div id="home-search-container">
    <div class="container">
        <div class="row">
            <div class="span12">
                <div class="widget pull-right">
                    <div class="row">
                        <div class="span12 head-container">
                            <div class="row">

                               <#--<div class="span8 hidden-phone">
                                    <h2 class="head-title">Welcome to Realto</h2>
                                    <p class="head-message"><strong>Realto xHTML/CSS Template is The Best Solution To Sell House Online.</strong><br />
                                        This template is appropriate for Real Estate Company, who need to do their business online via websites.</p>
                                    <a class="btn btn-large btn-realto span3 header-cta" href="#" title="Buy It Now">Buy It Now!</a>
                                </div>-->

                                <div class="span4">
                                    <div class="search-form">
                                        <p><@spring.messageText "FIND.YOUR.NEW.HOME", "Encontre uma nova Casa"/></p>
                                        <form action="results" class="row-fluid" method="GET">

                                            <@renderDistricts />

                                            <@renderRegions />

                                            <@renderPropertyKind />

                                            <@renderStatus />


                                            <select class="span6 select pull-left" name="price-from">
                                                <option><@spring.messageText "PRICE.FROM", "Preço desde"/></option>
                                                <option value="#"><@spring.messageText "FROM", "desde"/> $100.000</option>
                                                <option value="#"><@spring.messageText "FROM", "desde"/> $200.000</option>
                                                <option value="#"><@spring.messageText "FROM", "desde"/> $300.000</option>
                                                <option value="#"><@spring.messageText "FROM", "desde"/> $400.000</option>
                                                <option value="#"><@spring.messageText "FROM", "desde"/> $500.000</option>
                                            </select>
                                            <select class="span6 select pull-right" name="price-to">
                                                <option><@spring.messageText "PRICE.TO", "Preço até"/></option>
                                                <option value="#"><@spring.messageText "TO", "até"/> $100.000</option>
                                                <option value="#"><@spring.messageText "TO", "até"/> $200.000</option>
                                                <option value="#"><@spring.messageText "TO", "até"/> $300.000</option>
                                                <option value="#"><@spring.messageText "TO", "até"/> $400.000</option>
                                                <option value="#"><@spring.messageText "TO", "até"/> $500.000</option>
                                            </select>
                                            <div class="clearfix">
                                                <button class="btn pull-right span6 btn-realto-form btn-large" type="submit"><@spring.messageText "SEARCH", "Pesquisar"/></button>
                                            </div>
                                        </form>
                                    </div>
                                    <!-- .search-form -->
                                </div>
                                <!-- .span4 -->
                            </div>
                        </div>
                    </div>
                    <!-- .row -->
                </div>
                <!-- .search-holder -->
            </div>
            <!-- .span12 -->
        </div>
        <!-- .row -->
    </div>
    <!-- .container -->
</div>

<#macro renderDistricts>
    <select class="span12 select districts" name="type">
        <option><@spring.messageText "DISTRICT", "Distrito"/></option>
        <#list districts as d>
            <option value="${d.districtId}">${d.districtName?string?cap_first}</option>
        </#list>
    </select>
</#macro>

<#macro renderRegions><#--fetched by ajax-->
    <select class="span12 select regions" name="type">
        <option><@spring.messageText "ANY", "Indiferente"/></option>
        <#list regions as r>
            <option value="${r.regionId}">${r.regionName?string?cap_first}</option>
        </#list>
    </select>
</#macro>

<#macro renderStatus>
    <select class="span12 select clearfix status" name="status">
        <option><@spring.messageText "BUSINESS.KIND", "Tipo de Negócio"/></option>
        <#list status as s>
            <option value="${s.value}"><@spring.messageText "${(s.value)?string?upper_case}", "${s.value}"/></option>
        </#list>
    </select>
</#macro>

<#macro renderPropertyKind>
    <select class="span12 select" name="type">
        <option value="#"><@spring.messageText "PROPERTY.KIND", "Tipo de Imóvel"/></option>
        <#list propertyKinds as pk>
            <option value="${pk.value}"><@spring.messageText "${(pk.value)?string?upper_case}", "${pk.value}"/></option>
        </#list>
    </select>
</#macro>