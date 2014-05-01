package com.homerenting.domain;

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
@Table(name = "COMPANY_MOTD", uniqueConstraints = @UniqueConstraint(columnNames = "COMPANY_MOTD_MOTD"))
@NamedQueries({
        @NamedQuery(name = "CompanyMOTD.FIND_ALL", query = "SELECT cmotd from CompanyMOTD cmotd")
})
public class CompanyMOTD implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "CompanyMOTD.FIND_ALL";

    @Id
    @GeneratedValue
    @Column(name = "COMPANY_MOTD_ID", unique = true, nullable = false)
    private Long companyMotdId;

    @NotNull
    @Size(min = 1, max = 200)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "COMPANY_MOTD_MOTD", unique = true, nullable = false)
    private String motd = StringUtils.EMPTY;


    public Long getCompanyMotdId() {
        return companyMotdId;
    }

    public void setCompanyMotdId(Long companyMotdId) {
        this.companyMotdId = companyMotdId;
    }

    public String getMotd() {
        return motd;
    }

    public void setMotd(String motd) {
        this.motd = motd;
    }
}
