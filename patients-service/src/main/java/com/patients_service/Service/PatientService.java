package com.patients_service.Service;

import com.patients_service.Entity.Patient;
import com.patients_service.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    // Listar todos los pacientes
    public List<Patient> listAllPatients() {
        return patientRepository.findAll();
    }

    // Obtener un paciente por su id
    public Patient getPatient(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
    }

    // Crear un nuevo paciente
    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    // Actualizar un patient que ya existe
    public Patient updatePatient(Long id, Patient patient) {
        Patient existing = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        existing.setName(patient.getName());
        existing.setDocument(patient.getDocument());
        existing.setAge(patient.getAge());
        return patientRepository.save(existing);
    }

    // Eliminar un paciente
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
