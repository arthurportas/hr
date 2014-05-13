package com.homerenting.domain;

import java.io.Serializable;

import javax.persistence.*;
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
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="USERS",uniqueConstraints = @UniqueConstraint(columnNames = "USER_EMAIL"))
@NamedQueries({
        @NamedQuery(name = "User.FIND_ALL", query = "select u from User u"),
        @NamedQuery(name = "User.FIND_BY_EMAIL", query = "select u from User u where u.email=:email")
})
@XmlRootElement(name = "users")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "User.FIND_ALL";
    public static final String FIND_BY_EMAIL = "User.FIND_BY_EMAIL";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "USER_ID", unique = true, nullable = false)
	private Long userId;

	@NotEmpty(message = "firstName may not be empty")
	@Size(min = 1, max = 40)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "USER_FIRST_NAME", unique = true, nullable = false)
	private String firstName = StringUtils.EMPTY;

	@NotEmpty(message = "lastName may not be empty")
	@Size(min = 1, max = 40)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "USER_LAST_NAME", unique = true, nullable = false)
	private String lastName = StringUtils.EMPTY;

	@NotEmpty(message = "email may not be empty")
	@Size(min = 1, max = 40, message = "email must be greater than 1 and less than 40")
	@Email(message = "email not valid")
    @Column(name = "USER_EMAIL", unique = true, nullable = false)
	private String email = StringUtils.EMPTY;
	
	@NotEmpty(message = "address may not be empty")
	@Size(min = 1, max = 200, message = "address must be greater than 1 and less than 200")
	@Pattern(regexp = "[A-Za-z0-9 ]*", message = "must contain only numbers,letters or spaces")
    @Column(name = "USER_ADDRESS", unique = true, nullable = false)
	private String address = StringUtils.EMPTY;

	@NotEmpty(message = "zipCode may not be empty")
	@Size(min = 1, max = 10, message = "zipCode must be greater than 1 and less than 10")
	@Pattern(regexp = "[0-9]*", message = "must contain only numbers")
    @Column(name = "USER_ZIP_CODE", unique = true, nullable = false)
	private String zipCode = StringUtils.EMPTY;

	@NotEmpty(message = "city may not be empty")
	@Size(min = 1, max = 10, message = "city must be greater than 1 and less than 10")
	@Pattern(regexp = "[A-Za-z]*", message = "must contain only letters")
    @Column(name = "USER_CITY", unique = true, nullable = false)
	private String city = StringUtils.EMPTY;

	@NotEmpty(message = "country may not be empty")
	@Size(min = 1, max = 10, message = "country must be greater than 1 and less than 10")
	@Pattern(regexp = "[A-Za-z]*", message = "must contain only letters")
    @Column(name = "USER_COUNTRY", unique = true, nullable = false)
	private String country = StringUtils.EMPTY;

	@NotEmpty(message = "userKind may not be empty")
	@Size(min = 0, max = 12, message = "userKind must be less than 12")
	@Pattern(regexp = "[A-Za-z]*", message = "must contain only letters")
    @Column(name = "USER_KIND", unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
	private UserKind userKind;

	@Size(min = 0, max = 10, message = "company must be greater than 1 and less than 10")
	@Pattern(regexp = "[A-Za-z0-9 ]*", message = "must contain only numbers,letters or spaces")
    @Column(name = "USER_COMPANY", unique = true, nullable = false)
	private String company = StringUtils.EMPTY;

	@NotEmpty(message = "nif may not be empty")
	@Size(min = 9, max = 9, message = "nif must be exactly 9 numbers")
	@Pattern(regexp = "[0-9]*", message = "must contain only numbers")
    @Column(name = "USER_NIF", unique = true, nullable = false)
	private String nif = StringUtils.EMPTY;

	@Size(min = 1, max = 10)
	@Pattern(regexp = "[0-9]*", message = "phoneNumber must contain only numbers")
    @Column(name = "USER_PHONE_NUMBER", unique = true, nullable = false)
	private String phoneNumber = StringUtils.EMPTY;

	@NotEmpty(message = "cellPhone may not be empty")
	@Size(min = 9, max = 9, message = "cellPhone must be exactly 9 numbers")
	@Pattern(regexp = "[0-9]*", message = "must contain only numbers")
    @Column(name = "USER_CELL_PHONE", unique = true, nullable = false)
	private String cellPhone = StringUtils.EMPTY;

	@Size(min = 0, max = 9, message = "fax must be exactly 9 numbers")
	@Pattern(regexp = "[0-9]*", message = "must contain only numbers")
    @Column(name = "USER_FAX", unique = true, nullable = false)
	private String fax = StringUtils.EMPTY;

	@NotEmpty(message = "password may not be empty")
	@Size(min = 5, max = 20, message = "password must be 5 digits or more")
    @Column(name = "USER_PASSWORD", unique = true, nullable = false)
	private String password;/* SHA-1 */

	/* ==========================GETTERS/SETTERS======================= */

	public Long getId() {
		return this.userId;
	}

	@XmlElement
	public void setId(Long id) {
		this.userId = id;
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

	public String getEmail() {
		return email;
	}

	@XmlElement
	public void setEmail(String email) {
		this.email = email;
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

	public UserKind getUserKind() {
		return userKind;
	}

	@XmlElement
	public void setUserKind(UserKind userKind) {
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

}