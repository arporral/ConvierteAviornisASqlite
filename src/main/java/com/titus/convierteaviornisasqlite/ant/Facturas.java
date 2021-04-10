/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titus.convierteaviornisasqlite.ant;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author arpor
 */
@Entity
@Table(name = "facturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturas.findAll", query = "SELECT f FROM Facturas f"),
    @NamedQuery(name = "Facturas.findByNumSec", query = "SELECT f FROM Facturas f WHERE f.numSec = :numSec"),
    @NamedQuery(name = "Facturas.findByNumeroFactura", query = "SELECT f FROM Facturas f WHERE f.numeroFactura = :numeroFactura"),
    @NamedQuery(name = "Facturas.findByFechaEmision", query = "SELECT f FROM Facturas f WHERE f.fechaEmision = :fechaEmision"),
    @NamedQuery(name = "Facturas.findByFechaPago", query = "SELECT f FROM Facturas f WHERE f.fechaPago = :fechaPago"),
    @NamedQuery(name = "Facturas.findByImporte", query = "SELECT f FROM Facturas f WHERE f.importe = :importe"),
    @NamedQuery(name = "Facturas.findByIva", query = "SELECT f FROM Facturas f WHERE f.iva = :iva"),
    @NamedQuery(name = "Facturas.findByGastos", query = "SELECT f FROM Facturas f WHERE f.gastos = :gastos"),
    @NamedQuery(name = "Facturas.findByTipoPago", query = "SELECT f FROM Facturas f WHERE f.tipoPago = :tipoPago"),
    @NamedQuery(name = "Facturas.findByComentario", query = "SELECT f FROM Facturas f WHERE f.comentario = :comentario"),
    @NamedQuery(name = "Facturas.findByIndDevolucion", query = "SELECT f FROM Facturas f WHERE f.indDevolucion = :indDevolucion"),
    @NamedQuery(name = "Facturas.findByFechaDevolucion", query = "SELECT f FROM Facturas f WHERE f.fechaDevolucion = :fechaDevolucion"),
    @NamedQuery(name = "Facturas.findByIndPagado", query = "SELECT f FROM Facturas f WHERE f.indPagado = :indPagado"),
    @NamedQuery(name = "Facturas.findByCodigoUsuario", query = "SELECT f FROM Facturas f WHERE f.codigoUsuario = :codigoUsuario"),
    @NamedQuery(name = "Facturas.findByIndQ19", query = "SELECT f FROM Facturas f WHERE f.indQ19 = :indQ19"),
    @NamedQuery(name = "Facturas.findByFechaQ19", query = "SELECT f FROM Facturas f WHERE f.fechaQ19 = :fechaQ19"),
    @NamedQuery(name = "Facturas.findByTipoCarta", query = "SELECT f FROM Facturas f WHERE f.tipoCarta = :tipoCarta")})
public class Facturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "num_sec")
    private Integer numSec;
    @Basic(optional = false)
    @Column(name = "numero_factura")
    private String numeroFactura;
    @Basic(optional = false)
    @Column(name = "fecha_emision")
    @Temporal(TemporalType.DATE)
    private Date fechaEmision;
    @Column(name = "fecha_pago")
    @Temporal(TemporalType.DATE)
    private Date fechaPago;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "importe")
    private Double importe;
    @Column(name = "iva")
    private Double iva;
    @Column(name = "gastos")
    private Double gastos;
    @Column(name = "tipo_pago")
    private String tipoPago;
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "ind_devolucion")
    private Boolean indDevolucion;
    @Column(name = "fecha_devolucion")
    @Temporal(TemporalType.DATE)
    private Date fechaDevolucion;
    @Column(name = "ind_pagado")
    private Boolean indPagado;
    @Column(name = "codigo_usuario")
    private String codigoUsuario;
    @Column(name = "ind_q19")
    private Boolean indQ19;
    @Column(name = "fecha_q19")
    @Temporal(TemporalType.DATE)
    private Date fechaQ19;
    @Column(name = "tipo_carta")
    private Integer tipoCarta;
    @JoinColumn(name = "numero_criador", referencedColumnName = "numero_criador")
    @ManyToOne(optional = false)
    private Criadores numeroCriador;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numSec")
    private Collection<DetalleFacturas> detalleFacturasCollection;

    public Facturas() {
    }

    public Facturas(Integer numSec) {
        this.numSec = numSec;
    }

    public Facturas(Integer numSec, String numeroFactura, Date fechaEmision) {
        this.numSec = numSec;
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
    }

    public Integer getNumSec() {
        return numSec;
    }

    public void setNumSec(Integer numSec) {
        this.numSec = numSec;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getGastos() {
        return gastos;
    }

    public void setGastos(Double gastos) {
        this.gastos = gastos;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getIndDevolucion() {
        return indDevolucion;
    }

    public void setIndDevolucion(Boolean indDevolucion) {
        this.indDevolucion = indDevolucion;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Boolean getIndPagado() {
        return indPagado;
    }

    public void setIndPagado(Boolean indPagado) {
        this.indPagado = indPagado;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Boolean getIndQ19() {
        return indQ19;
    }

    public void setIndQ19(Boolean indQ19) {
        this.indQ19 = indQ19;
    }

    public Date getFechaQ19() {
        return fechaQ19;
    }

    public void setFechaQ19(Date fechaQ19) {
        this.fechaQ19 = fechaQ19;
    }

    public Integer getTipoCarta() {
        return tipoCarta;
    }

    public void setTipoCarta(Integer tipoCarta) {
        this.tipoCarta = tipoCarta;
    }

    public Criadores getNumeroCriador() {
        return numeroCriador;
    }

    public void setNumeroCriador(Criadores numeroCriador) {
        this.numeroCriador = numeroCriador;
    }

    @XmlTransient
    public Collection<DetalleFacturas> getDetalleFacturasCollection() {
        return detalleFacturasCollection;
    }

    public void setDetalleFacturasCollection(Collection<DetalleFacturas> detalleFacturasCollection) {
        this.detalleFacturasCollection = detalleFacturasCollection;
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
        if (!(object instanceof Facturas)) {
            return false;
        }
        Facturas other = (Facturas) object;
        if ((this.numSec == null && other.numSec != null) || (this.numSec != null && !this.numSec.equals(other.numSec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.ant.Facturas[ numSec=" + numSec + " ]";
    }
    
}
