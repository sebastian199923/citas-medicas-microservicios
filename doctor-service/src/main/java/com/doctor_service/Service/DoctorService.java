package com.doctor_service.Service;


import com.doctor_service.Entity.Doctor;
import com.doctor_service.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;


    public List<Doctor> listarDoctores() {

        return doctorRepository.findAll();
    }


    public Doctor crearDoctor(Doctor doctor) {

        return doctorRepository.save(doctor);
    }


    // Actualizar un doctor existente
    public Doctor actualizarDoctor(Long id, Doctor doctor) {
        Doctor existente = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor no encontrado"));
        existente.setNombre(doctor.getNombre());
        existente.setEspecialidad(doctor.getEspecialidad());
        existente.setHorarioDisponible(doctor.getHorarioDisponible());
        return doctorRepository.save(existente);
    }

    // Eliminar un doctor
    public void eliminarDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    // Buscar doctores por especialidad
    public List<Doctor> listarDoctoresPorEspecialidad(String especialidad) {
        return doctorRepository.findByEspecialidad(especialidad);
    }


}