package com.apirest.dentistproject.services;

import com.apirest.dentistproject.models.PatientModel;
import com.apirest.dentistproject.repositories.PatientRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

import java.util.ArrayList;
import java.util.List;

import static org.aspectj.util.GenericSignature.ClassTypeSignature.NONE;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class PatientServiceTest {

    @MockBean
    PatientModel patientModel;
    EntityManager entityManager;
    PatientService patientService;
    @MockBean
    PatientRepository patientRepository;

    @Test
    void savePatient() {
        ArrayList<PatientModel> arrayPatient = new ArrayList<>();
        patientModel.setName("Gerson");
        patientModel.setCodePatient(10);
        patientModel.setAge(21);
        patientModel.setEmail("gerson@gmail.com");
        patientModel.setTelephone(7552332);
        patientModel.setId(6);
        arrayPatient.add(patientModel);
        Assertions.assertFalse(arrayPatient.isEmpty());

    }


}
