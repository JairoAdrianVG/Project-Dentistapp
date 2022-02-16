package com.apirest.dentistproject.repositories;

import com.apirest.dentistproject.models.ShiftsModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftsRepository extends CrudRepository<ShiftsModel, Integer> {

}
