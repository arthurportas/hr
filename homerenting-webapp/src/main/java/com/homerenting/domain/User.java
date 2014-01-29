package com.homerenting.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Email;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "mobileID"))
@NamedQueries({ @NamedQuery(name = "User.FIND_ALL", query = "select u from User u") })
@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class User extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "User.FIND_ALL";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@NotNull
	@Size(min = 1, max = 40)
	private String firstName = StringUtils.EMPTY;

	@NotNull
	@Size(min = 1, max = 40)
	private String lastName = StringUtils.EMPTY;

	@NotNull
	@Size(min = 1, max = 40)
	@Email
	private String email = StringUtils.EMPTY;
	
	@NotNull
	@Size(min = 1, max = 200)
	@Pattern(regexp = "[A-Za-z0-9 ]*", message = "must contain only numbers,letters or spaces")
	private String address = StringUtils.EMPTY;

	@NotNull
	@Size(min = 1, max = 10)
	@Pattern(regexp = "[0-9]*", message = "must contain only numbers")
	private String zipCode = StringUtils.EMPTY;

	@NotNull
	@Size(min = 1, max = 10)
	@Pattern(regexp = "[A-Za-z]*", message = "must contain only letters")
	private String city = StringUtils.EMPTY;

	@NotNull
	@Size(min = 1, max = 10)
	@Pattern(regexp = "[A-Za-z]*", message = "must contain only letters")
	private String country = StringUtils.EMPTY;

	@NotNull
	@Size(min = 1, max = 10)
	@Pattern(regexp = "[A-Za-z]*", message = "must contain only letters")
	private String userKind = StringUtils.EMPTY;

	@Size(min = 1, max = 10)
	@Pattern(regexp = "[A-Za-z0-9 ]*", message = "must contain only numbers,letters or spaces")
	private String company = StringUtils.EMPTY;

	@NotNull
	@Size(min = 1, max = 10)
	@Pattern(regexp = "[0-9]*", message = "must contain only numbers")
	private String nif = StringUtils.EMPTY;

	@NotNull
	@Size(min = 1, max = 10)
	@Pattern(regexp = "[0-9]*", message = "must contain only numbers")
	private String phoneNumber = StringUtils.EMPTY;

	@NotNull
	@Size(min = 1, max = 10)
	@Pattern(regexp = "[0-9]*", message = "must contain only numbers")
	private String cellPhone = StringUtils.EMPTY;

	@NotNull
	@Size(min = 1, max = 10)
	@Pattern(regexp = "[0-9]*", message = "must contain only numbers")
	private String fax = StringUtils.EMPTY;

	@Size(min = 1, max = 255)
	private String password;/* SHA-1 */

	/* ==========================GETTERS/SETTERS======================= */

	public Long getId() {
		return id;
	}

	@XmlElement
	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@XmlElement
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	@XmlElement
	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	@XmlElement
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	@XmlElement
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	@XmlElement
	public void setCountry(String country) {
		this.country = country;
	}

	public String getUserKind() {
		return userKind;
	}

	@XmlElement
	public void setUserKind(String userKind) {
		this.userKind = userKind;
	}

	public String getCompany() {
		return company;
	}

	@XmlElement
	public void setCompany(String company) {
		this.company = company;
	}

	public String getNif() {
		return nif;
	}

	@XmlElement
	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@XmlElement
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	@XmlElement
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getFax() {
		return fax;
	}

	@XmlElement
	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getPassword() {
		return password;
	}

	@XmlElement
	public void setPassword(String password) {
		this.password = password;
	}

	/* ==========================CONSTRUCTOR======================= */

	public User() {

	}

	/* ====================HASHCODE,EQUALS,TOSTRING================= */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.realtv.domain.BaseEntity#hashCode()
	 */

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.realtv.domain.BaseEntity#equals()
	 */

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.realtv.domain.BaseEntity#toString()
	 */

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}