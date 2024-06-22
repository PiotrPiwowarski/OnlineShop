package pl.piwowarski.onlineshop.service.product.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.piwowarski.onlineshop.entity.Product;
import pl.piwowarski.onlineshop.enums.ProductType;
import pl.piwowarski.onlineshop.exception.NoProductWithSuchIdException;
import pl.piwowarski.onlineshop.repository.ProductRepository;
import pl.piwowarski.onlineshop.service.product.ProductService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SimpleProductService implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getAllProductsByType(ProductType type) {
        return productRepository.findAllByType(type);
    }

    @Override
    public Product getProductById(long id) {
        return productRepository.findById(id)
                .orElseThrow(NoProductWithSuchIdException::new);
    }
}
