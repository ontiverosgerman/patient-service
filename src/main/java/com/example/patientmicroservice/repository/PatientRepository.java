package com.example.patientmicroservice.repository;

import com.example.patientmicroservice.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
