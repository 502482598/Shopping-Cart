package com.shoppingcart.service;

import java.math.BigDecimal;
import java.util.Map;

import com.shoppingcart.exception.NotEnoughProductsInStockException;
import com.shoppingcart.model.Product;

public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();
}
