package pl.piwowarski.onlineshop.service.product.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.piwowarski.onlineshop.entity.Item;
import pl.piwowarski.onlineshop.enums.ItemType;
import pl.piwowarski.onlineshop.exception.NoItemsWithSuchIdException;
import pl.piwowarski.onlineshop.repository.ItemRepository;
import pl.piwowarski.onlineshop.service.product.ItemService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SimpleProductService implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public List<Item> getAllItemsByType(ItemType type) {
        return itemRepository.findAllByType(type);
    }

    @Override
    public Item getItemById(long id) {
        return itemRepository.findById(id)
                .orElseThrow(NoItemsWithSuchIdException::new);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}
