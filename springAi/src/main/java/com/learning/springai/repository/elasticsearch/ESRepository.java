package com.learning.springai.repository.elasticsearch;

import com.learning.springai.entity.FirstIndexEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository("elasticRepo")
public interface ESRepository extends ElasticsearchRepository<FirstIndexEntity, UUID>{
}
