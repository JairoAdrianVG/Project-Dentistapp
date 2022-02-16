package com.apirest.dentistproject.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "patient")
public class PatientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;
    private Integer codePatient;
    private String name;
    private Integer age;
    private Integer telephone;
    private String email;
}
