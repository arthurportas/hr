package com.homerenting.domain;

import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by Arthur on 21/04/14.
 */
@Entity
@Table(name = "APARTMENT", uniqueConstraints = @UniqueConstraint(columnNames = "APARTMENT_DESCRIPTION"))
@NamedQueries({
        @NamedQuery(name = "Apartment.FIND_ALL", query = "SELECT a from Apartment a")
})
public class Apartment implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Apartment.FIND_ALL";

    @Id
    @GeneratedValue
    @Column(name = "APARTMENT_ID", unique = true, nullable = false)
    private Long apartmentId;

    @NotNull
    @Size(min = 1, max = 200)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "APARTMENT_DESCRIPTION", unique = true, nullable = false)
    private String apartmentDescription = StringUtils.EMPTY;

    public Long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Long apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getApartmentDescription() {
        return apartmentDescription;
    }

    public void setApartmentDescription(String apartmentDescription) {
        this.apartmentDescription = apartmentDescription;
    }
}
