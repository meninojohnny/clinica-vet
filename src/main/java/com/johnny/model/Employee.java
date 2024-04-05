package com.johnny.model;

import com.johnny.enums.GenderType;
import com.johnny.enums.OfficeType;
import com.johnny.generic.GenericEntity;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee extends GenericEntity {
   
    @Id
    @SequenceGenerator(sequenceName = "seq_employee", name = "seq_employee", initialValue = 1)
    @GeneratedValue(generator = "seq_employee", strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String name;
    
    @Enumerated(EnumType.STRING)
    private GenderType gender;
    
    @Enumerated(EnumType.STRING)
    private OfficeType office;
    
    private String phone;
    
    private String email;
    
    @Temporal(TemporalType.DATE)
    private Date dateOfHiring;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public OfficeType getOffice() {
        return office;
    }

    public void setOffice(OfficeType office) {
        this.office = office;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(Date dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.office, other.office)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.dateOfHiring, other.dateOfHiring);
    }
    
    
    
}
