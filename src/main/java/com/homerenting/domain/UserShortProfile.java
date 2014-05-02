package com.homerenting.domain;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="USER_SHORT_PROFILE",uniqueConstraints = @UniqueConstraint(columnNames = "USER_SHORT_PROFILE_EMAIL"))
@NamedQueries({
        @NamedQuery(name = "UserShortProfile.FIND_ALL", query = "select u from UserShortProfile u"),
        @NamedQuery(name = "UserShortProfile.FIND_BY_EMAIL", query = "select u from UserShortProfile u where u.email=:email")
})
@XmlRootElement(name = "userShortProfile")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class UserShortProfile implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "UserShortProfile.FIND_ALL";
    public static final String FIND_BY_EMAIL = "UserShortProfile.FIND_BY_EMAIL";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "USER_SHORT_PROFILE_ID", unique = true, nullable = false)
	private Long userId;

	@NotEmpty(message = "email may not be empty")
	@Size(min = 1, max = 40, message = "email must be greater than 1 and less than 40")
	@Email(message = "email not valid")
    @Column(name = "USER_SHORT_PROFILE_EMAIL", unique = true, nullable = false)
	private String email = StringUtils.EMPTY;

	@NotEmpty(message = "password may not be empty")
	@Size(min = 5, max = 20, message = "password must be 5 digits or more")
    @Column(name = "USER_PASSWORD", unique = true, nullable = false)
	private String password;/* SHA-1 */

	/* ==========================GETTERS/SETTERS======================= */

	public Long getId() {
		return this.userId;
	}

	@XmlElement
	public void setId(Long id) {
		this.userId = id;
	}

	public String getEmail() {
		return email;
	}

	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getPassword() {
		return password;
	}

	@XmlElement
	public void setPassword(String password) {
		this.password = password;
	}

}