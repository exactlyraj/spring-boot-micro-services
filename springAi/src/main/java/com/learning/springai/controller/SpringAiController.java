package com.learning.springai.controller;

import com.learning.springai.GlobalException.ResourceNotFoundException;
import com.learning.springai.entity.FirstIndexEntity;
import com.learning.springai.entity.MongodbEntity;
import com.learning.springai.entity.MySQLEntity;
import com.learning.springai.service.ESIndexService;
//import com.learning.springai.service.MongoDBService;
import com.learning.springai.service.MongoDBService;
import com.learning.springai.service.MySqlService;
import com.learning.springai.service.SpringAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpringAiController {

    private SpringAiService springAiService;

    SpringAiController(SpringAiService springAiService){
        this.springAiService = springAiService;
    }

    @GetMapping("/ask")
    public ResponseEntity<String> askModel(@RequestParam String prompt){
        return ResponseEntity.ok(springAiService.call(prompt));
    }

    @Autowired
    public ESIndexService eSIndexService;

    @Autowired
    MySqlService mySqlService;

    @Autowired
    public MongoDBService mongoDBService;

    @PostMapping("/insertines")
    public ResponseEntity<?> insertintoES(@RequestBody FirstIndexEntity prompt){
        if(prompt.getPublished_at().isBlank()){
            throw new ResourceNotFoundException("Published date is null");
        }
        return ResponseEntity.ok(eSIndexService.insert(prompt));
    }

    @PostMapping("/insertinmysql")
    public ResponseEntity<?> insertintomysql(@RequestBody MySQLEntity prompt){
        if(prompt.getPublished_at().isBlank()){
            throw new ResourceNotFoundException("Published date is null");
        }
        return ResponseEntity.ok(mySqlService.insertData(prompt));
    }

    @PostMapping("/insertinmd")
    public ResponseEntity<?> insertintoMongoDB(@RequestBody MongodbEntity prompt){
        if(prompt.getPublished_at().isBlank()){
            throw new ResourceNotFoundException("Published date is null");
        }
        return ResponseEntity.ok(mongoDBService.insert(prompt));
    }

}
