package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.*;
import com.example.demo.request.PatientRequest;
import com.example.demo.service.Service;

@RestController
public class DemoController {
	
	@Autowired
	Service service;
	
	@GetMapping("/")
	public List<Patient> getPatient(){
		return service.getAllPatient();
		
	}
	
	@GetMapping("/{id}")
	public List<DoctorList> getDocter(){
		return service.getAllDoctor();
	}
   
	
	@PostMapping("/book")
	public Patient bookAppointment(@RequestBody Patient patient  ) {
		return service.bookAppointment(patient);
	}
	
	
	
	
}
