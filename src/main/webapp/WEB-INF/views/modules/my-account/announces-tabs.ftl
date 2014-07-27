<h2 class="page-title">
    <@spring.messageText "PERSONAL.ANNOUNCES", "Anúncios"/>
</h2>
<div class="tabbable" id="announces-tabs">
    <!-- Only required for left/right tabs -->
    <ul class="nav nav-tabs">
        <li class="active">
            <a href="#all-announces" data-toggle="tab" title="<@spring.messageText "MYACCOUNT.ANNOUNCES.ALL", "Todos"/>">
                 <@spring.messageText "MYACCOUNT.ANNOUNCES.ALL", "Todos"/>
            </a>
        </li>
        <li>
            <a href="#active" data-toggle="tab" title="<@spring.messageText "MYACCOUNT.ANNOUNCES.ACTIVE", "Ativos"/>">
                <@spring.messageText "MYACCOUNT.ANNOUNCES.ACTIVE", "Ativos"/>
            </a>
        </li>
        <li>
            <a href="#eliminated" data-toggle="tab" title="<@spring.messageText "MYACCOUNT.ANNOUNCES.ELIMINATED", "Eliminados"/>">
                <@spring.messageText "MYACCOUNT.ANNOUNCES.ELIMINATED", "Eliminados"/>
            </a>
        </li>
        <li>
            <a href="#highlighted" data-toggle="tab" title="<@spring.messageText "MYACCOUNT.ANNOUNCES.HIGHLIGHTED", "Destaque"/>">
                <@spring.messageText "MYACCOUNT.ANNOUNCES.HIGHLIGHTED", "Destaque"/>
            </a>
        </li>
    </ul>
    
    <div class="tab-content">
        <div class="tab-pane active" id="all-announces">
            <p>I'm in Section 1.</p>
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada
                fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend
                leo.</p>
        </div>
        <div class="tab-pane" id="active">
            <p>Howdy, I'm in Section 2.</p>
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada
                fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend
                leo.</p>
        </div>
        <div class="tab-pane" id="eliminated">
            <p>Yo, I'm in Section 3.</p>
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada
                fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend
                leo.</p>
        </div>
        <div class="tab-pane" id="highlighted">
            <p>Yo, I'm in Section 4.</p>
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada
                fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend
                leo.</p>
        </div>
    </div>
</div>
<!-- .tabbable -->