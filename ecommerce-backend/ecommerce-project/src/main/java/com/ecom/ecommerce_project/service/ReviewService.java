package com.ecom.ecommerce_project.service;

import java.util.List;

import com.ecom.ecommerce_project.exception.ProductException;
import com.ecom.ecommerce_project.model.Review;
import com.ecom.ecommerce_project.model.User;
import com.ecom.ecommerce_project.request.ReviewRequest;

public interface ReviewService {

    public Review createReview(ReviewRequest req, User user) throws ProductException;

    public List<Review> getAllReview(Long productId);
}
