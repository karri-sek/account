package com.snlabs.aarogyatelangana.account.service;

import java.util.List;

import com.snlabs.aarogyatelangana.account.beans.Patient;

public interface PatientService {
	//Insert patient details into the DB and returns the patient ID 
   public int createPatientRecord(Patient patient);
   
   public Patient searchPatientById(int patientId);
   
   public Patient searchPatientByName(String patientName);
   
   public List<Patient> getPatientProfiles(String createdBy);
}
