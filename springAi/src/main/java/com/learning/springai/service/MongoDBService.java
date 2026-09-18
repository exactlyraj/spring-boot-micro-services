package com.learning.springai.service;

import com.learning.springai.entity.FirstIndexEntity;
import com.learning.springai.entity.MongodbEntity;
import com.learning.springai.repository.mongodb.MongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MongoDBService {

    @Autowired
    public MongoRepository mongoRepository;

    public MongodbEntity insert(MongodbEntity mongodbEntity) {
              return mongoRepository.save(mongodbEntity);
    }
}
