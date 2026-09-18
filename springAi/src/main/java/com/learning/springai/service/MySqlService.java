package com.learning.springai.service;

import com.learning.springai.entity.MySQLEntity;
import com.learning.springai.repository.mysql.MySQLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySqlService {

    @Autowired
    public MySQLRepository mySQLRepository;

    public MySQLEntity insertData(MySQLEntity mySQLEntity){
        if(mySQLEntity==null){
            throw new IllegalArgumentException("Mysql Entity is Null");
        }
        return mySQLRepository.save(mySQLEntity);
    }

}
