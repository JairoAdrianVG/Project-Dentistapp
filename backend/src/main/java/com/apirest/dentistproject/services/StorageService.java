package com.apirest.dentistproject.services;

import com.apirest.dentistproject.models.ShiftsModel;
import com.apirest.dentistproject.models.StorageModel;
import com.apirest.dentistproject.repositories.ShiftsRepository;
import com.apirest.dentistproject.repositories.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StorageService {
    @Autowired
    StorageRepository storageRepository;

    public ArrayList<StorageModel> getStorage(){
        return (ArrayList<StorageModel>) storageRepository.findAll();
    }

    public StorageModel saveStorage(StorageModel storage){
        return storageRepository.save(storage);
    }

    public Optional<StorageModel> getById(Integer idItem){
        return storageRepository.findById(idItem);
    }

    public boolean deleteItem(Integer idItem){
        try{
            storageRepository.deleteById(idItem);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
