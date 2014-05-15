package com.homerenting.domain;

import com.homerenting.domain.modules.header.search.PropertyKind;
import com.homerenting.domain.modules.header.search.PropertyStatus;
import com.neovisionaries.i18n.CountryCode;

import javax.persistence.*;
import javax.validation.constraints.*;
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

    @NotNull
    @Digits(integer=10, fraction=2,message = "must contain only numbers")
    @Column(name = "PROPERTY_PRICE", nullable = false)
    private float propertyPrice;

    @Column(name = "PROPERTY_PRICE_NEGOTIABLE", nullable = false)
    private boolean isPriceNegotiable = true;

    @Column(name = "PROPERTY_POSSIBLE_EXCHANGE", nullable = false)
    private boolean possibleExchange = false;

    @Column(name = "PROPERTY_STATUS", nullable = false)
    private PropertyStatus propertyStatus;

    @Column(name = "PROPERTY_USEFULL_AREA", nullable = false)
    private int usefullArea;

    @Column(name = "PROPERTY_BRUTE_AREA", nullable = false)
    private int bruteArea;

    @NotNull
    @Past
    @Column(name = "PROPERTY_YEAR_OF_CONSTRUCTION", nullable = false)
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