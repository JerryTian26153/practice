package com.example.demo.repository;

import com.example.demo.entity.Sight;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface SightRepository extends MongoRepository<Sight, String> {
    @Query("{'zone': {'$regex': ?0, '$options': 'i'}}")
    List<Sight> findByZone(String id);


}
