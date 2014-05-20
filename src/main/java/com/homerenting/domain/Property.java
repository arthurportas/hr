package com.homerenting.domain;

import com.homerenting.domain.modules.header.search.*;
import com.homerenting.domain.modules.header.security.Role;
import com.homerenting.external.CloudinaryImage;

import javax.persistence.*;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "PROPERTY", uniqueConstraints = @UniqueConstraint(columnNames = "PROPERTY_NAME"))
@NamedQueries({
        @NamedQuery(name = "Property.FIND_ALL", query = "SELECT p FROM Property p"),
        @NamedQuery(name = "Property.FIND_BY_NAME", query = "SELECT p FROM Property p WHERE p.propertyName LIKE :propertyName"),
        @NamedQuery(name = "Property.FIND_BY_NAME_PATTERN", query = "SELECT p FROM Property p WHERE p.propertyName LIKE :propertyName"),
        @NamedQuery(name = "Property.FIND_ALL_HIGHLIGHTED", query = "SELECT p FROM Property p WHERE p.isHighlighted = TRUE"),
        @NamedQuery(name = "Property.FIND_ALL_BY_DISTRICT", query = "SELECT p FROM Property p WHERE p.propertyDistrict.districtId  = :districtId"),
        @NamedQuery(name = "Property.FIND_ALL_BY_REGION", query = "SELECT p FROM Property p WHERE p.propertyRegion.regionId  = :regionId"),
        @NamedQuery(name = "Property.FIND_ALL_BY_DISTRICT_AND_REGION", query = "SELECT p FROM Property p WHERE p.propertyDistrict.districtId  = :districtId AND p.propertyRegion.regionId  = :regionId"),
        @NamedQuery(name = "Property.FIND_ALL_BY_PROPERTY_KIND", query = "SELECT p FROM Property p WHERE p.propertyKind.propertyKindName  LIKE :propertyKind"),
        @NamedQuery(name = "Property.FIND_ALL_BY_DISTRICT_AND_REGION_AND_KIND", query = "SELECT p FROM Property p WHERE p.propertyDistrict.districtId  = :districtId AND p.propertyRegion.regionId  = :regionId AND p.propertyKind.propertyKindName  LIKE :propertyKind"),
        //@NamedQuery(name = "Property.FIND_ALL_BY_BUSINESS_KIND", query = "SELECT p FROM Property p WHERE p.propertyKind.propertyKindName  LIKE :propertyKind")
})
public class Property implements Serializable {

    /**
     * Default value included to remove warning. Remove or modify at will. *
     */
    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Property.FIND_ALL";

    public static final String FIND_BY_NAME = "Property.FIND_BY_NAME";

    public static final String FIND_BY_NAME_PATTERN = "Property.FIND_BY_NAME_PATTERN";

    public static final String FIND_ALL_HIGHLIGHTED = "Property.FIND_ALL_HIGHLIGHTED";

    public static final String FIND_ALL_BY_DISTRICT = "Property.FIND_ALL_BY_DISTRICT";

    public static final String FIND_ALL_BY_REGION = "Property.FIND_ALL_BY_REGION";

    public static final String FIND_ALL_BY_DISTRICT_AND_REGION = "Property.FIND_ALL_BY_DISTRICT_AND_REGION";

    public static final String FIND_ALL_BY_STARTING_PRICE = "Property.FIND_ALL_BY_STARTING_PRICE";

    public static final String FIND_ALL_BY_PROPERTY_KIND = "Property.FIND_ALL_BY_PROPERTY_KIND";

    public static final String FIND_ALL_BY_DISTRICT_AND_REGION_AND_KIND = "Property.FIND_ALL_BY_DISTRICT_AND_REGION_AND_KIND";

    public static final String FIND_ALL_BY_BUSINESS_KIND= "Property.FIND_ALL_BY_BUSINESS_KIND";

    @Id
    @GeneratedValue
    @Column(name = "PROPERTY_ID", unique = true, nullable = false)
    private Long propertyId;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_NAME", unique = true, nullable = false)
    private String propertyName;

    @ManyToOne
    @JoinColumn(name="propertyKindId")
    private PropertyKind propertyKind;

    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_TIPOLOGY", unique = false, nullable = true)
    @Enumerated(EnumType.STRING)
    private Tipologies tipology;

    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_VILLAGE_TIPOLOGY", unique = false, nullable = true)
    @Enumerated(EnumType.STRING)
    private VillageTipologies vilageTipology;

    @NotNull
    @Size(min = 1, max = 75)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_TITLE", unique = false, nullable = false)
    private String propertyTitle;

    @NotNull
    @Size(min = 1, max = 250)
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

    @Column(name = "PROPERTY_BUSINESS_TYPE", unique = false, nullable = false)
    @Enumerated(EnumType.STRING)
    private BusinessType businessType;

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
    private int yearOfConstruction;

    @NotNull
    @Column(name = "PROPERTY_COUNTRY", nullable = false)
    private String country;

    @ManyToOne
    @JoinColumn(name="districtId")
    private District propertyDistrict;

    @ManyToOne
    @JoinColumn(name="regionId")
    private Region propertyRegion;

    @NotNull
    @Size(min = 1, max = 25)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "PROPERTY_PARISH", unique = false, nullable = false)
    private String propertyParish;

    @Column(name = "PROPERTY_ENERGY_EFFICIENCY", nullable = true)
    @Enumerated(EnumType.STRING)
    private EnergyEfficiency energyEfficiency;

    @NotNull
    @Column(name = "PROPERTY_IS_HIGHLIGHTED", nullable = false)
    private boolean isHighlighted = false;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy="property")
    @Column(name = "PROPERTY_IMAGES", nullable = true)
    private Set<CloudinaryImage> images = new HashSet<CloudinaryImage>();

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

    public Tipologies getTipology() {
        return tipology;
    }

    @XmlElement
    public void setTipology(Tipologies tipology) {
        this.tipology = tipology;
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

    public BusinessType getBusinessType() {
        return businessType;
    }

    @XmlElement
    public void setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
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

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    @XmlElement
    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getCountry() {
        return country;
    }

    @XmlElement
    public void setCountry(String country) {
        this.country = country;
    }

    public Region getPropertyRegion() {
        return propertyRegion;
    }

    @XmlElement
    public void setPropertyRegion(Region propertyRegion) {
        this.propertyRegion = propertyRegion;
    }

    public String getPropertyParish() {
        return propertyParish;
    }

    public EnergyEfficiency getEnergyEfficiency() {
        return energyEfficiency;
    }

    @XmlElement
    public void setEnergyEfficiency(EnergyEfficiency energyEfficiency) {
        this.energyEfficiency = energyEfficiency;
    }

    public boolean isHighlighted() {
        return isHighlighted;
    }

    @XmlElement
    public void setHighlighted(boolean isHighlighted) {
        this.isHighlighted = isHighlighted;
    }

    public VillageTipologies getVilageTipology() {
        return vilageTipology;
    }

    @XmlElement
    public void setVilageTipology(VillageTipologies vilageTipology) {
        this.vilageTipology = vilageTipology;
    }

    public Set<CloudinaryImage> getImages() {
        return images;
    }

    @XmlElement
    public void setImages(Set<CloudinaryImage> images) {
        this.images = images;
    }

    public District getPropertyDistrict() {
        return this.propertyDistrict;
    }

    @XmlElement
    public void setPropertyDistrict(District propertyDistrict) {
        this.propertyDistrict = propertyDistrict;
    }

}