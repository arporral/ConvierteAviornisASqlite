/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titus.convierteaviornisasqlite.nue;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "paises")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paises2.findAll", query = "SELECT p FROM Paises2 p"),
    @NamedQuery(name = "Paises2.findByNumSec", query = "SELECT p FROM Paises2 p WHERE p.numSec = :numSec"),
    @NamedQuery(name = "Paises2.findByPais", query = "SELECT p FROM Paises2 p WHERE p.pais = :pais"),
    @NamedQuery(name = "Paises2.findByCee", query = "SELECT p FROM Paises2 p WHERE p.cee = :cee"),
    @NamedQuery(name = "Paises2.findByContinente", query = "SELECT p FROM Paises2 p WHERE p.continente = :continente"),
    @NamedQuery(name = "Paises2.findByImporteCuota", query = "SELECT p FROM Paises2 p WHERE p.importeCuota = :importeCuota")})
public class Paises2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_sec")
    private Integer numSec;
    @Column(name = "pais")
    private String pais;
    @Column(name = "cee")
    private Boolean cee;
    @Column(name = "continente")
    private String continente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "importe_cuota")
    private Double importeCuota;

    public Paises2() {
    }

    public Paises2(Integer numSec) {
        this.numSec = numSec;
    }

    public Integer getNumSec() {
        return numSec;
    }

    public void setNumSec(Integer numSec) {
        this.numSec = numSec;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Boolean getCee() {
        return cee;
    }

    public void setCee(Boolean cee) {
        this.cee = cee;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public Double getImporteCuota() {
        return importeCuota;
    }

    public void setImporteCuota(Double importeCuota) {
        this.importeCuota = importeCuota;
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
        if (!(object instanceof Paises2)) {
            return false;
        }
        Paises2 other = (Paises2) object;
        if ((this.numSec == null && other.numSec != null) || (this.numSec != null && !this.numSec.equals(other.numSec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.nue.Paises2[ numSec=" + numSec + " ]";
    }
    
}
