package com.apirest.dentistproject.services;

import com.apirest.dentistproject.models.PatientModel;
import com.apirest.dentistproject.models.ShiftsModel;
import com.apirest.dentistproject.repositories.PatientRepository;
import com.apirest.dentistproject.repositories.ShiftsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ShiftsService {
    @Autowired
    ShiftsRepository shiftsRepository;

    public ArrayList<ShiftsModel> getShifts(){
        return (ArrayList<ShiftsModel>) shiftsRepository.findAll();
    }

    public ShiftsModel saveShifts(ShiftsModel shifts){
        return shiftsRepository.save(shifts);
    }

    public Optional<ShiftsModel> getById(Integer idShifts){
        return shiftsRepository.findById(idShifts);
    }

    public boolean deleteShifts(Integer idShifts){
        try{
            shiftsRepository.deleteById(idShifts);
            return true;
        }catch (Exception err){
            return false;
        }
    }

}
