package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.DoctorList;
import com.example.demo.model.Patient;
import java.util.List;
import com.example.demo.repository.DocterRepo;
import com.example.demo.repository.PatientRepo;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	DocterRepo doctorrepo;
	
	@Autowired
	PatientRepo patientrepo;
	
	public List<Patient> getAllPatient() {
		return patientrepo.findAll();
		
	}
	
	public List<DoctorList> getAllDoctor() {
		return doctorrepo.findAll();
		
	}
	
	
	public Patient bookAppointment(Patient patient) {
		return patientrepo.save(patient);
		
	}
	
	
	
	
	

}
