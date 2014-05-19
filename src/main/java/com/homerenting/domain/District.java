package com.homerenting.domain;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.annotate.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "DISTRICT", uniqueConstraints = @UniqueConstraint(columnNames = "DISTRICT_NAME"))
@NamedQueries({
        @NamedQuery(name = "District.FIND_ALL", query = "SELECT d from District d"),
        @NamedQuery(name = "District.FIND_ALL_REGIONS",
                query = "SELECT d from District d WHERE  d.districtId= :id")
})
public class District implements Serializable {

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
    @Column(name = "DISTRICT_NAME", unique = true, nullable = false)
    private String districtName = StringUtils.EMPTY;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "district")
    @JsonManagedReference
    private Set<Region> regions = new HashSet<Region>(0);

    @OneToMany(fetch = FetchType.EAGER, mappedBy="propertyDistrict")
    private Set<Property> properties = new HashSet<Property>(0);

    	/* ==========================GETTERS/SETTERS======================= */


    public Long getDistrictId() {
        return this.districtId;
    }

    @XmlElement
    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    @XmlElement
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Set<Region> getRegions() {
        return this.regions;
    }

    @XmlElement
    public void setRegions(Set<Region> regions) {
        this.regions = regions;
    }

    public Set<Property> getProperties() {
        return properties;
    }

    @XmlElement
    public void setProperties(Set<Property> properties) {
        this.properties = properties;
    }
}