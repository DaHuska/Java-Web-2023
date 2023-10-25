package softuni.org.mobilele.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Time;

@Entity
@Table(name = "brands")
public class Brand extends BaseEntity {
    @Column
    private String name;

    @Column
    private Time created;

    @Column
    private Time modified;
}
