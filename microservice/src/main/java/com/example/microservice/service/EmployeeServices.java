package com.example.microservice.service;



import com.example.microservice.Model.Employee;

import java.util.List;



public interface EmployeeServices {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}

