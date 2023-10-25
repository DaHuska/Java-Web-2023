package softuni.org.mobilele.service.offer;

import softuni.org.mobilele.model.dto.CreateOfferDTO;

import java.util.UUID;

public interface OfferService {

    UUID createOffer(CreateOfferDTO createOfferDTO);
}
