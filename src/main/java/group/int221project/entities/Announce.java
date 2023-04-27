package group.int221project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "announces")
public class Announce {
    @Id
    private Integer announcementId;
    private String announcementTitle;
    private String announcementDescription;
    private String publishDate;
    private String closeDate;
    private String announcementDisplay;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;
}
