package com.homerenting.domain.modules.header.security;

import com.homerenting.domain.UserShortProfile;
import com.homerenting.domain.modules.header.search.PropertyKind;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.annotate.JsonBackReference;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/**
 * Created by Arthur on 10/05/14.
 */
@Entity
@Table(name = "ROLE", uniqueConstraints = @UniqueConstraint(columnNames = "ROLE_NAME"))
@NamedQueries({
        @NamedQuery(name = "Role.FIND_ALL", query = "SELECT r from Role r")
})
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Role.FIND_ALL";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "role name not be empty")
    @Column(name = "ROLE_NAME", unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
    private Roles name;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_SHORT_PROFILE_ID", nullable = false)
    @JsonBackReference
    private UserShortProfile userShortProfile;

	/* ==========================GETTERS/SETTERS======================= */

    public Long getId() {
        return this.id;
    }

    @XmlElement
    public void setId(Long id) {
        this.id = id;
    }


    public Roles getName() {
        return name;
    }

    @XmlElement
    public void setName(Roles name) {
        this.name = name;
    }

    public UserShortProfile getUserShortProfile() {
        return userShortProfile;
    }

    @XmlElement
    public void setUserShortProfile(UserShortProfile userShortProfile) {
        this.userShortProfile = userShortProfile;
    }
}
