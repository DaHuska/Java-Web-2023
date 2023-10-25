package softuni.org.mobilele.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.org.mobilele.model.entity.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {

}
