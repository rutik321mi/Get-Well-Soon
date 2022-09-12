package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Docter_List")
public class DoctorList {
@Id
private int docId;
@Column(name = "Doctor_Name")
private String docName;
@Column(name = "Address")
private String docAddress;
@Column(name = "Timings")
private String docTiming;
@Column(name = "Department")
private String docDepartment;
@Column(name = "Consultation_Fess")
private String docFees;
@Column(name = "Doctor_Qualification")
private String docQualification;
@Column(name = "Experience_in_years")
private String docExperience;
@Column(name = "E-mail_Id")
private String docMail;

	
	
}
