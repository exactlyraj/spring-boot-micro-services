
package com.learning.springai.service;

import com.learning.springai.entity.FirstIndexEntity;
import com.learning.springai.repository.elasticsearch.ESRepository;
//import com.learning.springai.repository.mongodb.MongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ESIndexService {
/*
    private final ElasticsearchClient client;

    public ESIndexService(ElasticsearchClient client) {
        this.client = client;
    }

    public void createSemanticIndex() throws IOException {
        CreateIndexResponse response = client.indices().create(c -> c
                .index("semantic_docs")
                .mappings(m -> m
                        .properties("content", p -> p.text(t -> t))
                        .properties("embedding", p -> p
                                .denseVector(v -> v.dims(768)) // adjust dims to match your embedding model
                        )
                )
        );

        if (response.acknowledged()) {
            System.out.println("Index 'semantic_docs' created successfully!");
        } else {
            System.out.println("Index creation not acknowledged.");
        }
    }


*/
@Autowired
public ESRepository ESRepository;


    public FirstIndexEntity insert(FirstIndexEntity firstIndex) {
        return ESRepository.save(firstIndex);
    }
}