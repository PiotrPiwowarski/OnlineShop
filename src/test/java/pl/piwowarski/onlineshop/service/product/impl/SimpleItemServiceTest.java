package pl.piwowarski.onlineshop.service.product.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pl.piwowarski.onlineshop.entity.Item;
import pl.piwowarski.onlineshop.enums.ItemAvailability;
import pl.piwowarski.onlineshop.enums.ItemType;
import pl.piwowarski.onlineshop.exception.NoItemsWithSuchIdException;
import pl.piwowarski.onlineshop.repository.ItemRepository;
import pl.piwowarski.onlineshop.service.product.ItemService;

import java.math.BigDecimal;
import java.util.List;

public class SimpleItemServiceTest {

    private final ItemRepository itemRepository = Mockito.mock(ItemRepository.class);
    private final ItemService productService = new SimpleProductService(itemRepository);
    private final Item item = Item.builder()
            .id(1L)
            .availability(ItemAvailability.HIGH)
            .description("nice product...")
            .price(BigDecimal.valueOf(20))
            .type(ItemType.BREAD)
            .name("Scher")
            .build();
    private final List<Item> itemListOfTypeBread = List.of(item);

    @Test
    public void ifItemsListOfOneThenReturnsTrue() {
        Mockito.when(itemRepository.findAll()).thenReturn(itemListOfTypeBread);

        List<Item> allItems = productService.getAllItems();

        Assertions.assertEquals(1, allItems.size());
    }

    @Test
    public void ifProductTypeBREADThenReturnsListOfOne() {
        Mockito.when(itemRepository.findAllByType(ItemType.BREAD)).thenReturn(itemListOfTypeBread);

        List<Item> allProductsByType = productService.getAllItemsByType(ItemType.BREAD);

        Assertions.assertEquals(1, allProductsByType.size());
    }

    @Test
    public void ifIdOutOfBoundThenThrowsException() {
        Mockito.when(itemRepository.findById(2L)).thenThrow(NoItemsWithSuchIdException.class);

        Assertions.assertThrows(NoItemsWithSuchIdException.class, () -> productService.getItemById(2L));
    }
}
