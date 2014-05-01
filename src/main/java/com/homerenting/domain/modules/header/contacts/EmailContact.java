package com.homerenting.domain.modules.header.contacts;

import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by Arthur on 21/04/14.
 */
@Entity
@Table(name = "EMAIL_CONTACT")
@NamedQueries({
        @NamedQuery(name = "EmailContact.FIND_ALL", query = "SELECT ec from EmailContact ec")
})

public class EmailContact implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "EmailContact.FIND_ALL";

    @Id
    @GeneratedValue
    @Column(name = "EMAIL_CONTACT_ID", unique = true, nullable = false)
    private Long emailContactId;

    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "EMAIL_CONTACT_NAME", nullable = false)
    private String emailName = StringUtils.EMPTY;

    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "EMAIL_CONTACT_FROM", nullable = false)
    private String emailFrom = StringUtils.EMPTY;

    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "EMAIL_CONTACT_MESSAGE", nullable = false)
    private String emailMessage = StringUtils.EMPTY;


    public Long getEmailContactId() {
        return emailContactId;
    }

    public void setEmailContactId(Long emailContactId) {
        this.emailContactId = emailContactId;
    }

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getEmailMessage() {
        return emailMessage;
    }

    public void setEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
    }
}
