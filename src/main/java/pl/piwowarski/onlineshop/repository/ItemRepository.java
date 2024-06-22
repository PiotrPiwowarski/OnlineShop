package pl.piwowarski.onlineshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.piwowarski.onlineshop.entity.Item;
import pl.piwowarski.onlineshop.enums.ItemType;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findAllByType(ItemType type);
}
