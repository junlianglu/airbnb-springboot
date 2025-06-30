package com.github.junlianglu.backend.repository;

import com.github.junlianglu.backend.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookingRepository extends MongoRepository<Booking, String> {
    List<Booking> findByUserId(String userId);
    List<Booking> findByPropertyId(String propertyId);
}
