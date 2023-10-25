package softuni.org.mobilele.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.JdbcType;
import org.hibernate.annotations.JdbcTypeCode;
import softuni.org.mobilele.model.entity.enums.Transmission;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Types;
import java.time.Year;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity {
    @JdbcTypeCode(Types.VARCHAR)
    private UUID uuid;

    @Column
    @NotNull
    private String description;

    @Column
    @NotNull
    private String imageURL;

    @Column
    @NotNull
    private Integer mileage;

    @Column
    @NotNull
    private BigDecimal price;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private Transmission transmission;

    @Column
    @NotNull
    private Year year;

    @Column
    private Date created;

    @Column
    private Date modified;

    @OneToOne(targetEntity = User.class)
    private User seller;

    @OneToOne(targetEntity = Model.class)
    private Model model;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
