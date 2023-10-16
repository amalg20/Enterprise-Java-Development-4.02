package com.ironhack.w4lab402.demo.controller.impl;

import com.ironhack.w4lab402.demo.model.Employee;
import com.ironhack.w4lab402.demo.model.EmployeeStatus;
import com.ironhack.w4lab402.demo.model.Patient;
import com.ironhack.w4lab402.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }


    @GetMapping("/patients/dateOfBirth")
    public List<Patient> getAllPatientByDateOfBirth(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
        return patientRepository.findByDateOfBirthBetween(startDate, endDate);
    }

    @GetMapping("/patients/{patientId}")
    public Patient getPatientById(@PathVariable Integer patientId) {
        Optional<Patient> patientOptional = patientRepository.findById(patientId);
        if (patientOptional.isEmpty()) return null;
        return patientOptional.get();
    }

    @GetMapping("/patients/{department}")
    public List<Patient> getAllPatientsByDepartment(@PathVariable String department) {
        return patientRepository.findByAdmittedBy_Department(department);

    }

    @GetMapping("/patientsWithEmployeeStatusOFF")
    public List<Patient> getAllPatientsByStatus() {
        return patientRepository.findByAdmittedBy_Status(EmployeeStatus.OFF);
    }
}