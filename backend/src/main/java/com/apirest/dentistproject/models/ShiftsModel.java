package com.apirest.dentistproject.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.*;
import javax.persistence.*;

@Data
@Entity
@Table (name = "shifts")
public class ShiftsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idShifts;
    private Integer codeShifts;
    private Integer codePatient;
    private String namePatient;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date shiftsDate;
}
