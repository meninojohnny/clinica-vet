package com.johnny.manager;

import com.johnny.model.Patient;
import com.johnny.service.PatientService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PatientManager implements Serializable {
    
    @EJB
    private PatientService patientService;
    
    private Patient patient;
    
    private List<Patient> patients;
    
    @PostConstruct
    public void instance() {
        patient = new Patient();
    }
    
    public void save() {
        this.patientService.save(patient);
    }
    
    public void update() {
        this.patientService.update(patient);
    }
    
    public void remove() {
        this.patientService.remove(patient);
    }
    
    public void findAll() {
        patients = this.patientService.findAll();
    }

    public PatientService getPatientService() {
        return patientService;
    }

    public void setPatientService(PatientService patientService) {
        this.patientService = patientService;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
    
    
    
}
