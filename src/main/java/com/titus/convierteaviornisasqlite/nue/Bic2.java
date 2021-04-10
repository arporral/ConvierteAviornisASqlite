/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titus.convierteaviornisasqlite.nue;

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
    @NamedQuery(name = "Bic2.findAll", query = "SELECT b FROM Bic2 b"),
    @NamedQuery(name = "Bic2.findByNumSec", query = "SELECT b FROM Bic2 b WHERE b.numSec = :numSec"),
    @NamedQuery(name = "Bic2.findByNrbe", query = "SELECT b FROM Bic2 b WHERE b.nrbe = :nrbe"),
    @NamedQuery(name = "Bic2.findByBic2", query = "SELECT b FROM Bic2 b WHERE b.bic = :bic"),
    @NamedQuery(name = "Bic2.findByDenominacion", query = "SELECT b FROM Bic2 b WHERE b.denominacion = :denominacion")})
public class Bic2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "num_sec")
    private Integer numSec;
    @Basic(optional = false)
    @Column(name = "nrbe")
    private int nrbe;
    @Column(name = "bic")
    private String bic;
    @Column(name = "denominacion")
    private String denominacion;

    public Bic2() {
    }

    public Bic2(Integer numSec) {
        this.numSec = numSec;
    }

    public Bic2(Integer numSec, int nrbe) {
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

    public String getBic2() {
        return bic;
    }

    public void setBic2(String bic) {
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
        if (!(object instanceof Bic2)) {
            return false;
        }
        Bic2 other = (Bic2) object;
        if ((this.numSec == null && other.numSec != null) || (this.numSec != null && !this.numSec.equals(other.numSec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.nue.Bic2[ numSec=" + numSec + " ]";
    }
    
}
