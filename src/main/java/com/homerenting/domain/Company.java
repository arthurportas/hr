package com.homerenting.domain;

import com.homerenting.domain.modules.header.contacts.EmailContact;
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
@Table(name = "COMPANY", uniqueConstraints = @UniqueConstraint(columnNames = "COMPANY_NAME"))
@NamedQueries({
        @NamedQuery(name = "Company.FIND_ALL", query = "SELECT c from Company c")
})
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Company.FIND_ALL";

    @Id
    @GeneratedValue
    @Column(name = "COMPANY_ID", unique = true, nullable = false)
    private Long companyId;


    @NotNull
    @Size(min = 1, max = 200)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
    @Column(name = "COMPANY_NAME", unique = true, nullable = false)
    private String companyName = StringUtils.EMPTY;


/*
    private EmailContact emailContact;
*/
}
