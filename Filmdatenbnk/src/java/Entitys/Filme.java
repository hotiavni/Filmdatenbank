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
public class Filme implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String länge;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date  jahr;
    @ManyToOne
    Filme filme;
    

    public Filme(Long id, String title, String länge, Date jahr, Filme filme) {
        this.id = id;
        this.title = title;
        this.länge = länge;
        this.jahr = jahr;
        this.filme = filme;
    }

    public Filme() {
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
        if (!(object instanceof Filme)) {
            return false;
        }
        Filme other = (Filme) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Filme{" + "id=" + id + ", title=" + title + ", l\u00e4nge=" + länge + ", jahr=" + jahr + '}';
    }

    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLänge() {
        return länge;
    }

    public void setLänge(String länge) {
        this.länge = länge;
    }

    public Date getJahr() {
        return jahr;
    }

    public void setJahr(Date jahr) {
        this.jahr = jahr;
    }
    
}
