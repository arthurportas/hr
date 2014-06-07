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
@Table(name = "PROPERTY_KIND", uniqueConstraints = @UniqueConstraint(columnNames = "PROPERTY_KIND_NAME"))
public class PropertyKind implements Serializable{

    /** Default value included to remove warning. Remove or modify at will. **/
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "PROPERTY_KIND_ID", unique = true, nullable = false)
    private Long propertyKindId;

    @NotNull
    @Size(min = 1, max = 30)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_KIND_NAME", unique = true, nullable = false)
    private String propertyKindName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "propertyKind")
    @JsonManagedReference
    private Set<Property> properties = new HashSet<Property>(0);

    	/* ==========================GETTERS/SETTERS======================= */

    public Long getPropertyKindId() {
        return propertyKindId;
    }

    @XmlElement
    public void setPropertyKindId(Long propertyKindId) {
        this.propertyKindId = propertyKindId;
    }

    public String getPropertyKindName() {
        return propertyKindName;
    }

    @XmlElement
    public void setPropertyKindName(String propertyKindName) {
        this.propertyKindName = propertyKindName;
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

        private PropertyKind propertyKind;

        public Builder() {
            propertyKind = new PropertyKind();
        }

        public Builder withName(String propertyKindName) {
            propertyKind.propertyKindName = propertyKindName;
            return this;
        }

        public PropertyKind build() {
            return propertyKind;
        }
    }
}


