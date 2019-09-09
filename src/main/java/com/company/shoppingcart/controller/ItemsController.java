package com.company.shoppingcart.controller;

import com.company.shoppingcart.dto.Items;
import com.company.shoppingcart.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ItemsController {
    @Autowired
    ItemService itemService;

    @RequestMapping(value="/item", method=RequestMethod.GET)
    public List<Items> getAllItems() {
        return itemService.getAllItems();
    }

    @RequestMapping(value="/item/id/{id}", method=RequestMethod.GET)
    public Items getItemById(@PathVariable Integer id) {
        return itemService.getItemById(id);
    }

    @RequestMapping(value="/item/name/{name}", method=RequestMethod.GET)
    public List<Items> getItemByName(@PathVariable String name) {
        return itemService.getItemByName(name);
    }

    @RequestMapping(value="/item/category/{category}", method= RequestMethod.GET)
    public List<Items> getItemByCategory(@PathVariable String category) {
        return itemService.getItemByCategory(category);
    }

    @RequestMapping(value="/item", method= RequestMethod.POST)
    public Items addItem(@RequestBody @Valid Items item) {
        return itemService.addItem(item);
    }

    @RequestMapping(value="/item/{id}", method= RequestMethod.PUT)
    public Items updateItem(@RequestBody @Valid Items item, @PathVariable Integer id) {
        return itemService.updateItem(item, id);
    }

    @RequestMapping(value="/item/{id}", method= RequestMethod.DELETE)
    public void deleteItem(@PathVariable Integer id) {
        itemService.deleteItem(id);
    }
}
