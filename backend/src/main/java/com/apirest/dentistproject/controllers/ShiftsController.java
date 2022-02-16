package com.apirest.dentistproject.controllers;

import com.apirest.dentistproject.models.ShiftsModel;
import com.apirest.dentistproject.services.ShiftsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/shifts")
public class ShiftsController {
    @Autowired
    ShiftsService shiftsService;

    @GetMapping()
    public ArrayList<ShiftsModel> getPatients(){ return shiftsService.getShifts();}

    @PostMapping()
    public ShiftsModel saveShifts(@RequestBody ShiftsModel shifts){
        return this.shiftsService.saveShifts(shifts);
    }

    @GetMapping(path = "/{id}")
    public Optional<ShiftsModel> getById(@PathVariable("id") Integer idShifts){
        return this.shiftsService.getById(idShifts);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Integer idShifts) {
        boolean ok = this.shiftsService.deleteShifts(idShifts);
        if (ok) {
            return "Se eliminó el turno con id " + idShifts;
        } else {
            return "No pudo eliminar el turno con id" + idShifts;
        }
    }

}
