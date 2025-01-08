package com.doctor_service.Controller;


import com.doctor_service.Entity.Doctor;
import com.doctor_service.Service.DoctorService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctores")

public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    // Listar todos los doctores
    @GetMapping
    public List<Doctor> listarDoctores() {
        return doctorService.listarDoctores();
    }

    // Crear un nuevo doctor
    @PostMapping
    public Doctor crearDoctor(@RequestBody Doctor doctor) {
        return doctorService.crearDoctor(doctor);
    }


    // Actualizar un doctor existente
    @PutMapping("/{id}")
    public Doctor actualizarDoctor(@PathVariable Long id, @RequestBody Doctor doctor) {
        System.out.println("ENTRO A VERIFICAR LOS DOCTORES");
        return doctorService.actualizarDoctor(id, doctor);
    }

    // Eliminar un doctor
    @DeleteMapping("/{id}")
    public void eliminarDoctor(@PathVariable Long id) {
        doctorService.eliminarDoctor(id);
    }

    // Buscar doctores por especialidad
    @GetMapping("/especialidad/{especialidad}")
    public List<Doctor> listarDoctoresPorEspecialidad(@PathVariable String especialidad) {
        return doctorService.listarDoctoresPorEspecialidad(especialidad);
    }



}