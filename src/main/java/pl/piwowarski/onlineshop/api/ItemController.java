package pl.piwowarski.onlineshop.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import pl.piwowarski.onlineshop.entity.Item;
import pl.piwowarski.onlineshop.enums.ItemType;
import pl.piwowarski.onlineshop.service.product.ItemService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/items")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/all")
    public ResponseEntity<List<Item>> getAllItems() {
        return ResponseEntity.ok(itemService.getAllItems());
    }

    @GetMapping
    public ResponseEntity<List<Item>> getAllItemsByType(@NonNull @RequestParam ItemType type) {
        return ResponseEntity.ok(itemService.getAllItemsByType(type));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable long id) {
        return ResponseEntity.ok(itemService.getItemById(id));
    }
}
