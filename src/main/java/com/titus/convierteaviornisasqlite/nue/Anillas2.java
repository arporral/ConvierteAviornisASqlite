/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titus.convierteaviornisasqlite.nue;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "anillas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Anillas2.findAll", query = "SELECT a FROM Anillas2 a"),
    @NamedQuery(name = "Anillas2.findByCodigoAnilla", query = "SELECT a FROM Anillas2 a WHERE a.codigoAnilla = :codigoAnilla"),
    @NamedQuery(name = "Anillas2.findByTipoAnilla", query = "SELECT a FROM Anillas2 a WHERE a.tipoAnilla = :tipoAnilla"),
    @NamedQuery(name = "Anillas2.findByDiametro", query = "SELECT a FROM Anillas2 a WHERE a.diametro = :diametro"),
    @NamedQuery(name = "Anillas2.findByCantMinima", query = "SELECT a FROM Anillas2 a WHERE a.cantMinima = :cantMinima"),
    @NamedQuery(name = "Anillas2.findByTipoImpresion", query = "SELECT a FROM Anillas2 a WHERE a.tipoImpresion = :tipoImpresion"),
    @NamedQuery(name = "Anillas2.findByPrecio", query = "SELECT a FROM Anillas2 a WHERE a.precio = :precio"),
    @NamedQuery(name = "Anillas2.findByCodigoDiametro", query = "SELECT a FROM Anillas2 a WHERE a.codigoDiametro = :codigoDiametro"),
    @NamedQuery(name = "Anillas2.findByFechaBaja", query = "SELECT a FROM Anillas2 a WHERE a.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "Anillas2.findByIndBaja", query = "SELECT a FROM Anillas2 a WHERE a.indBaja = :indBaja"),
    @NamedQuery(name = "Anillas2.findByNumeroArticulo", query = "SELECT a FROM Anillas2 a WHERE a.numeroArticulo = :numeroArticulo"),
    @NamedQuery(name = "Anillas2.findByCodigoFabricante", query = "SELECT a FROM Anillas2 a WHERE a.codigoFabricante = :codigoFabricante"),
    @NamedQuery(name = "Anillas2.findByPeso", query = "SELECT a FROM Anillas2 a WHERE a.peso = :peso"),
    @NamedQuery(name = "Anillas2.findByPrecioCompra", query = "SELECT a FROM Anillas2 a WHERE a.precioCompra = :precioCompra")})
public class Anillas2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo_anilla")
    private Integer codigoAnilla;
    @Basic(optional = false)
    @Column(name = "tipo_anilla")
    private String tipoAnilla;
    @Basic(optional = false)
    @Column(name = "diametro")
    private double diametro;
    @Column(name = "cant_minima")
    private Integer cantMinima;
    @Column(name = "tipo_impresion")
    private String tipoImpresion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;
    @Basic(optional = false)
    @Column(name = "codigo_diametro")
    private String codigoDiametro;
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.DATE)
    private Date fechaBaja;
    @Column(name = "ind_baja")
    private Boolean indBaja;
    @Column(name = "numero_articulo")
    private Integer numeroArticulo;
    @Basic(optional = false)
    @Column(name = "codigo_fabricante")
    private int codigoFabricante;
    @Column(name = "peso")
    private Double peso;
    @Column(name = "precio_compra")
    private Double precioCompra;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoAnilla")
    private Collection<DetallePedidos2> detallePedidosCollection;

    public Anillas2() {
    }

    public Anillas2(Integer codigoAnilla) {
        this.codigoAnilla = codigoAnilla;
    }

    public Anillas2(Integer codigoAnilla, String tipoAnilla, double diametro, String codigoDiametro, int codigoFabricante) {
        this.codigoAnilla = codigoAnilla;
        this.tipoAnilla = tipoAnilla;
        this.diametro = diametro;
        this.codigoDiametro = codigoDiametro;
        this.codigoFabricante = codigoFabricante;
    }

    public Integer getCodigoAnilla() {
        return codigoAnilla;
    }

    public void setCodigoAnilla(Integer codigoAnilla) {
        this.codigoAnilla = codigoAnilla;
    }

    public String getTipoAnilla() {
        return tipoAnilla;
    }

    public void setTipoAnilla(String tipoAnilla) {
        this.tipoAnilla = tipoAnilla;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public Integer getCantMinima() {
        return cantMinima;
    }

    public void setCantMinima(Integer cantMinima) {
        this.cantMinima = cantMinima;
    }

    public String getTipoImpresion() {
        return tipoImpresion;
    }

    public void setTipoImpresion(String tipoImpresion) {
        this.tipoImpresion = tipoImpresion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCodigoDiametro() {
        return codigoDiametro;
    }

    public void setCodigoDiametro(String codigoDiametro) {
        this.codigoDiametro = codigoDiametro;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Boolean getIndBaja() {
        return indBaja;
    }

    public void setIndBaja(Boolean indBaja) {
        this.indBaja = indBaja;
    }

    public Integer getNumeroArticulo() {
        return numeroArticulo;
    }

    public void setNumeroArticulo(Integer numeroArticulo) {
        this.numeroArticulo = numeroArticulo;
    }

    public int getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(int codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    @XmlTransient
    public Collection<DetallePedidos2> getDetallePedidosCollection() {
        return detallePedidosCollection;
    }

    public void setDetallePedidosCollection(Collection<DetallePedidos2> detallePedidosCollection) {
        this.detallePedidosCollection = detallePedidosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoAnilla != null ? codigoAnilla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anillas2)) {
            return false;
        }
        Anillas2 other = (Anillas2) object;
        if ((this.codigoAnilla == null && other.codigoAnilla != null) || (this.codigoAnilla != null && !this.codigoAnilla.equals(other.codigoAnilla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.ant.Anillas2[ codigoAnilla=" + codigoAnilla + " ]";
    }
    
}
