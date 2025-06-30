package com.github.junlianglu.backend.repository;

import com.github.junlianglu.backend.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
