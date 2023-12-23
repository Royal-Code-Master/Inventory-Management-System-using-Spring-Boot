package com.ims.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ims.app.model.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product, String>{

}
