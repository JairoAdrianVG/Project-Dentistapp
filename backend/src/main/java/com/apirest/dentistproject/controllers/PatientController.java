package com.apirest.dentistproject.controllers;

import com.apirest.dentistproject.models.PatientModel;
import com.apirest.dentistproject.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/patient")

public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping()
    public ArrayList<PatientModel> getPatients(){
        return patientService.getPatients();
    }

    @PostMapping()
    public PatientModel savePatient(@RequestBody PatientModel patient){
        return this.patientService.savePatient(patient);
    }

    @GetMapping(path = "/{id}")
    public Optional<PatientModel> getById(@PathVariable("id") Integer id){
        return this.patientService.getById(id);
    }

    @GetMapping("/query")
    public ArrayList<PatientModel> getByName(@RequestParam("name") String name){
        return this.patientService.getByName(name);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        boolean ok = this.patientService.deletePatient(id);
        if (ok) {
            return "Se eliminó el usuario con id " + id;
        } else {
            return "No pudo eliminar el usuario con id" + id;
        }
    }
}
