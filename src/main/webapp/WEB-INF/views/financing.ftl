<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>
<#include "modules/header/header.ftl">
<div class="container page-content">
    <div class="row">
        <div class="span8">
            <div class="box-container">
                <div class="padding30">
                    <h2 class="page-title">Mortgage Calculator</h2>
                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada
                        fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                        ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                        egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend
                        leo. Quisque sit amet est et sapien ullamcorper pharetra. Vestibulum
                        erat wisi, condimentum sed, commodo vitae, ornare sit amet, wisi. Aenean
                        fermentum, elit eget tincidunt condimentum, eros ipsum rutrum orci,
                        sagittis tempus lacus enim ac dui. Donec non enim in turpis pulvinar
                        facilisis. Ut felis. Praesent dapibus, neque id cursus faucibus, tortor
                        neque egestas augue, eu vulputate magna eros eu erat. Aliquam erat
                        volutpat. Nam dui mi, tincidunt quis, accumsan porttitor, facilisis
                        luctus, metus</p>
                    <div class="row-fluid">
                        <form action="#" class="margin300" method="post">
                            <input class="span6" placeholder="Sale price" type="text">
                            <input class="span6 pull-right" placeholder="Down payment" type="text">
                            <input class="span6" placeholder="Interest rate" type="text">
                            <input class="span6 pull-right" placeholder="Terms year" type="text">
                            <div class="clearfix margin200">
                                <button class="btn btn-realto span6" type="submit">Calculate</button>
                                <input class="span6 pull-right" placeholder="$" type="text">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- .span8 -->
        <div class="span4 widget">
            <div class="search-form">
                <p>Find your new home</p>
                <form action="#" class="row-fluid" method="post">
                    <select class="span12 select" name="type">
                        <option>Location</option>
                        <option value="#">New York</option>
                        <option value="#">Los Angeles</option>
                        <option value="#">Washington</option>
                        <option value="#">Chicago</option>
                        <option value="#">Miami</option>
                    </select>
                    <select class="span12 select" name="type">
                        <option>Property Type</option>
                        <option value="#">Any</option>
                        <option value="#">Single Family Home</option>
                        <option value="#">Condo</option>
                        <option value="#">Apartment</option>
                        <option value="#">Loft</option>
                    </select>
                    <select class="span6 select pull-left" name="beds">
                        <option>Beds</option>
                        <option value="#">1+ Beds</option>
                        <option value="#">2+ Beds</option>
                        <option value="#">3+ Beds</option>
                        <option value="#">4+ Beds</option>
                        <option value="#">5+ Beds</option>
                    </select>
                    <select class="span6 select pull-right" name="baths">
                        <option>Baths</option>
                        <option value="#">1+ Baths</option>
                        <option value="#">2+ Baths</option>
                        <option value="#">3+ Baths</option>
                        <option value="#">4+ Baths</option>
                        <option value="#">5+ Baths</option>
                    </select>
                    <select class="span12 select clearfix" name="status">
                        <option>Select Status</option>
                        <option value="#">For Rent</option>
                        <option value="#">For Sale</option>
                    </select>
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
    <!-- .row -->
</div>
<!-- .container -->
<#include "modules/footer/footer.ftl">
<#include "footer.ftl">