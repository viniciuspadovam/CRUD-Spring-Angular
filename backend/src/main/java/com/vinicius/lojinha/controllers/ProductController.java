package com.vinicius.lojinha.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.lojinha.model.Product;
import com.vinicius.lojinha.services.ProductServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	private ProductServiceImpl service;
	
	/**
	 * Insere um produto no banco de dados.
	 * 
	 * @param products
	 */
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	/**
	 * Lista todos os produtos.
	 */
	@GetMapping
	public Iterable<Product> listAll() {
		return service.listAllProducts();
	}
	
	/**
	 * Lista somente um produto pelo id.
	 * 
	 *  @param id
	 */
	@GetMapping("/{id}")
	public Optional<Product> listById(@PathVariable Integer id) {
		return service.listProductById(id);
	}
	
	/**
	 * Altera os atributos de um determinado produto.
	 * 
	 * @param product
	 */
	@PutMapping
	public Product change(@RequestBody Product product) {
		return service.changeProduct(product);
	}
	
	/**
	 * Delete one product by it's id.
	 * 
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Integer id) {
		service.deleteProduct(id);
	}
}
