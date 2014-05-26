package com.homerenting.domain.modules.header.contacts;

import com.homerenting.domain.BaseEntity;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Arthur on 21/04/14.
 */
@Entity
@Table(name = "EMAIL_CONTACT")
@NamedQueries({
        @NamedQuery(name = "EmailContact.FIND_ALL", query = "SELECT ec from EmailContact ec")
})
@XmlRootElement(name = "emailContact")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class EmailContact extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "EmailContact.FIND_ALL";

    @Id
    @GeneratedValue
    @Column(name = "EMAIL_CONTACT_ID", unique = true, nullable = false)
    private Long emailContactId;

    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "EMAIL_CONTACT_NAME", unique = false, nullable = false)
    private String emailName = StringUtils.EMPTY;

    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "EMAIL_CONTACT_FROM", unique = false, nullable = false)
    private String emailFrom = StringUtils.EMPTY;

    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "EMAIL_CONTACT_MESSAGE", unique = false, nullable = false)
    private String emailMessage = StringUtils.EMPTY;

	/* ==========================GETTERS/SETTERS======================= */

    public Long getEmailContactId() {
        return emailContactId;
    }

    @XmlElement
    public void setEmailContactId(Long emailContactId) {
        this.emailContactId = emailContactId;
    }

    public String getEmailName() {
        return emailName;
    }

    @XmlElement
    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    @XmlElement
    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getEmailMessage() {
        return emailMessage;
    }

    @XmlElement
    public void setEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
    }


    /**
     * HashCode
     */
    @Override
    public int hashCode() {
        return 0;
    }

    /**
     * Equals
     *
     * @param obj
     */
    @Override
    public boolean equals(Object obj) {
        return false;
    }

    /**
     * ToString
     */
    @Override
    public String toString() {
        return null;
    }
}
