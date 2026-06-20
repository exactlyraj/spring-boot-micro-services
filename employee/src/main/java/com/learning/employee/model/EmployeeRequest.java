package com.learning.employee.model;

public record EmployeeRequest(String firstName, String lastName, String email,String street, String city,Long addressId) {
}
