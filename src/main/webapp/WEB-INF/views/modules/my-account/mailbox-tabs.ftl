<h2 class="page-title">
    <@spring.messageText "PERSONAL.MAILBOX", "Mailbox"/>
</h2>
<div class="tabbable" id="mailbox-tabs">

    <!-- Only required for left/right tabs -->
    <ul class="nav nav-tabs">
        <li class="active">
            <a href="#inbox" data-toggle="tab" title="<@spring.messageText "MYACCOUNT.MAILBOX.INBOX", "Caixa de Entrada"/>">
                <@spring.messageText "MYACCOUNT.MAILBOX.INBOX", "Caixa de Entrada"/>
            </a>
        </li>
        <li>
            <a href="#archive" data-toggle="tab" title="<@spring.messageText "MYACCOUNT.MAILBOX.ARCHIVE", "Arquivo"/>">
                <@spring.messageText "MYACCOUNT.MAILBOX.ARCHIVE", "Arquivo"/>
            </a>
        </li>
    </ul>
    
    <div class="tab-content">
        <div class="tab-pane active" id="inbox">
            <p>I'm in Section 1.</p>
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada
                fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend
                leo.</p>
        </div>
        <div class="tab-pane" id="archive">
            <p>Howdy, I'm in Section 2.</p>
            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada
                fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae,
                ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam
                egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend
                leo.</p>
        </div>
    </div>
</div>
<!-- .tabbable -->