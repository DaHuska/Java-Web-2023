package softuni.org.mobilele.model.dto;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import softuni.org.mobilele.model.entity.enums.Transmission;

import java.math.BigDecimal;
import java.time.Year;

public record CreateOfferDTO(
        String description,
        String imageURL,
        Integer mileage,
        BigDecimal price,
        @Enumerated(EnumType.STRING)
        Transmission transmission,
        Year year
) {
}
