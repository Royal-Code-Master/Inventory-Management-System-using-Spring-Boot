package com.ims.app.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ims.app.model.Product;
import com.ims.app.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;

	// add product details
	public Product addProduct(Product product) {
		return productRepo.save(product);
	}

	// get all product details
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	// find by id
	public Optional<Product> getProductById(String id) {
		return productRepo.findById(id);
	}

	// delete by id
	public boolean deleteProductById(String id) {
		Optional<Product> productOptional = productRepo.findById(id);
		if (productOptional.isPresent()) {
			productRepo.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	// filter details by categry
}
