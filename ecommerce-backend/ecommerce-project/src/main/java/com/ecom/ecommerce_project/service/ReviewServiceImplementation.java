package com.ecom.ecommerce_project.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecom.ecommerce_project.exception.ProductException;
import com.ecom.ecommerce_project.model.Product;
import com.ecom.ecommerce_project.model.Review;
import com.ecom.ecommerce_project.model.User;
import com.ecom.ecommerce_project.repository.ProductRepository;
import com.ecom.ecommerce_project.repository.ReviewRepository;
import com.ecom.ecommerce_project.request.ReviewRequest;

@Service
public class ReviewServiceImplementation implements ReviewService {

    private ReviewRepository reviewRepository;
    private ProductService productService;
    private ProductRepository productRepository;

    public ReviewServiceImplementation(ReviewRepository reviewRepository, ProductService productService,
            ProductRepository productRepository) {
        this.reviewRepository = reviewRepository;
        this.productService = productService;
        this.productRepository = productRepository;
    }

    @Override
    public Review createReview(ReviewRequest req, User user) throws ProductException {
        Product product = productService.findProductById(req.getProductId());

        Review review = new Review();
        review.setUser(user);
        review.setProduct(product);
        review.setReview(req.getReview());
        review.setCreatedAt(LocalDateTime.now());

        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getAllReview(Long productId) {
        return reviewRepository.getAllProductsReview(productId);
    }

}
