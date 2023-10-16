package com.ironhack.w4lab402.demo.controller.impl;

import com.ironhack.w4lab402.demo.controller.interfaces.IEmployeeController;
import com.ironhack.w4lab402.demo.model.Employee;
import com.ironhack.w4lab402.demo.model.EmployeeStatus;
import com.ironhack.w4lab402.demo.repository.EmployeeRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController implements IEmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping("/employees")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }


    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable Integer employeeId) {
        Optional<Employee> employeeOptional = employeeRepository.findById(employeeId);
        if (employeeOptional.isEmpty()) return null;
        System.out.println(employeeOptional);
        return employeeOptional.get();
    }

    @GetMapping("/employees/status")
    public List<Employee> getEmployeeByStatus(@RequestParam EmployeeStatus status) {
        List<Employee> empList = employeeRepository.findEmployeeByStatus(status);
        return empList;
    }

    @GetMapping("/employees/department")
    public List<Employee> getEmployeeByDepartment(@RequestParam String department) {
        List<Employee> empList = employeeRepository.findEmployeeByDepartment(department);
        return empList;
    }


}
