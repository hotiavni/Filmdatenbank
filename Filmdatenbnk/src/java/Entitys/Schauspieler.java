/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitys;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Avni
 */
@Entity
public class Schauspieler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Vorname;
    private String Nachname;
    private int Alter;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Geburtsdatum;
    private String Geburtsort;
    private String Biographie;
    private String Oscars;
    private String Filme;
    @ManyToOne
    Schauspieler schauspieler;

    public Schauspieler(Long id, String Vorname, String Nachname, int Alter, Date Geburtsdatum, String Geburtsort, String Biographie, String Oscars, String Filme, Schauspieler schauspieler) {
        this.id = id;
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Alter = Alter;
        this.Geburtsdatum = Geburtsdatum;
        this.Geburtsort = Geburtsort;
        this.Biographie = Biographie;
        this.Oscars = Oscars;
        this.Filme = Filme;
        this.schauspieler = schauspieler;
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
        if (!(object instanceof Schauspieler)) {
            return false;
        }
        Schauspieler other = (Schauspieler) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Schauspieler{" + "id=" + id + ", Vorname=" + Vorname + ", Nachname=" + Nachname + ", Alter=" + Alter + ", Geburtsdatum=" + Geburtsdatum + ", Geburtsort=" + Geburtsort + ", Biographie=" + Biographie + ", Oscars=" + Oscars + ", Filme=" + Filme + '}';
    }



    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String Vorname) {
        this.Vorname = Vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String Nachname) {
        this.Nachname = Nachname;
    }

    public int getAlter() {
        return Alter;
    }

    public void setAlter(int Alter) {
        this.Alter = Alter;
    }

    public Date getGeburtsdatum() {
        return Geburtsdatum;
    }

    public void setGeburtsdatum(Date Geburtsdatum) {
        this.Geburtsdatum = Geburtsdatum;
    }

    public String getGeburtsort() {
        return Geburtsort;
    }

    public void setGeburtsort(String Geburtsort) {
        this.Geburtsort = Geburtsort;
    }

    public String getBiographie() {
        return Biographie;
    }

    public void setBiographie(String Biographie) {
        this.Biographie = Biographie;
    }

    public String getOscars() {
        return Oscars;
    }

    public void setOscars(String Oscars) {
        this.Oscars = Oscars;
    }

    public String getFilme() {
        return Filme;
    }

    public void setFilme(String Filme) {
        this.Filme = Filme;
    }
    
}
