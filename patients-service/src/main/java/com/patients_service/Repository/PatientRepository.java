package com.patients_service.Repository;

import com.patients_service.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}