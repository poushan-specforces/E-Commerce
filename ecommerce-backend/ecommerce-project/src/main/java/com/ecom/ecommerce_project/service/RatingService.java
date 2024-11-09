package com.ecom.ecommerce_project.service;

import java.util.List;

import com.ecom.ecommerce_project.exception.ProductException;
import com.ecom.ecommerce_project.model.Rating;
import com.ecom.ecommerce_project.model.User;
import com.ecom.ecommerce_project.request.RatingRequest;

public interface RatingService {

    public Rating createRating(RatingRequest req, User user) throws ProductException;

    public List<Rating> getProductsRating(Long productId);
}
