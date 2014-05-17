package com.homerenting.external;

import com.homerenting.domain.Property;
import com.homerenting.domain.UserShortProfile;
import org.codehaus.jackson.annotate.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Arthur on 17/05/14.
 */
@Entity
@Table(name="CLOUDINARY_IMAGE",uniqueConstraints = @UniqueConstraint(columnNames = "CLOUDINARY_HIGHLIGHT_IMAGE_URL"))
@NamedQueries({
        @NamedQuery(name = "CloudinaryImage.FIND_ALL", query = "SELECT ci FROM CloudinaryImage ci"),
})
@XmlRootElement(name = "users")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class CloudinaryImage implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String FIND_ALL = "Role.FIND_ALL";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "CLOUDINARY_IMAGE_ID", unique = true, nullable = false)
    private Long cloudinaryImageId;

    @Size(min = 1, max = 400)
    @Pattern(regexp = "[0-9A-Za-z ]*", message = "must contain only letters, numbers and spaces")
    @Column(name = "CLOUDINARY_HIGHLIGHT_IMAGE_URL", unique = true, nullable = true)
    private String cloudinaryHighlightImageUrl;/*800*454*/

    @Size(min = 1, max = 400)
    @Pattern(regexp = "[0-9A-Za-z ]*", message = "must contain only letters, numbers and spaces")
    @Column(name = "CLOUDINARY_DETAIL_MAIN_IMAGE_URL", unique = true, nullable = true)
    private String cloudinaryDetailMainImageUrl;/*800*454*/

    @Pattern(regexp = "[0-9A-Za-z ]*", message = "must contain only letters, numbers and spaces")
    @Column(name = "CLOUDINARY_DETAIL_THUMBNAILS_URL", unique = true, nullable = true)
    @ElementCollection(targetClass=String.class)
    private Set<String> thumbNails = new HashSet<String>();/*800*454-added on app, not on script*/

    @ManyToOne
    @JoinColumn(name="PROPERTY_ID_FK", referencedColumnName = "PROPERTY_ID")
    private Property property;

    	/* ==========================GETTERS/SETTERS======================= */

    public Long getCloudinaryImageId() {
        return cloudinaryImageId;
    }

    @XmlElement
    public void setCloudinaryImageId(Long cloudinaryImageId) {
        this.cloudinaryImageId = cloudinaryImageId;
    }

    public String getCloudinaryHighlightImageUrl() {
        return cloudinaryHighlightImageUrl;
    }

    @XmlElement
    public void setCloudinaryHighlightImageUrl(String cloudinaryHighlightImageUrl) {
        this.cloudinaryHighlightImageUrl = cloudinaryHighlightImageUrl;
    }

    public String getCloudinaryDetailMainImageUrl() {
        return cloudinaryDetailMainImageUrl;
    }

    @XmlElement
    public void setCloudinaryDetailMainImageUrl(String cloudinaryDetailMainImageUrl) {
        this.cloudinaryDetailMainImageUrl = cloudinaryDetailMainImageUrl;
    }

    public Set<String> getThumbNails() {
        return thumbNails;
    }

    @XmlElement
    public void setThumbNails(Set<String> thumbNails) {
        this.thumbNails = thumbNails;
    }

    public Property getProperty() {
        return property;
    }

    @XmlElement
    public void setProperty(Property property) {
        this.property = property;
    }
}
