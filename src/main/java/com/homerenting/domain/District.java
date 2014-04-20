package com.homerenting.domain;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "DISTRICT", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
@NamedQueries({
        @NamedQuery(name = "District.FIND_ALL", query = "SELECT d from District d"),
        @NamedQuery(name = "District.FIND_ALL_REGIONS",
                query = "SELECT d from District d WHERE  d.districtId= :id")
})
public class District extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "District.FIND_ALL";

    public static final String FIND_ALL_REGIONS = "District.FIND_ALL_REGIONS";

    @Id
    @GeneratedValue
    @Column(name = "DISTRICT_ID", unique = true, nullable = false)
    private Long districtId;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "NAME", unique = true, nullable = false)
    private String name = StringUtils.EMPTY;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "district")
    @JsonManagedReference
    private Set<Region> regions = new HashSet<Region>(0);

    public Long getDistrictId() {
        return this.districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Set<Region> getRegions() {
        return this.regions;
    }

    public void setRegions(Set<Region> regions) {
        this.regions = regions;
    }

    /**
     * HashCode
     */
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Equals
     *
     * @param obj
     */
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    /**
     * ToString
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}