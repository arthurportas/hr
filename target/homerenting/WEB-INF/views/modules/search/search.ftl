<div id="home-search-container">
    <div class="container">
        <div class="row">
            <div class="span12">
                <div class="widget pull-right">
                    <div class="row">
                        <div class="span12 head-container">
                            <div class="row">
                                <div class="span8 hidden-phone">
                                    <h2 class="head-title">Welcome to Realto</h2>
                                    <p class="head-message"><strong>Realto xHTML/CSS Template is The Best Solution To Sell House Online.</strong><br />
                                        This template is appropriate for Real Estate Company, who need to do their business online via websites.</p>
                                    <a class="btn btn-large btn-realto span3 header-cta" href="#" title="Buy It Now">Buy It Now!</a>
                                </div>
                                <div class="span4">
                                    <div class="search-form">
                                        <p><@spring.messageText "FIND.YOUR.NEW.HOME", "Encontre uma nova Casa"/></p>
                                        <form action="#" class="row-fluid" method="post">

                                            <@renderDistricts />

                                            <@renderRegions />




                                            <select class="span12 select" name="type">
                                                <option>Tipo</option>
                                                <option value="#">Any</option>
                                                <option value="#">Single Family Home</option>
                                                <option value="#">Condo</option>
                                                <option value="#">Apartment</option>
                                                <option value="#">Loft</option>
                                            </select>

                                            <@renderStatus />


                                            <select class="span6 select pull-left" name="price-from">
                                                <option>Price from</option>
                                                <option value="#">from $100.000</option>
                                                <option value="#">from $200.000</option>
                                                <option value="#">from $300.000</option>
                                                <option value="#">from $400.000</option>
                                                <option value="#">from $500.000</option>
                                            </select>
                                            <select class="span6 select pull-right" name="price-to">
                                                <option>Price to</option>
                                                <option value="#">to $100.000</option>
                                                <option value="#">to $200.000</option>
                                                <option value="#">to $300.000</option>
                                                <option value="#">to $400.000</option>
                                                <option value="#">to $500.000</option>
                                            </select>
                                            <div class="clearfix">
                                                <button class="btn pull-right span6 btn-realto-form btn-large" type="submit">Search</button>
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
<#--
        <option><@spring.messageText "DISTRICT", "Distrito"/></option>
-->
        <#list districts as d>
            <option value="${d.districtId}">${d.name?string?cap_first}</option>
        </#list>
    </select>
</#macro>

<#macro renderRegions><#--fetched by ajax-->
    <select class="span12 select regions" name="type">
        <#list regions as r>
            <option value="${r.regionId}">${r.regionName?string?cap_first}</option>
        </#list>
    </select>
</#macro>

<#macro renderStatus>
    <select class="span12 select clearfix status" name="status">
        <#list status as s>
<#--
            <option value="${s.value}"><@spring.messageText "FOR.${(s.value)?string?upper_case}"/></option>
-->
            <option value="${s.value}">${s.value?string?cap_first}</option>
        </#list>
    </select>
</#macro>