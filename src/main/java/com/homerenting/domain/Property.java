package com.homerenting.domain;

import com.homerenting.domain.modules.header.search.PropertyKind;
import com.homerenting.domain.modules.header.search.PropertyStatus;
import com.neovisionaries.i18n.CountryCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;


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

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_TITLE", unique = true, nullable = false)
    private String propertyTitle;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_DESCRIPTION", unique = true, nullable = false)
    private String propertyDescription;

    private float propertyPrice;

    private boolean isPriceNegotiable;

    private boolean possibleExchange;

    private PropertyStatus propertyStatus;

    private int usefullArea;


    private int bruteArea;

    private Date yearOfConstruction;

    private CountryCode countryCode;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_DISTRICT", unique = true, nullable = false)
    private String propertyDistrict;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_REGION", unique = true, nullable = false)
    private String propertyRegion;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_PARISH", unique = true, nullable = false)
    private String propertyParish;







}