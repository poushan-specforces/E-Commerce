package com.ecom.ecommerce_project.service;

import com.ecom.ecommerce_project.exception.CartItemException;
import com.ecom.ecommerce_project.exception.UserException;
import com.ecom.ecommerce_project.model.Cart;
import com.ecom.ecommerce_project.model.CartItem;
import com.ecom.ecommerce_project.model.Product;

public interface CartItemService {
    public CartItem createCartItem(CartItem cartItem);

    public CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws CartItemException, UserException;

    public CartItem isCartItemExist(Cart cart, Product product, String size, Long userId);

    public void removeCartItem(Long userId, Long cartItemId) throws CartItemException, UserException;

    public CartItem findCartItemById(Long cartItemId) throws CartItemException;
}
