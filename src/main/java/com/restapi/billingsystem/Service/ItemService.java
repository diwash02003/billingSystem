package com.restapi.billingsystem.Service;

import com.restapi.billingsystem.Models.Item;
import com.restapi.billingsystem.Repositories.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    public List<Item> getItem(){
        return  itemRepository.findAll();
    }
}
