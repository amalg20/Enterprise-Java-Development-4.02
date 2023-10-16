package com.ironhack.w4lab402.demo.repository;

import com.ironhack.w4lab402.demo.model.Employee;
import com.ironhack.w4lab402.demo.model.EmployeeStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @BeforeEach
    public void setUp() {
        Employee emp1 = new Employee(356712, "cardiology", "Alonso Flores", EmployeeStatus.ON_CALL);
        Employee emp2 = new Employee(564134, "immunology", "Sam Ortega", EmployeeStatus.ON);
        Employee emp3 = new Employee(761527, "cardiology", "German Ruiz", EmployeeStatus.OFF);
        Employee emp4 = new Employee(166552, "pulmonary", "Maria Lin", EmployeeStatus.ON);
        Employee emp5 = new Employee(156545, "orthopaedic", "Paolo Rodriguez", EmployeeStatus.ON_CALL);
        Employee emp6 = new Employee(172456, "psychiatric", "John Paul Armes", EmployeeStatus.OFF);

        employeeRepository.save(emp1);
        employeeRepository.save(emp2);
        employeeRepository.save(emp3);
        employeeRepository.save(emp4);
        employeeRepository.save(emp5);
        employeeRepository.save(emp6);


    }

}