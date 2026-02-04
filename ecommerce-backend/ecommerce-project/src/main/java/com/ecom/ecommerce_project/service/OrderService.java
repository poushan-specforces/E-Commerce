package com.ecom.ecommerce_project.service;

import java.util.List;

import com.ecom.ecommerce_project.exception.OrderException;
import com.ecom.ecommerce_project.model.Address;
import com.ecom.ecommerce_project.model.Order;
import com.ecom.ecommerce_project.model.User;

public interface OrderService {
    public Order createOrder(User user, Address shippingAddress);

    public Order findOrderById(Long orderId) throws OrderException;

    public List<Order> usersOrderHistory(Long userId);

    public Order placedOrder(Long orderId) throws OrderException;

    public Order confirmedOrder(Long orderId) throws OrderException;
    
    public Order shippedOrder(Long orderId) throws OrderException;
    
    public Order deliveredOrder(Long orderId) throws OrderException;
    
    public Order canceledOrder(Long orderId) throws OrderException;

    public List<Order> getAllOrders();

    public void deleteOrder(Long orderId) throws OrderException;
}
