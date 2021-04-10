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
@Table(name = "detalle_facturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleFacturas2.findAll", query = "SELECT d FROM DetalleFacturas2 d"),
    @NamedQuery(name = "DetalleFacturas2.findByNumLineaFac", query = "SELECT d FROM DetalleFacturas2 d WHERE d.numLineaFac = :numLineaFac"),
    @NamedQuery(name = "DetalleFacturas2.findByNumeroPedido", query = "SELECT d FROM DetalleFacturas2 d WHERE d.numeroPedido = :numeroPedido"),
    @NamedQuery(name = "DetalleFacturas2.findByConcepto", query = "SELECT d FROM DetalleFacturas2 d WHERE d.concepto = :concepto"),
    @NamedQuery(name = "DetalleFacturas2.findByImporte", query = "SELECT d FROM DetalleFacturas2 d WHERE d.importe = :importe"),
    @NamedQuery(name = "DetalleFacturas2.findByTipoIva", query = "SELECT d FROM DetalleFacturas2 d WHERE d.tipoIva = :tipoIva"),
    @NamedQuery(name = "DetalleFacturas2.findByCantidad", query = "SELECT d FROM DetalleFacturas2 d WHERE d.cantidad = :cantidad")})
public class DetalleFacturas2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "num_linea_fac")
    private Integer numLineaFac;
    @Column(name = "numero_pedido")
    private String numeroPedido;
    @Column(name = "concepto")
    private String concepto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "importe")
    private Double importe;
    @Column(name = "tipo_iva")
    private Double tipoIva;
    @Column(name = "cantidad")
    private Integer cantidad;
    @JoinColumn(name = "num_sec", referencedColumnName = "num_sec")
    @ManyToOne(optional = false)
    private Facturas2 numSec;

    public DetalleFacturas2() {
    }

    public DetalleFacturas2(Integer numLineaFac) {
        this.numLineaFac = numLineaFac;
    }

    public Integer getNumLineaFac() {
        return numLineaFac;
    }

    public void setNumLineaFac(Integer numLineaFac) {
        this.numLineaFac = numLineaFac;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getTipoIva() {
        return tipoIva;
    }

    public void setTipoIva(Double tipoIva) {
        this.tipoIva = tipoIva;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Facturas2 getNumSec() {
        return numSec;
    }

    public void setNumSec(Facturas2 numSec) {
        this.numSec = numSec;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numLineaFac != null ? numLineaFac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleFacturas2)) {
            return false;
        }
        DetalleFacturas2 other = (DetalleFacturas2) object;
        if ((this.numLineaFac == null && other.numLineaFac != null) || (this.numLineaFac != null && !this.numLineaFac.equals(other.numLineaFac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.ant.DetalleFacturas2[ numLineaFac=" + numLineaFac + " ]";
    }
    
}
