/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titus.convierteaviornisasqlite.ant;

import jakarta.persistence.Basic;
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
@Table(name = "fabricantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fabricantes.findAll", query = "SELECT f FROM Fabricantes f"),
    @NamedQuery(name = "Fabricantes.findByCodigoFabricante", query = "SELECT f FROM Fabricantes f WHERE f.codigoFabricante = :codigoFabricante"),
    @NamedQuery(name = "Fabricantes.findByNombre", query = "SELECT f FROM Fabricantes f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Fabricantes.findByDireccion", query = "SELECT f FROM Fabricantes f WHERE f.direccion = :direccion"),
    @NamedQuery(name = "Fabricantes.findByLocalidad", query = "SELECT f FROM Fabricantes f WHERE f.localidad = :localidad"),
    @NamedQuery(name = "Fabricantes.findByPais", query = "SELECT f FROM Fabricantes f WHERE f.pais = :pais"),
    @NamedQuery(name = "Fabricantes.findByCodigoPostal", query = "SELECT f FROM Fabricantes f WHERE f.codigoPostal = :codigoPostal"),
    @NamedQuery(name = "Fabricantes.findByTelefono", query = "SELECT f FROM Fabricantes f WHERE f.telefono = :telefono"),
    @NamedQuery(name = "Fabricantes.findByFax", query = "SELECT f FROM Fabricantes f WHERE f.fax = :fax"),
    @NamedQuery(name = "Fabricantes.findByEmail", query = "SELECT f FROM Fabricantes f WHERE f.email = :email"),
    @NamedQuery(name = "Fabricantes.findByIdioma", query = "SELECT f FROM Fabricantes f WHERE f.idioma = :idioma"),
    @NamedQuery(name = "Fabricantes.findByTipoDeEnvio", query = "SELECT f FROM Fabricantes f WHERE f.tipoDeEnvio = :tipoDeEnvio")})
public class Fabricantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo_fabricante")
    private Integer codigoFabricante;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "localidad")
    private String localidad;
    @Column(name = "pais")
    private String pais;
    @Column(name = "codigo_postal")
    private String codigoPostal;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "fax")
    private String fax;
    @Column(name = "email")
    private String email;
    @Column(name = "idioma")
    private String idioma;
    @Column(name = "tipo_de_envio")
    private String tipoDeEnvio;

    public Fabricantes() {
    }

    public Fabricantes(Integer codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    public Fabricantes(Integer codigoFabricante, String nombre) {
        this.codigoFabricante = codigoFabricante;
        this.nombre = nombre;
    }

    public Integer getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(Integer codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTipoDeEnvio() {
        return tipoDeEnvio;
    }

    public void setTipoDeEnvio(String tipoDeEnvio) {
        this.tipoDeEnvio = tipoDeEnvio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoFabricante != null ? codigoFabricante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fabricantes)) {
            return false;
        }
        Fabricantes other = (Fabricantes) object;
        if ((this.codigoFabricante == null && other.codigoFabricante != null) || (this.codigoFabricante != null && !this.codigoFabricante.equals(other.codigoFabricante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.ant.Fabricantes[ codigoFabricante=" + codigoFabricante + " ]";
    }
    
}
