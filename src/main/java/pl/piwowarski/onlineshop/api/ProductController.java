package pl.piwowarski.onlineshop.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.piwowarski.onlineshop.entity.Product;
import pl.piwowarski.onlineshop.enums.ProductType;
import pl.piwowarski.onlineshop.service.product.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProductsByType(@RequestParam ProductType type) {
        return ResponseEntity.ok(productService.getAllProductsByType(type));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }
}
