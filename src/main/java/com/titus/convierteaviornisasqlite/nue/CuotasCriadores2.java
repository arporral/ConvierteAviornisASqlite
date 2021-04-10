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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author arpor
 */
@Entity
@Table(name = "cuotas_criadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CuotasCriadores2.findAll", query = "SELECT c FROM CuotasCriadores2 c"),
    @NamedQuery(name = "CuotasCriadores2.findByNumeroCuota", query = "SELECT c FROM CuotasCriadores2 c WHERE c.numeroCuota = :numeroCuota"),
    @NamedQuery(name = "CuotasCriadores2.findByCodigoCriador", query = "SELECT c FROM CuotasCriadores2 c WHERE c.codigoCriador = :codigoCriador"),
    @NamedQuery(name = "CuotasCriadores2.findByFechaPago", query = "SELECT c FROM CuotasCriadores2 c WHERE c.fechaPago = :fechaPago"),
    @NamedQuery(name = "CuotasCriadores2.findByImporte", query = "SELECT c FROM CuotasCriadores2 c WHERE c.importe = :importe"),
    @NamedQuery(name = "CuotasCriadores2.findByFormaPago", query = "SELECT c FROM CuotasCriadores2 c WHERE c.formaPago = :formaPago"),
    @NamedQuery(name = "CuotasCriadores2.findByAno", query = "SELECT c FROM CuotasCriadores2 c WHERE c.ano = :ano"),
    @NamedQuery(name = "CuotasCriadores2.findByFechaDevolucion", query = "SELECT c FROM CuotasCriadores2 c WHERE c.fechaDevolucion = :fechaDevolucion"),
    @NamedQuery(name = "CuotasCriadores2.findByIndPagado", query = "SELECT c FROM CuotasCriadores2 c WHERE c.indPagado = :indPagado"),
    @NamedQuery(name = "CuotasCriadores2.findByIndDevolucion", query = "SELECT c FROM CuotasCriadores2 c WHERE c.indDevolucion = :indDevolucion"),
    @NamedQuery(name = "CuotasCriadores2.findByIndQ19", query = "SELECT c FROM CuotasCriadores2 c WHERE c.indQ19 = :indQ19"),
    @NamedQuery(name = "CuotasCriadores2.findByFechaQ19", query = "SELECT c FROM CuotasCriadores2 c WHERE c.fechaQ19 = :fechaQ19")})
public class CuotasCriadores2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numero_cuota")
    private Integer numeroCuota;
    @Basic(optional = false)
    @Column(name = "codigo_criador")
    private String codigoCriador;
    @Column(name = "fecha_pago")
    @Temporal(TemporalType.DATE)
    private Date fechaPago;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "importe")
    private Double importe;
    @Column(name = "forma_pago")
    private String formaPago;
    @Column(name = "ano")
    private Integer ano;
    @Column(name = "fecha_devolucion")
    @Temporal(TemporalType.DATE)
    private Date fechaDevolucion;
    @Column(name = "ind_pagado")
    private Boolean indPagado;
    @Column(name = "ind_devolucion")
    private Boolean indDevolucion;
    @Column(name = "ind_q19")
    private Boolean indQ19;
    @Column(name = "fecha_q19")
    @Temporal(TemporalType.DATE)
    private Date fechaQ19;
    @JoinColumn(name = "numero_criador", referencedColumnName = "numero_criador")
    @ManyToOne(optional = false)
    private Criadores2 numeroCriador;

    public CuotasCriadores2() {
    }

    public CuotasCriadores2(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public CuotasCriadores2(Integer numeroCuota, String codigoCriador) {
        this.numeroCuota = numeroCuota;
        this.codigoCriador = codigoCriador;
    }

    public Integer getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public String getCodigoCriador() {
        return codigoCriador;
    }

    public void setCodigoCriador(String codigoCriador) {
        this.codigoCriador = codigoCriador;
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

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
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

    public Boolean getIndDevolucion() {
        return indDevolucion;
    }

    public void setIndDevolucion(Boolean indDevolucion) {
        this.indDevolucion = indDevolucion;
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

    public Criadores2 getNumeroCriador() {
        return numeroCriador;
    }

    public void setNumeroCriador(Criadores2 numeroCriador) {
        this.numeroCriador = numeroCriador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroCuota != null ? numeroCuota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuotasCriadores2)) {
            return false;
        }
        CuotasCriadores2 other = (CuotasCriadores2) object;
        if ((this.numeroCuota == null && other.numeroCuota != null) || (this.numeroCuota != null && !this.numeroCuota.equals(other.numeroCuota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.ant.CuotasCriadores2[ numeroCuota=" + numeroCuota + " ]";
    }
    
}
