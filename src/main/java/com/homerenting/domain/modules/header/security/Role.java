package com.homerenting.domain.modules.header.security;

import com.homerenting.domain.UserShortProfile;
import org.codehaus.jackson.annotate.JsonBackReference;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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
    @Column(name = "ROLE_ID", unique = true, nullable = false)
    private Long roleId;

    @Column(name = "ROLE_NAME", nullable = false)
    @Enumerated(EnumType.STRING)
    private Roles roleName;

    @ManyToMany(mappedBy="roles")
    @JsonBackReference
    private Set<UserShortProfile> users = new HashSet<UserShortProfile>();

    	/* ==========================GETTERS/SETTERS======================= */


    public Long getRoleId() {
        return roleId;
    }

    @XmlElement
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Roles getRoleName() {
        return roleName;
    }

    @XmlElement
    public void setRoleName(Roles roleName) {
        this.roleName = roleName;
    }

    public Set<UserShortProfile> getUsers() {
        return users;
    }

    @XmlElement
    public void setUsers(Set<UserShortProfile> users) {
        this.users = users;
    }

}
