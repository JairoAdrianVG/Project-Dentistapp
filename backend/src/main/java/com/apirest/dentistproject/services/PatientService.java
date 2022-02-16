package com.apirest.dentistproject.services;

import com.apirest.dentistproject.models.PatientModel;
import com.apirest.dentistproject.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;

    public ArrayList<PatientModel> getPatients(){
       return (ArrayList<PatientModel>) patientRepository.findAll();
    }

    public PatientModel savePatient(PatientModel patient){
        return patientRepository.save(patient);
    }

    public Optional<PatientModel> getById(Integer id){
        return patientRepository.findById(id);
    }

    public ArrayList<PatientModel> getByName(String name){
        return patientRepository.findByName(name);
    }

    public boolean deletePatient(Integer id){
        try{
            patientRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
