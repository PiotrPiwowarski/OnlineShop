package pl.piwowarski.onlineshop.service.product;

import org.springframework.stereotype.Service;
import pl.piwowarski.onlineshop.entity.Product;
import pl.piwowarski.onlineshop.enums.ProductType;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getAllProductsByType(ProductType type);

    Product getProductById(long id);
}
