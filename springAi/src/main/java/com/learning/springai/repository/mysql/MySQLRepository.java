package com.learning.springai.repository.mysql;

import com.learning.springai.entity.MySQLEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MySQLRepository extends JpaRepository<MySQLEntity, Long> {
}
