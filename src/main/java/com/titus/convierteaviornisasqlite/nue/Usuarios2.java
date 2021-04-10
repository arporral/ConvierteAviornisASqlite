/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titus.convierteaviornisasqlite.nue;

import com.titus.convierteaviornisasqlite.ant.Grupos;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author arpor
 */
@Entity
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios2.findAll", query = "SELECT u FROM Usuarios2 u"),
    @NamedQuery(name = "Usuarios2.findByCodigoUsuario", query = "SELECT u FROM Usuarios2 u WHERE u.codigoUsuario = :codigoUsuario"),
    @NamedQuery(name = "Usuarios2.findByClave", query = "SELECT u FROM Usuarios2 u WHERE u.clave = :clave")})
public class Usuarios2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo_usuario")
    private String codigoUsuario;
    @Basic(optional = false)
    @Column(name = "clave")
    private String clave;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoUsuario")
    private Collection<Grupos2> gruposCollection;

    public Usuarios2() {
    }

    public Usuarios2(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Usuarios2(String codigoUsuario, String clave) {
        this.codigoUsuario = codigoUsuario;
        this.clave = clave;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @XmlTransient
    public Collection<Grupos2> getGruposCollection() {
        return gruposCollection;
    }

    public void setGruposCollection(Collection<Grupos2> gruposCollection) {
        this.gruposCollection = gruposCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoUsuario != null ? codigoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios2)) {
            return false;
        }
        Usuarios2 other = (Usuarios2) object;
        if ((this.codigoUsuario == null && other.codigoUsuario != null) || (this.codigoUsuario != null && !this.codigoUsuario.equals(other.codigoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.nue.Usuarios2[ codigoUsuario=" + codigoUsuario + " ]";
    }    
}