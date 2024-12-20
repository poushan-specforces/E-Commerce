package com.ecom.ecommerce_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.ecommerce_project.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);
}
