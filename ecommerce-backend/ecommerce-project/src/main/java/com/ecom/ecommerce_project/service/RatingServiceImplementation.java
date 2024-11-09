package com.ecom.ecommerce_project.service;

import java.time.LocalDateTime;
import java.util.List;

import com.ecom.ecommerce_project.exception.ProductException;
import com.ecom.ecommerce_project.model.Product;
import com.ecom.ecommerce_project.model.Rating;
import com.ecom.ecommerce_project.model.User;
import com.ecom.ecommerce_project.repository.RatingRepository;
import com.ecom.ecommerce_project.request.RatingRequest;

public class RatingServiceImplementation implements RatingService {

    private RatingRepository ratingRepository;

    private ProductService productService;
    
    public RatingServiceImplementation(RatingRepository ratingRepository, ProductService productService) {
        this.ratingRepository = ratingRepository;
        this.productService = productService;
    }

    @Override
    public Rating createRating(RatingRequest req, User user) throws ProductException {
        Product product = productService.findProductById(req.getProductId());

        Rating rating = new Rating();
        rating.setProduct(product);
        rating.setUser(user);
        rating.setRating(req.getRating());
        rating.setCreatedAt(LocalDateTime.now());

        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getProductsRating(Long productId) {
        return ratingRepository.getAllProductsRating(productId);
    }

}
