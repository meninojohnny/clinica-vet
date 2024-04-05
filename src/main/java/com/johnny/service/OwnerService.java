package com.johnny.service;

import com.johnny.generic.GenericService;
import com.johnny.model.Owner;
import javax.ejb.Stateless;

@Stateless
public class OwnerService extends GenericService<Owner> {
    
    public OwnerService() {
        super(Owner.class);
    }
    
    public void remove(Owner owner) {
        owner.setActive(Boolean.FALSE);
        this.getEntityManager().merge(owner);
    }
    
}
