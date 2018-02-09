/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitys;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 *
 * @author Avni
 */
@Entity
public class Regissuer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String vorname;
    private String nachname;
    private int numberOfOscars;
    private String nationalitaet;
    private int numberOfFilms;
    @ManyToOne
    Regissuer regissuer;

    public Regissuer(Long id, String vorname, String nachname, int numberOfOscars, String nationalitaet, int numberOfFilms, Regissuer regissuer) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.numberOfOscars = numberOfOscars;
        this.nationalitaet = nationalitaet;
        this.numberOfFilms = numberOfFilms;
        this.regissuer = regissuer;
    }

    public Regissuer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regissuer)) {
            return false;
        }
        Regissuer other = (Regissuer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entitys.Regissuer[ id=" + id + " ]";
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getNumberOfOscars() {
        return numberOfOscars;
    }

    public void setNumberOfOscars(int numberOfOscars) {
        this.numberOfOscars = numberOfOscars;
    }

    public String getNationalitaet() {
        return nationalitaet;
    }

    public void setNationalitaet(String nationalitaet) {
        this.nationalitaet = nationalitaet;
    }

    public int getNumberOfFilms() {
        return numberOfFilms;
    }

    public void setNumberOfFilms(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }
    
}
