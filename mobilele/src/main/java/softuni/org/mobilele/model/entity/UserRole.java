package softuni.org.mobilele.model.entity;

import jakarta.persistence.*;
import softuni.org.mobilele.model.entity.enums.Role;

@Entity
@Table(name = "user_roles")
public class UserRole extends BaseEntity {
    @Column
    @Enumerated(EnumType.STRING)
    private Role role;
}
