/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titus.convierteaviornisasqlite.ant;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author arpor
 */
@Entity
@Table(name = "bic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bic.findAll", query = "SELECT b FROM Bic b"),
    @NamedQuery(name = "Bic.findByNumSec", query = "SELECT b FROM Bic b WHERE b.numSec = :numSec"),
    @NamedQuery(name = "Bic.findByNrbe", query = "SELECT b FROM Bic b WHERE b.nrbe = :nrbe"),
    @NamedQuery(name = "Bic.findByBic", query = "SELECT b FROM Bic b WHERE b.bic = :bic"),
    @NamedQuery(name = "Bic.findByDenominacion", query = "SELECT b FROM Bic b WHERE b.denominacion = :denominacion")})
public class Bic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "num_sec")
    private Integer numSec;
    @Basic(optional = false)
    @Column(name = "nrbe")
    private int nrbe;
    @Column(name = "bic")
    private String bic;
    @Column(name = "denominacion")
    private String denominacion;

    public Bic() {
    }

    public Bic(Integer numSec) {
        this.numSec = numSec;
    }

    public Bic(Integer numSec, int nrbe) {
        this.numSec = numSec;
        this.nrbe = nrbe;
    }

    public Integer getNumSec() {
        return numSec;
    }

    public void setNumSec(Integer numSec) {
        this.numSec = numSec;
    }

    public int getNrbe() {
        return nrbe;
    }

    public void setNrbe(int nrbe) {
        this.nrbe = nrbe;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numSec != null ? numSec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bic)) {
            return false;
        }
        Bic other = (Bic) object;
        if ((this.numSec == null && other.numSec != null) || (this.numSec != null && !this.numSec.equals(other.numSec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.ant.Bic[ numSec=" + numSec + " ]";
    }
    
}
