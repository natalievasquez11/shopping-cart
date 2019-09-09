package com.company.shoppingcart.service;

import com.company.shoppingcart.dao.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartService {
    @Autowired
    ItemsRepository itemRepo;

    

}
