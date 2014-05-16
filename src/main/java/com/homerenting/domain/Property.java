package com.homerenting.domain;

import com.homerenting.domain.modules.header.search.PropertyKind;
import com.homerenting.domain.modules.header.search.PropertyStatus;

import javax.persistence.*;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlElement;
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
    @Column(name = "PROPERTY_KIND", unique = false, nullable = false)
    @Enumerated(EnumType.STRING)
    private PropertyKind propertyKind;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_TITLE", unique = false, nullable = false)
    private String propertyTitle;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_DESCRIPTION", unique = false, nullable = false)
    private String propertyDescription;

    @NotNull
    @Digits(integer=10, fraction=3,message = "must contain only numbers")
    @Column(name = "PROPERTY_PRICE", nullable = false)
    private float propertyPrice;

    @NotNull
    @Column(name = "PROPERTY_PRICE_NEGOTIABLE", nullable = false)
    private boolean isPriceNegotiable = true;

    @NotNull
    @Column(name = "PROPERTY_POSSIBLE_EXCHANGE", nullable = false)
    private boolean possibleExchange = false;

    @NotNull
    @Column(name = "PROPERTY_STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    private PropertyStatus propertyStatus;

    @Column(name = "PROPERTY_USEFULL_AREA", nullable = true)
    private int usefullArea;

    @Column(name = "PROPERTY_BRUTE_AREA", nullable = true)
    private int bruteArea;

    @NotNull
    @Past
    @Column(name = "PROPERTY_YEAR_OF_CONSTRUCTION", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date yearOfConstruction;

    @NotNull
    @Column(name = "PROPERTY_COUNTRY", nullable = false)
    private String country;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_DISTRICT", unique = false, nullable = false)
    private String propertyDistrict;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_REGION", unique = false, nullable = false)
    private String propertyRegion;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_PARISH", unique = false, nullable = false)
    private String propertyParish;

    	/* ==========================GETTERS/SETTERS======================= */

    public Long getPropertyId() {
        return propertyId;
    }

    @XmlElement
    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    @XmlElement
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public PropertyKind getPropertyKind() {
        return propertyKind;
    }

    @XmlElement
    public void setPropertyKind(PropertyKind propertyKind) {
        this.propertyKind = propertyKind;
    }

    public String getPropertyTitle() {
        return propertyTitle;
    }

    @XmlElement
    public void setPropertyTitle(String propertyTitle) {
        this.propertyTitle = propertyTitle;
    }

    public String getPropertyDescription(){
        return propertyDescription;
    }

    @XmlElement
    public void setPropertyDescription(String propertyDescription) {
        this.propertyDescription = propertyDescription;
    }

    public float getPropertyPrice() {
        return propertyPrice;
    }

    @XmlElement
    public void setPropertyPrice(float propertyPrice) {
        this.propertyPrice = propertyPrice;
    }

    public boolean isPriceNegotiable() {
        return isPriceNegotiable;
    }

    @XmlElement
    public void setPriceNegotiable(boolean isPriceNegotiable) {
        this.isPriceNegotiable = isPriceNegotiable;
    }

    public boolean isPossibleExchange() {
        return possibleExchange;
    }

    @XmlElement
    public void setPossibleExchange(boolean possibleExchange) {
        this.possibleExchange = possibleExchange;
    }

    public PropertyStatus getPropertyStatus() {
        return propertyStatus;
    }

    @XmlElement
    public void setPropertyStatus(PropertyStatus propertyStatus) {
        this.propertyStatus = propertyStatus;
    }

    public int getUsefullArea() {
        return usefullArea;
    }

    @XmlElement
    public void setUsefullArea(int usefullArea) {
        this.usefullArea = usefullArea;
    }

    public int getBruteArea() {
        return bruteArea;
    }

    @XmlElement
    public void setBruteArea(int bruteArea) {
        this.bruteArea = bruteArea;
    }

    public Date getYearOfConstruction() {
        return yearOfConstruction;
    }

    @XmlElement
    public void setYearOfConstruction(Date yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getCountry() {
        return country;
    }

    @XmlElement
    public void setCountry(String country) {
        this.country = country;
    }

    public String getPropertyDistrict() {
        return propertyDistrict;
    }

    @XmlElement
    public void setPropertyDistrict(String propertyDistrict) {
        this.propertyDistrict = propertyDistrict;
    }

    public String getPropertyRegion() {
        return propertyRegion;
    }

    @XmlElement
    public void setPropertyRegion(String propertyRegion) {
        this.propertyRegion = propertyRegion;
    }

    public String getPropertyParish() {
        return propertyParish;
    }

    @XmlElement
    public void setPropertyParish(String propertyParish) {
        this.propertyParish = propertyParish;
    }
}