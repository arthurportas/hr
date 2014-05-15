package com.homerenting.domain.modules.header.security;

import com.homerenting.domain.UserShortProfile;
import org.codehaus.jackson.annotate.JsonBackReference;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/**
 * Created by Arthur on 10/05/14.
 */
@Entity
@Table(name = "ROLE")
@NamedQueries({
        @NamedQuery(name = "Role.FIND_ALL", query = "SELECT r from Role r")
})
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Role.FIND_ALL";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ROLE_NAME", nullable = false)
    @Enumerated(EnumType.STRING)
    private Roles name;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_SHORT_PROFILE_FK", referencedColumnName = "USER_SHORT_PROFILE_ID", nullable = false)
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
