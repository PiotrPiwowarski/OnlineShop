package pl.piwowarski.onlineshop.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.lang.NonNull;
import pl.piwowarski.onlineshop.enums.ItemAvailability;
import pl.piwowarski.onlineshop.enums.ItemType;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    private String name;
    @NonNull
    private BigDecimal price;
    @NonNull
    @Enumerated(value = EnumType.STRING)
    private ItemType type;
    @NonNull
    @Enumerated(value = EnumType.STRING)
    private ItemAvailability availability;
    private byte[] image1;
    private byte[] image2;
    private byte[] image3;
    @NonNull
    private String description;
}
