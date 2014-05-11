package com.homerenting.domain;

import org.codehaus.jackson.annotate.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Table(name = "REGION", uniqueConstraints = @UniqueConstraint(columnNames = "REGION_NAME"))
@NamedQueries({
    @NamedQuery(name = "Region.FIND_ALL", query = "SELECT r from Region r"),
    @NamedQuery(name = "Region.FIND_BY_NAME", query = "SELECT r from Region r WHERE r.regionName LIKE :regionName"),
    @NamedQuery(name = "Region.FIND_BY_NAME_PATTERN", query = "SELECT r from Region r WHERE r.regionName LIKE :regionName")
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

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "DISTRICT_ID", nullable = false)
   @JsonBackReference
   private District district;

   public Long getRegionId() {
      return this.regionId;
   }

   public void setRegionId(Long regionId) {
      this.regionId = regionId;
   }

   public String getRegionName() {
      return this.regionName;
   }

   public void setRegionName(String regionName) {
      this.regionName = regionName;
   }

   public District getDistrict() {
        return district;
    }

   public void setDistrict(District district) {
        this.district = district;
    }
}