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
@Table(name = "detalle_pedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetallePedidos2.findAll", query = "SELECT d FROM DetallePedidos2 d"),
    @NamedQuery(name = "DetallePedidos2.findByNumLinea", query = "SELECT d FROM DetallePedidos2 d WHERE d.numLinea = :numLinea"),
    @NamedQuery(name = "DetallePedidos2.findByCantidad", query = "SELECT d FROM DetallePedidos2 d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "DetallePedidos2.findByNumeroCertif", query = "SELECT d FROM DetallePedidos2 d WHERE d.numeroCertif = :numeroCertif"),
    @NamedQuery(name = "DetallePedidos2.findByEspecie", query = "SELECT d FROM DetallePedidos2 d WHERE d.especie = :especie"),
    @NamedQuery(name = "DetallePedidos2.findByImporte", query = "SELECT d FROM DetallePedidos2 d WHERE d.importe = :importe"),
    @NamedQuery(name = "DetallePedidos2.findByMarcaEspecial", query = "SELECT d FROM DetallePedidos2 d WHERE d.marcaEspecial = :marcaEspecial")})
public class DetallePedidos2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "num_linea")
    private Integer numLinea;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "numero_certif")
    private String numeroCertif;
    @Column(name = "especie")
    private String especie;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "importe")
    private Double importe;
    @Column(name = "marca_especial")
    private String marcaEspecial;
    @JoinColumn(name = "codigo_anilla", referencedColumnName = "codigo_anilla")
    @ManyToOne(optional = false)
    private Anillas2 codigoAnilla;
    @JoinColumn(name = "num_sec", referencedColumnName = "num_sec")
    @ManyToOne(optional = false)
    private Pedidos2 numSec;

    public DetallePedidos2() {
    }

    public DetallePedidos2(Integer numLinea) {
        this.numLinea = numLinea;
    }

    public Integer getNumLinea() {
        return numLinea;
    }

    public void setNumLinea(Integer numLinea) {
        this.numLinea = numLinea;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getNumeroCertif() {
        return numeroCertif;
    }

    public void setNumeroCertif(String numeroCertif) {
        this.numeroCertif = numeroCertif;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public String getMarcaEspecial() {
        return marcaEspecial;
    }

    public void setMarcaEspecial(String marcaEspecial) {
        this.marcaEspecial = marcaEspecial;
    }

    public Anillas2 getCodigoAnilla() {
        return codigoAnilla;
    }

    public void setCodigoAnilla(Anillas2 codigoAnilla) {
        this.codigoAnilla = codigoAnilla;
    }

    public Pedidos2 getNumSec() {
        return numSec;
    }

    public void setNumSec(Pedidos2 numSec) {
        this.numSec = numSec;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numLinea != null ? numLinea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePedidos2)) {
            return false;
        }
        DetallePedidos2 other = (DetallePedidos2) object;
        if ((this.numLinea == null && other.numLinea != null) || (this.numLinea != null && !this.numLinea.equals(other.numLinea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.ant.DetallePedidos2[ numLinea=" + numLinea + " ]";
    }
    
}
