package com.johnny.service;

import com.johnny.generic.GenericService;
import com.johnny.model.Consultation;
import javax.ejb.Stateless;

@Stateless
public class ConsultationService extends GenericService<Consultation> {
    
    public ConsultationService() {
        super(Consultation.class);
    }
    
    public void remove(Consultation consultation) {
        consultation.setActive(Boolean.FALSE);
        this.getEntityManager().merge(consultation);
    }
    
}
