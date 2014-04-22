package com.homerenting.domain;

import com.homerenting.domain.modules.header.search.PropertyKind;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Table(name = "PROPERTY", uniqueConstraints = @UniqueConstraint(columnNames = "PROPERTY_NAME"))
@NamedQueries({
        @NamedQuery(name = "Property.FIND_ALL", query = "SELECT p from Property p"),
        @NamedQuery(name = "Property.FIND_BY_NAME", query = "SELECT p from Property p WHERE p.propertyName LIKE :propertyName"),
        @NamedQuery(name = "Property.FIND_BY_NAME_PATTERN", query = "SELECT p from Property p WHERE p.propertyName LIKE :propertyName")

})
public class Property implements Serializable {

    /**
     * Default value included to remove warning. Remove or modify at will. *
     */
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Property.FIND_ALL";

    public static final String FIND_BY_NAME = "Property.FIND_BY_NAME";

    public static final String FIND_BY_NAME_PATTERN = "Property.FIND_BY_NAME_PATTERN";

    @Id
    @GeneratedValue
    @Column(name = "PROPERTY_ID", unique = true, nullable = false)
    private Long propertyId;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_NAME", unique = true, nullable = false)
    private String propertyName;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_KIND", unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
    private PropertyKind propertyKind;

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyKind(PropertyKind propertyKind) {
        this.propertyKind = propertyKind;
    }

    public PropertyKind getPropertyKind() {
        return propertyKind;
    }
}