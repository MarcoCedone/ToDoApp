/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tss
 */



@Entity
public class ToDo implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String testo;
    @Temporal(TemporalType.DATE)
    private Date dataCreazione;
    @ManyToMany
    private Set<Categoria> categorie;
    

    public long getId() {
        return id;
    }

    public String getTesto() {
        return testo;
    }

    public Date getDataCreazione() {
        return dataCreazione;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public void setDataCreazione(Date dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ToDo other = (ToDo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public Set<Categoria> getCategorie() {
        return categorie;
    }

    public void setCategorie(Set<Categoria> categorie) {
        this.categorie = categorie;
    }
    
    
    
    
    
    
    
}
