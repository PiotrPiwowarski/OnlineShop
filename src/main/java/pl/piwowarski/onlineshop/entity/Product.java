package pl.piwowarski.onlineshop.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.lang.NonNull;
import pl.piwowarski.onlineshop.enums.Availability;
import pl.piwowarski.onlineshop.enums.ProductType;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Table(name = "PRODUCTS")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    @NonNull
    private String productName;
    @NonNull
    private BigDecimal productPrice;
    @NonNull
    private ProductType productType;
    @NonNull
    private Availability productAvailability;
    @NonNull
    private byte[] productImage1;
    private byte[] productImage2;
    private byte[] productImage3;
    @NonNull
    private String productDescription;
}
