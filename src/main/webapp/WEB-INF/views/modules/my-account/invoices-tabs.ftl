<h2 class="page-title">
    <@spring.messageText "PERSONAL.INVOICES", "Faturação"/>
</h2>
<div class="tabbable" id="invoices-tabs">
    <!-- Only required for left/right tabs -->
    <ul class="nav nav-tabs">
        <li class="active">
            <a href="#my-account" data-toggle="tab" title="<@spring.messageText "MYACCOUNT.ACCOUNT.CURRENT", "Conta Corrente"/>">
                <@spring.messageText "MYACCOUNT.ACCOUNT.CURRENT", "Conta Corrente"/>
            </a>
        </li>
        <li>
            <a href="#invoices" data-toggle="tab" title="<@spring.messageText "MYACCOUNT.ACCOUNT.INVOICES", "Faturas"/>">
                <@spring.messageText "MYACCOUNT.ACCOUNT.INVOICES", "Faturas"/>
            </a>
        </li>
        <li>
            <a href="#credit-notes" data-toggle="tab" title="<@spring.messageText "MYACCOUNT.ACCOUNT.CREDIT.NOTES", "Notas de Crédito"/>">
                <@spring.messageText "MYACCOUNT.ACCOUNT.CREDIT.NOTES", "Notas de Crédito"/>
            </a>
        </li>
        <li>
            <a href="#balance" data-toggle="tab" title="<@spring.messageText "MYACCOUNT.ACCOUNT.BALANCE", "Saldo"/>">
                <@spring.messageText "MYACCOUNT.ACCOUNT.BALANCE", "Saldo"/>
            </a>
        </li>
    </ul>
    
    <div class="tab-content">
        <div class="tab-pane active" id="my-account">
            <p>I'm in Section 1.</p>
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada
                fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend
                leo.</p>
        </div>
        <div class="tab-pane" id="invoices">
            <p>Howdy, I'm in Section 2.</p>
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada
                fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend
                leo.</p>
        </div>
        <div class="tab-pane" id="credit-notes">
            <p>Yo, I'm in Section 3.</p>
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada
                fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend
                leo.</p>
        </div>
        <div class="tab-pane" id="balance">
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