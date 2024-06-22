package pl.piwowarski.onlineshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.piwowarski.onlineshop.entity.Product;
import pl.piwowarski.onlineshop.enums.ProductType;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByType(ProductType type);
}
