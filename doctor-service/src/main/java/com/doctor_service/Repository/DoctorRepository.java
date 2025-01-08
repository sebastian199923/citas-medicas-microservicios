package com.doctor_service.Repository;


import com.doctor_service.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    //Buscar por especialidad
    List<Doctor> findByEspecialidad(String especialidad);
}