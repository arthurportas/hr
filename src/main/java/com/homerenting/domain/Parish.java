package com.homerenting.domain;

import org.codehaus.jackson.annotate.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

@Entity
@Table(name = "PARISH", uniqueConstraints = @UniqueConstraint(columnNames = "PARISH_NAME"))
public class Parish implements Serializable{

    /** Default value included to remove warning. Remove or modify at will. **/
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "PARISH_ID", unique = true, nullable = false)
    private Long parishId;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PARISH_NAME", unique = true, nullable = false)
    private String parishName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "REGION_ID", unique= false, nullable=true, insertable=true, updatable=true)
    @JsonBackReference
    private Region region;
    	/* ==========================GETTERS/SETTERS======================= */

    public Long getParishId() {
      return parishId;
   }

    @XmlElement
    public void setparishId(Long id) {
      this.parishId = parishId;
   }

    public String getParishName() {
      return parishName;
   }

    @XmlElement
    public void setParishName(String parishName) {
      this.parishName = parishName;
   }

    public Region getRegion() {
        return region;
    }

    @XmlElement
    public void setRegion(Region region) {
        this.region = region;
    }
}