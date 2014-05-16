package com.homerenting.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.homerenting.domain.modules.header.security.Role;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.annotate.JsonManagedReference;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="USER_SHORT_PROFILE",uniqueConstraints = @UniqueConstraint(columnNames = "USER_SHORT_PROFILE_EMAIL"))
@NamedQueries({
        @NamedQuery(name = "UserShortProfile.FIND_ALL", query = "SELECT u FROM UserShortProfile u"),
        @NamedQuery(name = "UserShortProfile.FIND_BY_EMAIL",
                query = "SELECT u FROM UserShortProfile u " +
                        "WHERE u.email=:email")
})
@XmlRootElement(name = "userShortProfile")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class UserShortProfile implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "UserShortProfile.FIND_ALL";
    public static final String FIND_BY_EMAIL = "UserShortProfile.FIND_BY_EMAIL";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_SHORT_PROFILE_ID", unique = true, nullable = false)
	private Long userId;

	@NotEmpty(message = "email may not be empty")
	@Size(min = 1, max = 40, message = "email must be greater than 1 and less than 40")
	@Email(message = "email not valid")
    @Column(name = "USER_SHORT_PROFILE_EMAIL", unique = true, nullable = false)
	private String email = StringUtils.EMPTY;

	@NotEmpty(message = "password may not be empty")
	@Size(min = 5, max = 200, message = "password must be 5 digits or more")
    @Column(name = "USER_PASSWORD", unique = true, nullable = false)
	private String password;/* SHA-1 */

    private boolean isAccountEnabled = false;

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="ACCOUNT_TOKEN_ID", unique= true, nullable=true, insertable=true, updatable=true)
    private AccountTokens token;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="USER_SHORT_PROFILE_ROLE",
            joinColumns={@JoinColumn(name="USER_SHORT_PROFILE_ID")},
            inverseJoinColumns={@JoinColumn(name="ROLE_ID")})
    @JsonManagedReference
    private Set<Role> roles = new HashSet<Role>();

	/* ==========================GETTERS/SETTERS======================= */

	public Long getId() {
		return this.userId;
	}

	@XmlElement
	public void setId(final Long id) {
		this.userId = id;
	}

	public String getEmail() {
		return email;
	}

	@XmlElement
	public void setEmail(final String email) {
		this.email = email;
	}
	

	public String getPassword() {
		return password;
	}

	@XmlElement
	public void setPassword(final String password) {
		this.password = password;
	}

    public boolean isAccountEnabled() {
        return isAccountEnabled;
    }

    @XmlElement
    public void setAccountEnabled(final boolean isAccountEnabled) {
        this.isAccountEnabled = isAccountEnabled;
    }

    public AccountTokens getToken() {
        return token;
    }

    @XmlElement
    public void setToken(final AccountTokens token) {
        this.token = token;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    @XmlElement
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    /* ==========================CONSTRUCTOR======================= */
    public UserShortProfile() {

    }
}