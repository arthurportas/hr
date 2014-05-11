package com.homerenting.domain;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="ACCOUNT_TOKENS",uniqueConstraints = @UniqueConstraint(columnNames = "ACCOUNT_TOKENS_TOKEN"))
@NamedQueries({
        @NamedQuery(name = "AccountTokens.FIND_ALL", query = "select at from AccountTokens at"),
        @NamedQuery(name = "AccountTokens.FIND_BY_TOKEN", query = "select at from AccountTokens at where at.token=:token")
})
@XmlRootElement(name = "accountTokens")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class AccountTokens implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "AccountTokens.FIND_ALL";

    public static final String FIND_BY_TOKEN = "AccountTokens.FIND_BY_TOKEN";

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "token may not be empty")
    @Column(name = "ACCOUNT_TOKENS_TOKEN", unique = true, nullable = false)
	private String token = StringUtils.EMPTY;


	/* ==========================GETTERS/SETTERS======================= */

	public Long getId() {
		return this.id;
	}

	@XmlElement
	public void setId(Long id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	@XmlElement
	public void setToken(String token) {
		this.token = token;
	}

}