package com.unthinkable.enumeration.controller;

import com.unthinkable.enumeration.resources.EnItemType;
import com.unthinkable.enumeration.resources.Item;
import com.unthinkable.enumeration.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(
    value = "/item",
    produces = {MediaType.APPLICATION_JSON_VALUE}
)
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> findItems() {
        return itemService.findItems();
    }

    @GetMapping("/{type}")
    public List<Item> findItemByType(@PathVariable("type") EnItemType type) {
        return itemService.findItemByType(type);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Item saveItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

}
