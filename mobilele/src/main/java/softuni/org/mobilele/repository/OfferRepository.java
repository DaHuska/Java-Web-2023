package softuni.org.mobilele.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.org.mobilele.model.entity.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {

}
