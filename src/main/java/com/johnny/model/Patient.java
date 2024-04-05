package com.johnny.model;

import com.johnny.enums.GenderType;
import com.johnny.enums.SpeciesType;
import com.johnny.generic.GenericEntity;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Patient extends GenericEntity {
    
    @Id
    @SequenceGenerator(sequenceName = "seq_patient", name = "seq_patient", initialValue = 1)
    @GeneratedValue(generator = "seq_patient", strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Enumerated(EnumType.STRING)
    private GenderType gender;
    
    private SpeciesType species;
    
    private String race;
    
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    
    private String medicalStory;
    
    private String vaccinations;
    
    @OneToOne
    private Owner owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }
    
    public SpeciesType getSpecies() {
        return species;
    }

    public void setSpecies(SpeciesType species) {
        this.species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMedicalStory() {
        return medicalStory;
    }

    public void setMedicalStory(String medicalStory) {
        this.medicalStory = medicalStory;
    }

    public String getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(String vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.species);
        hash = 53 * hash + Objects.hashCode(this.race);
        hash = 53 * hash + Objects.hashCode(this.dateOfBirth);
        hash = 53 * hash + Objects.hashCode(this.medicalStory);
        hash = 53 * hash + Objects.hashCode(this.vaccinations);
        hash = 53 * hash + Objects.hashCode(this.owner);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patient other = (Patient) obj;
        if (!Objects.equals(this.species, other.species)) {
            return false;
        }
        if (!Objects.equals(this.race, other.race)) {
            return false;
        }
        if (!Objects.equals(this.dateOfBirth, other.dateOfBirth)) {
            return false;
        }
        if (!Objects.equals(this.medicalStory, other.medicalStory)) {
            return false;
        }
        if (!Objects.equals(this.vaccinations, other.vaccinations)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.owner, other.owner);
    }
    
    
    
}
