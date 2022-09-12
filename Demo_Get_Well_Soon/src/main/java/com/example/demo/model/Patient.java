package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int patientId;
private String patientName;
private String patientAddress;
private String patientMail;
private String patientPhone;

@OneToMany(targetEntity = DoctorList.class, cascade = CascadeType.ALL)
@JoinColumn(name="patient_FK",referencedColumnName = "patientId")
private List<DoctorList> doctors;
}
