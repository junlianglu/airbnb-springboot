package com.github.junlianglu.backend.repository;

import com.github.junlianglu.backend.model.Property;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PropertyRepository extends MongoRepository<Property, String> {
    List<Property> findByLocation(String location);
    List<Property> findByOwnerId(String ownerId);
}
