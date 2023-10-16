package com.ironhack.w4lab402.demo.repository;

import com.ironhack.w4lab402.demo.model.Employee;
import com.ironhack.w4lab402.demo.model.EmployeeStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findEmployeeByStatus(EmployeeStatus status);

    List<Employee> findEmployeeByDepartment(String department);
}


