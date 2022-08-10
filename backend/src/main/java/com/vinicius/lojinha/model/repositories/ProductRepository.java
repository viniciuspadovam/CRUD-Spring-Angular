package com.vinicius.lojinha.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.lojinha.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
