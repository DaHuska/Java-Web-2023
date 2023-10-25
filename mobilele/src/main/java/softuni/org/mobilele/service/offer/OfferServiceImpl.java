package softuni.org.mobilele.service.offer;

import org.springframework.stereotype.Service;
import softuni.org.mobilele.model.dto.CreateOfferDTO;
import softuni.org.mobilele.repository.OfferRepository;

import java.util.UUID;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;

    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public UUID createOffer(CreateOfferDTO createOfferDTO) {
        return UUID.randomUUID();
        //TODO: continue implementing
    }
}
