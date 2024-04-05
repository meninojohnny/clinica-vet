package com.johnny.service;

import com.johnny.generic.GenericService;
import com.johnny.model.Patient;
import javax.ejb.Stateless;

@Stateless
public class PatientService extends GenericService<Patient> {
    
    public PatientService() {
        super(Patient.class);
    }
    
    public void remove(Patient patient) {
        patient.setActive(Boolean.FALSE);
        this.getEntityManager().merge(patient);
    }
    
}
