package com.company.shoppingcart.controller;

import com.company.shoppingcart.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartController {
    @Autowired
    ShoppingCartService cartService;
}
