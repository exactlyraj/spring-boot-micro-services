package com.learning.employee.service;

import com.learning.address.model.AddressResponse;
import com.learning.employee.feignclient.feingnClient;
import com.learning.employee.model.*;
import com.learning.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

   @Autowired
   feingnClient.AddressFeingClient addressFeingClient;


    /**
     * @param employeeRequest
     * @return
     */
    @Override
    public EmployeeTable createEmployee(EmployeeRequest employeeRequest) {
        EmployeeTable employeeTable = new EmployeeTable();
        employeeTable.setFirstName(employeeRequest.firstName());
        employeeTable.setLastName(employeeRequest.lastName());
        employeeTable.setEmail(employeeRequest.email());
        employeeTable.setAddressId(employeeRequest.addressId());
        return employeeRepository.save(employeeTable);
    }

    public List<EmployeeTable> createEmployees(List<EmployeeTable> employeeTablelist){
        return employeeRepository.saveAll(employeeTablelist);
    }

    /**
     * @param employeeId
     * @return
     */
    @Override
    public EmployeeResponse getEmployee(Long employeeId, Long addressId) {
        AddressResponse addressResponse = addressFeingClient.getAddressbyId(addressId);
        EmployeeTable employeeTable = employeeRepository.findById(employeeId).get();
        return new EmployeeResponse (employeeTable.getFirstName(),employeeTable.getLastName(),employeeTable.getEmail(),
                addressResponse.city(),addressResponse.state());
    }

    /**
     * @param adressRecord
     * @return
     */
    @Override
    public EmployeeRecord addEmployeeAddress(AddressRecord adressRecord) {
        return null;
    }
}
