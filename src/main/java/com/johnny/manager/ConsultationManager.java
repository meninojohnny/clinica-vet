package com.johnny.manager;

import com.johnny.model.Consultation;
import com.johnny.service.ConsultationService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ConsultationManager implements Serializable {
    
    @EJB
    private ConsultationService consultationService;
    
    private Consultation consultation;
    
    private List<Consultation> consultations;
    
    @PostConstruct
    public void instance() {
        consultation = new Consultation();
    }
    
    public void sasve() {
        this.consultationService.save(consultation);
    }
    
    public void update() {
        this.consultationService.update(consultation);
    }
    
    public void remove() {
        this.consultationService.remove(consultation);
    }
    
    public void findAll() {
        consultations = this.consultationService.findAll();
    }

    public ConsultationService getConsultationService() {
        return consultationService;
    }

    public void setConsultationService(ConsultationService consultationService) {
        this.consultationService = consultationService;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public List<Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<Consultation> consultations) {
        this.consultations = consultations;
    }
    
    
    
}
