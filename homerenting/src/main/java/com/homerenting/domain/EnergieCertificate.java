package com.homerenting.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="ENERGIE_CERTIFICATE",uniqueConstraints = @UniqueConstraint(columnNames = "certificateKind"))
@NamedQueries({ @NamedQuery(name = "EnergieCertificate.FIND_ALL", query = "select ec from EnergieCertificate ec") })
@XmlRootElement(name = "energieCertificate")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class EnergieCertificate extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	public static final String FIND_ALL = "EnergieCertificate.FIND_ALL";

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@NotEmpty(message = "certificateKind should not be empty")
	@Size(min = 1, max = 20, message = "certificateKind must be greater than 1 and less than 20")
	@Pattern(regexp = "[A-Za-z0-9 ]*", message = "must contain only numbers,letters or spaces")
	private String certificateKind; //TODO should be an enum
	
	/* ==========================GETTERS/SETTERS======================= */
	
	public Long getId() {
		return id;
	}

	@XmlElement
	public void setId(Long id) {
		this.id = id;
	}

	public String getCertificateKind() {
		return certificateKind;
	}

	@XmlElement
	public void setCertificateKind(String certificateKind) {
		this.certificateKind = certificateKind;
	}

	/* ==========================CONSTRUCTOR======================= */
	
	public EnergieCertificate(){
		
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
