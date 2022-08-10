package com.vinicius.lojinha.services;

import java.util.Optional;

import com.vinicius.lojinha.model.Product;

public interface ProductService {
	Iterable<Product> listAllProducts();
	Optional<Product> listProductById(Integer id);
	Product saveProduct(Product product);
	Product changeProduct(Product product);
	void deleteProduct(Integer id);
}
