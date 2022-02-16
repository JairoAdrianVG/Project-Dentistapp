package com.apirest.dentistproject.repositories;

import com.apirest.dentistproject.models.PatientModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PatientRepository extends CrudRepository<PatientModel, Integer> {
    public abstract ArrayList<PatientModel> findByName(String name);
}
