package com.johnny.manager;

import com.johnny.model.Owner;
import com.johnny.service.OwnerService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class OwnerManager implements Serializable {
    
    @EJB
    OwnerService ownerService;
    
    private Owner owner;
    
    private List<Owner> owners;
    
    @PostConstruct
    public void instance() {
        owner = new Owner();
    }
    
    public void save() {
        this.ownerService.save(owner);
    }
    
    public void update() {
        this.ownerService.update(owner);
    }
    
    public void remove() {
        this.ownerService.remove(owner);
    }
    
    public void findAll() {
        owners = this.ownerService.findAll();
    }

    public OwnerService getOwnerService() {
        return ownerService;
    }

    public void setOwnerService(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }
    
}
