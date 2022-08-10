package com.vinicius.lojinha.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.lojinha.model.Product;
import com.vinicius.lojinha.model.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository repository;

	@Override
	public Iterable<Product> listAllProducts() {
		System.out.println("Listando todos os produtos:" );
		return repository.findAll();
	}

	@Override
	public Optional<Product> listProductById(Integer id) {
		System.out.println("Listando produto pelo id:" );
		return repository.findById(id);
	}

	@Override
	public Product saveProduct(Product product) {
		System.out.println("Inserindo produto:" );
		return repository.save(product);
	}

	@Override
	public Product changeProduct(Product product) {
		System.out.println("Alterando produto: ");
		return repository.save(product);
	}
	
	@Override
	public void deleteProduct(Integer id) {
		System.out.println("Deletando produto: ");
		repository.deleteById(id);
	}
}
