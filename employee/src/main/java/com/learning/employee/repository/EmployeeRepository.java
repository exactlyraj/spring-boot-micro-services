package com.learning.employee.repository;

import com.learning.employee.model.EmployeeTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeTable, Long> {
}
