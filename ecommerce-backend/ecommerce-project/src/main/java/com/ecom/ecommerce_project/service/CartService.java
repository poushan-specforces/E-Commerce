package com.ecom.ecommerce_project.service;

import com.ecom.ecommerce_project.exception.ProductException;
import com.ecom.ecommerce_project.model.Cart;
import com.ecom.ecommerce_project.model.User;
import com.ecom.ecommerce_project.request.AddItemRequest;

public interface CartService {

    public Cart createCart(User user);

    public String addCartItem(Long userId, AddItemRequest req) throws ProductException;

    public Cart findUserCart(Long userId);

}
