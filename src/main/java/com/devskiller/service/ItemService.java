package com.devskiller.service;

import com.devskiller.dao.ItemRepository;
import com.devskiller.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<String> getTitlesWithAverageRatingLowerThan(Double rating) {


        return null;
    }

}
