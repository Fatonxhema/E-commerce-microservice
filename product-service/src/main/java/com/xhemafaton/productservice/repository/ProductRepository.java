package com.xhemafaton.productservice.repository;

import com.xhemafaton.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String > {
}
