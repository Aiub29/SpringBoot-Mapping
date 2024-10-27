package com.aiub.SpringBootMapping.controller;

import com.aiub.SpringBootMapping.entity.Employee;
import com.aiub.SpringBootMapping.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeControler {
    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping("/saveEmployee")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> employeeList){
        employeeRepo.saveAll(employeeList);
        return  ResponseEntity.ok("Date has been Saved");

    }
}
