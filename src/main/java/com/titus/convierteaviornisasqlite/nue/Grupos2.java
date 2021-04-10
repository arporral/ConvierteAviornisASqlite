/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titus.convierteaviornisasqlite.nue;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "grupos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grupos2.findAll", query = "SELECT g FROM Grupos2 g"),
    @NamedQuery(name = "Grupos2.findByNumSec", query = "SELECT g FROM Grupos2 g WHERE g.numSec = :numSec"),
    @NamedQuery(name = "Grupos2.findByCodigoUsuario", query = "SELECT g FROM Grupos2 g WHERE g.codigoUsuario = :codigoUsuario"),
    @NamedQuery(name = "Grupos2.findByPerfil", query = "SELECT g FROM Grupos2 g WHERE g.perfil = :perfil")})
public class Grupos2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "num_sec")
    private Integer numSec;
    @Basic(optional = false)
    @Column(name = "perfil")
    private String perfil;
    @JoinColumn(name = "codigo_usuario", referencedColumnName = "codigo_usuario")
    @ManyToOne(optional = false)
    private Usuarios2 codigoUsuario;

    public Grupos2() {
    }

    public Grupos2(Integer numSec) {
        this.numSec = numSec;
    }

    public Grupos2(Integer numSec, String perfil) {
        this.numSec = numSec;
        this.perfil = perfil;
    }

    public Integer getNumSec() {
        return numSec;
    }

    public void setNumSec(Integer numSec) {
        this.numSec = numSec;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public Usuarios2 getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Usuarios2 codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
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
        if (!(object instanceof Grupos2)) {
            return false;
        }
        Grupos2 other = (Grupos2) object;
        if ((this.numSec == null && other.numSec != null) || (this.numSec != null && !this.numSec.equals(other.numSec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.nue.Grupos2[ numSec=" + numSec + " ]";
    }
    
}
