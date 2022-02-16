package com.apirest.dentistproject.controllers;

import com.apirest.dentistproject.models.ShiftsModel;
import com.apirest.dentistproject.models.StorageModel;
import com.apirest.dentistproject.services.ShiftsService;
import com.apirest.dentistproject.services.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/storage")
public class StorageController {
    @Autowired
    StorageService storageService;

    @GetMapping()
    public ArrayList<StorageModel> getStorage(){ return storageService.getStorage();}

    @PostMapping()
    public StorageModel saveStorage(@RequestBody StorageModel storage){
        return this.storageService.saveStorage(storage);
    }

    @GetMapping(path = "/{id}")
    public Optional<StorageModel> getById(@PathVariable("id") Integer idItem){
        return this.storageService.getById(idItem);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Integer idItem) {
        boolean ok = this.storageService.deleteItem(idItem);
        if (ok) {
            return "Se eliminó el item con id " + idItem;
        } else {
            return "No pudo eliminar el item con id" + idItem;
        }
    }
}
