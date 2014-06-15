package com.homerenting.domain;

import org.codehaus.jackson.annotate.JsonBackReference;
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
@Table(name = "REGION", uniqueConstraints = @UniqueConstraint(columnNames = "REGION_NAME"))
@NamedQueries({
    @NamedQuery(name = "Region.FIND_ALL", query = "SELECT r from Region r"),
    @NamedQuery(name = "Region.FIND_BY_NAME", query = "SELECT r from Region r WHERE r.regionName LIKE :regionName"),
    @NamedQuery(name = "Region.FIND_BY_NAME_PATTERN", query = "SELECT r from Region r WHERE r.regionName LIKE :regionName"),
})
public class Region implements Serializable{

    /** Default value included to remove warning. Remove or modify at will. **/
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Region.FIND_ALL";

    public static final String FIND_BY_NAME = "Region.FIND_BY_NAME";

    public static final String FIND_BY_NAME_PATTERN = "Region.FIND_BY_NAME_PATTERN";

    @Id
    @GeneratedValue
    @Column(name = "REGION_ID", unique = true, nullable = false)
    private Long regionId;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "REGION_NAME", unique = true, nullable = false)
    private String regionName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="DISTRICT_ID_FK", referencedColumnName = "DISTRICT_ID", unique= false, nullable=false, insertable=true, updatable=true)
    @JsonBackReference
    private District district;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "region", cascade=CascadeType.ALL)
    @JsonManagedReference
    private Set<Parish> parishes = new HashSet<Parish>(0);

    @OneToMany(fetch = FetchType.EAGER, mappedBy="propertyRegion", cascade=CascadeType.ALL)
    private Set<Property> properties = new HashSet<Property>(0);

    	/* ==========================GETTERS/SETTERS======================= */

    public Long getRegionId() {
      return this.regionId;
   }

    @XmlElement
    public void setRegionId(Long regionId) {
      this.regionId = regionId;
   }

    public String getRegionName() {
      return this.regionName;
   }

    @XmlElement
    public void setRegionName(String regionName) {
      this.regionName = regionName;
   }

    public District getDistrict() {
        return district;
    }

    @XmlElement
    public void setDistrict(District district) {
        this.district = district;
    }

    public Set<Parish> getParishes() {
        return parishes;
    }

    @XmlElement
    public void setParishes(Set<Parish> parishes) {
        this.parishes = parishes;
    }

    public Set<Property> getProperties() {
        return properties;
    }

    @XmlElement
    public void setProperties(Set<Property> properties) {
        this.properties = properties;
    }

    	/* ==========================BUILDER======================= */

    public static Builder getBuilder() {
        return new Builder();
    }
    public static class Builder {

        private Region region;

        public Builder() {
            region = new Region();
        }

        public Builder withName(String regionName) {
            region.regionName = regionName;
            return this;
        }

        public Builder withDistrict(District district) {
            region.district = district;
            return this;
        }

        public Builder withParishes(Set<Parish> parishes) {
            region.parishes = parishes;
            return this;
        }

        public Builder withProperties(Set<Property> properties) {
            region.properties = properties;
            return this;
        }

        public Region build() {
            return region;
        }
    }
}