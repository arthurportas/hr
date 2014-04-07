package com.homerenting.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Table(name = "REGION", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
@NamedQueries({
    @NamedQuery(name = "Region.FIND_ALL", query = "SELECT r from Region r"),
    @NamedQuery(name = "Region.FIND_BY_NAME", query = "SELECT r from Region r WHERE r.name LIKE :regionName"),
    @NamedQuery(name = "Region.FIND_BY_NAME_PATTERN", query = "SELECT r from Region r WHERE r.name LIKE :regionName")
})
public class Region implements Serializable{

   /** Default value included to remove warning. Remove or modify at will. **/
   private static final long serialVersionUID = 1L;

   public static final String FIND_ALL = "Region.FIND_ALL";

   public static final String FIND_BY_NAME = "Region.FIND_BY_NAME";

   public static final String FIND_BY_NAME_PATTERN = "Region.FIND_BY_NAME_PATTERN";

   @Id
   @GeneratedValue
   private Long id;

   @NotNull
   @Size(min = 1, max = 25)
   @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
   private String name;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

}