package com.apirest.dentistproject.repositories;

import com.apirest.dentistproject.models.StorageModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageRepository extends CrudRepository<StorageModel, Integer> {

}
