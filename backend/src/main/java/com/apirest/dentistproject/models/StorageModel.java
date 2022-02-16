package com.apirest.dentistproject.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "storage")
public class StorageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idItem;
    private Integer codeItem;
    private String name;
    private String typeItem;
    private Integer amount;
}
