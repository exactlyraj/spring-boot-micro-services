package com.learning.employee.controller;

import com.learning.employee.model.*;
import com.learning.employee.service.EmployeeService;
import com.learning.employee.service.EmployeeServiceImpl;
import com.learning.springai.entity.FirstIndexEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceimpl;
    //Create Employee
    @PostMapping("/create")
    public ResponseEntity<EmployeeTable> createEmployee(@RequestBody EmployeeRequest employeeRequest){
        EmployeeTable employeeTables = employeeServiceimpl.createEmployee(employeeRequest);
        return  ResponseEntity.ok(employeeTables);
    }

    @PostMapping("/createlist")
    public ResponseEntity<List<EmployeeTable>> createEmployee(@RequestBody List<EmployeeTable> employeesRequest){
            return  ResponseEntity.ok(employeeServiceimpl.createEmployees(employeesRequest));
    }

    //Get Employee
    @GetMapping("/getbyid/{id}")
    public ResponseEntity<EmployeeResponse> createEmployee(@PathVariable Long id){
        return  ResponseEntity.ok(employeeServiceimpl.getEmployee(id,id));
    }

    @PostMapping("/insertines")
    public ResponseEntity<ESEntity> insertintoES(@RequestBody ESEntity prompt){
          return ResponseEntity.ok(employeeServiceimpl.insertinES(prompt));
    }
}
