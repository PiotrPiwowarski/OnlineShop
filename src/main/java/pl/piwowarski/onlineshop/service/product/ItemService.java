package pl.piwowarski.onlineshop.service.product;

import org.springframework.stereotype.Service;
import pl.piwowarski.onlineshop.entity.Item;
import pl.piwowarski.onlineshop.enums.ItemType;

import java.util.List;

@Service
public interface ItemService {

    List<Item> getAllItemsByType(ItemType type);

    Item getItemById(long id);

    List<Item> getAllItems();
}
