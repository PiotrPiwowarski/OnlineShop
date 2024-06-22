package pl.piwowarski.onlineshop.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.lang.NonNull;
import pl.piwowarski.onlineshop.enums.ProductAvailability;
import pl.piwowarski.onlineshop.enums.ProductType;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    private String name;
    @NonNull
    private BigDecimal price;
    @NonNull
    private ProductType type;
    @NonNull
    private ProductAvailability availability;
    private byte[] image1;
    private byte[] image2;
    private byte[] image3;
    @NonNull
    private String description;
}
