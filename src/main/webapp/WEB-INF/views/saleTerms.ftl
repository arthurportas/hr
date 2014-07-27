<#import "spring.ftl" as spring />
<#include "header.ftl">
<body>
<#include "modules/header/header.ftl">
include an iframe with http://dre.pt/pdf1s/2012/08/15700/0441104452.pdf
<div class="container page-content">
    <div class="row-fluid padding30 box-container">
        <h2 class="page-title">Toggle</h2>
        <div class="accordion">
            <div class="accordion-group">
                <div class="accordion-heading">
                    <a class="accordion-toggle" data-parent="#accordion" data-toggle="collapse" href="#collapseOne">
                        Toggle Group Item #1
                    </a>
                </div>
                <div class="accordion-body collapse" id="collapseOne">
                    <div class="accordion-inner">
                        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada
                            fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                            ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                            egestas semper. Aenean ultricies mi vitae est. Vestibulum tortor quam,
                            feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero
                            sit amet quam egestas semper. Mauris placerat eleifend leo.</p>
                    </div>
                </div>
            </div>
            <div class="accordion-group">
                <div class="accordion-heading">
                    <a class="accordion-toggle" data-parent="#accordion" data-toggle="collapse" href="#collapseTwo">
                        Toggle Group Item #2
                    </a>
                </div>
                <div class="accordion-body collapse" id="collapseTwo">
                    <div class="accordion-inner">
                        <p>Aenean ultricies mi vitae est. Vestibulum tortor quam, feugiat vitae,
                            ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                            egestas semper. Pellentesque habitant morbi tristique senectus et netus
                            et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat
                            vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet
                            quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat
                            eleifend leo. Donec eu libero sit amet quam egestas semper. Aenean
                            ultricies mi vitae est. Vestibulum tortor quam, feugiat vitae, ultricies
                            eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas
                            semper.
                        </p>
                    </div>
                </div>
            </div>
            <div class="accordion-group">
                <div class="accordion-heading">
                    <a class="accordion-toggle" data-parent="#accordion" data-toggle="collapse" href="#collapseTree">
                        Toggle Group Item #3
                    </a>
                </div>
                <div class="accordion-body collapse" id="collapseTree">
                    <div class="accordion-inner">
                        <p>Donec eu libero sit amet quam egestas semper. Aenean ultricies mi
                            vitae est. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor
                            sit amet, ante. Donec eu libero sit amet quam egestas semper.
                            Pellentesque habitant morbi tristique senectus et netus et malesuada
                            fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                            ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                            egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend
                            leo.</p>
                    </div>
                </div>
            </div>
        </div>
        <!-- .accordion -->
    </div>
    <!-- .row-fluid -->
</div>  
<!-- .container -->
<#include "modules/footer/footer.ftl">
<#include "footer.ftl">