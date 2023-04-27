package group.int221project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "categories")
public class Category {
    @Id
    private Integer categoryId;
    private String categoryName;
    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private Set<Announce> announce = new LinkedHashSet<>();

}
