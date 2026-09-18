package com.learning.springai.repository.mongodb;

import com.learning.springai.entity.MongodbEntity;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository("mongoRepo")
public interface MongoRepository extends org.springframework.data.mongodb.repository.MongoRepository<MongodbEntity, String> {
}
