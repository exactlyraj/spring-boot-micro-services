package com.learning.employee.service;

import com.learning.employee.model.*;

import java.util.List;

public interface EmployeeService {

    public EmployeeTable createEmployee(EmployeeRequest employeeRequest);
    public List<EmployeeTable> createEmployees(List<EmployeeTable> employeeRequest);
    public EmployeeResponse getEmployee(Long employeeId,Long addressId);
    public EmployeeRecord addEmployeeAddress(AddressRecord adressRecord);
}
