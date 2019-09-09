package com.company.shoppingcart.service;

import com.company.shoppingcart.dao.ItemsRepository;
import com.company.shoppingcart.dto.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ItemService {
    @Autowired
    ItemsRepository itemRepo;
    private List<String> categories = Arrays.asList("books", "food", "medical", "luxury items", "music", "clothes");

    public List<Items> getAllItems() {
        return itemRepo.findAll();
    }

    public Items getItemById(Integer id) {
        return itemRepo.getOne(id);
    }

    public List<Items> getItemByName(String name) {
        return itemRepo.findByName(name);
    }

    public List<Items> getItemByCategory(String category) {
        return itemRepo.findByCategory(category);
    }

    public Items addItem(Items item) {
//        String category = item.getCategory().toLowerCase();
//
//        if(categories.contains(category)) {
//            return itemRepo.save(item);
//        }
//        return null;
        return itemRepo.save(item);
    }

    public Items updateItem(Items item, Integer id) {
        if(item.getId() == id) {
            return itemRepo.save(item);
        }
        return null;
    }

    public void deleteItem(Integer id) {
        itemRepo.deleteById(id);
    }
}
