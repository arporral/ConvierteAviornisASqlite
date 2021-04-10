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
@Table(name = "pedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos2.findAll", query = "SELECT p FROM Pedidos2 p"),
    @NamedQuery(name = "Pedidos2.findByNumSec", query = "SELECT p FROM Pedidos2 p WHERE p.numSec = :numSec"),
    @NamedQuery(name = "Pedidos2.findByNumeroPedido", query = "SELECT p FROM Pedidos2 p WHERE p.numeroPedido = :numeroPedido"),
    @NamedQuery(name = "Pedidos2.findByFechaPedido", query = "SELECT p FROM Pedidos2 p WHERE p.fechaPedido = :fechaPedido"),
    @NamedQuery(name = "Pedidos2.findByFechaRecepcion", query = "SELECT p FROM Pedidos2 p WHERE p.fechaRecepcion = :fechaRecepcion"),
    @NamedQuery(name = "Pedidos2.findByIndPedido", query = "SELECT p FROM Pedidos2 p WHERE p.indPedido = :indPedido"),
    @NamedQuery(name = "Pedidos2.findByIndRecibido", query = "SELECT p FROM Pedidos2 p WHERE p.indRecibido = :indRecibido"),
    @NamedQuery(name = "Pedidos2.findByIndFacturado", query = "SELECT p FROM Pedidos2 p WHERE p.indFacturado = :indFacturado"),
    @NamedQuery(name = "Pedidos2.findByComentario", query = "SELECT p FROM Pedidos2 p WHERE p.comentario = :comentario"),
    @NamedQuery(name = "Pedidos2.findByFechaEnvio", query = "SELECT p FROM Pedidos2 p WHERE p.fechaEnvio = :fechaEnvio"),
    @NamedQuery(name = "Pedidos2.findByCodigoUsuario", query = "SELECT p FROM Pedidos2 p WHERE p.codigoUsuario = :codigoUsuario"),
    @NamedQuery(name = "Pedidos2.findByFechaPagoAnticipado", query = "SELECT p FROM Pedidos2 p WHERE p.fechaPagoAnticipado = :fechaPagoAnticipado"),
    @NamedQuery(name = "Pedidos2.findByTipoCarta", query = "SELECT p FROM Pedidos2 p WHERE p.tipoCarta = :tipoCarta"),
    @NamedQuery(name = "Pedidos2.findByGastos", query = "SELECT p FROM Pedidos2 p WHERE p.gastos = :gastos"),
    @NamedQuery(name = "Pedidos2.findByTipoIva", query = "SELECT p FROM Pedidos2 p WHERE p.tipoIva = :tipoIva")})
public class Pedidos2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "num_sec")
    private Integer numSec;
    @Basic(optional = false)
    @Column(name = "numero_pedido")
    private String numeroPedido;
    @Basic(optional = false)
    @Column(name = "fecha_pedido")
    @Temporal(TemporalType.DATE)
    private Date fechaPedido;
    @Column(name = "fecha_recepcion")
    @Temporal(TemporalType.DATE)
    private Date fechaRecepcion;
    @Column(name = "ind_pedido")
    private Boolean indPedido;
    @Column(name = "ind_recibido")
    private Boolean indRecibido;
    @Column(name = "ind_facturado")
    private Boolean indFacturado;
    @Column(name = "comentario")
    private String comentario;
    @Column(name = "fecha_envio")
    @Temporal(TemporalType.DATE)
    private Date fechaEnvio;
    @Column(name = "codigo_usuario")
    private String codigoUsuario;
    @Column(name = "fecha_pago_anticipado")
    @Temporal(TemporalType.DATE)
    private Date fechaPagoAnticipado;
    @Column(name = "tipo_carta")
    private Integer tipoCarta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "gastos")
    private Double gastos;
    @Column(name = "tipo_iva")
    private Double tipoIva;
    @JoinColumn(name = "numero_criador", referencedColumnName = "numero_criador")
    @ManyToOne(optional = false)
    private Criadores2 numeroCriador;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numSec")
    private Collection<DetallePedidos2> detallePedidos2Collection;

    public Pedidos2() {
    }

    public Pedidos2(Integer numSec) {
        this.numSec = numSec;
    }

    public Pedidos2(Integer numSec, String numeroPedido, Date fechaPedido) {
        this.numSec = numSec;
        this.numeroPedido = numeroPedido;
        this.fechaPedido = fechaPedido;
    }

    public Integer getNumSec() {
        return numSec;
    }

    public void setNumSec(Integer numSec) {
        this.numSec = numSec;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public Boolean getIndPedido() {
        return indPedido;
    }

    public void setIndPedido(Boolean indPedido) {
        this.indPedido = indPedido;
    }

    public Boolean getIndRecibido() {
        return indRecibido;
    }

    public void setIndRecibido(Boolean indRecibido) {
        this.indRecibido = indRecibido;
    }

    public Boolean getIndFacturado() {
        return indFacturado;
    }

    public void setIndFacturado(Boolean indFacturado) {
        this.indFacturado = indFacturado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Date getFechaPagoAnticipado() {
        return fechaPagoAnticipado;
    }

    public void setFechaPagoAnticipado(Date fechaPagoAnticipado) {
        this.fechaPagoAnticipado = fechaPagoAnticipado;
    }

    public Integer getTipoCarta() {
        return tipoCarta;
    }

    public void setTipoCarta(Integer tipoCarta) {
        this.tipoCarta = tipoCarta;
    }

    public Double getGastos() {
        return gastos;
    }

    public void setGastos(Double gastos) {
        this.gastos = gastos;
    }

    public Double getTipoIva() {
        return tipoIva;
    }

    public void setTipoIva(Double tipoIva) {
        this.tipoIva = tipoIva;
    }

    public Criadores2 getNumeroCriador() {
        return numeroCriador;
    }

    public void setNumeroCriador(Criadores2 numeroCriador) {
        this.numeroCriador = numeroCriador;
    }

    @XmlTransient
    public Collection<DetallePedidos2> getDetallePedidos2Collection() {
        return detallePedidos2Collection;
    }

    public void setDetallePedidos2Collection(Collection<DetallePedidos2> detallePedidos2Collection) {
        this.detallePedidos2Collection = detallePedidos2Collection;
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
        if (!(object instanceof Pedidos2)) {
            return false;
        }
        Pedidos2 other = (Pedidos2) object;
        if ((this.numSec == null && other.numSec != null) || (this.numSec != null && !this.numSec.equals(other.numSec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.ant.Pedidos2[ numSec=" + numSec + " ]";
    }
    
}
