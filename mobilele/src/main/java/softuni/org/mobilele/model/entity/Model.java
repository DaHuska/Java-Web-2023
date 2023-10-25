package softuni.org.mobilele.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import softuni.org.mobilele.model.entity.enums.Category;

import java.util.Date;

@Entity
@Table(name = "models")
public class Model extends BaseEntity {
    @Column
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column
    @Size(min = 8, max = 512)
    private String imageURL;

    @Column
    private Integer startYear;

    @Column
    private Integer endYear;

    @Column
    private Date created;

    @Column
    private Date modified;

    @OneToOne(targetEntity = Brand.class)
    private String brand;
}
