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
@Table(name = "criadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Criadores.findAll", query = "SELECT c FROM Criadores c"),
    @NamedQuery(name = "Criadores.findByNumeroCriador", query = "SELECT c FROM Criadores c WHERE c.numeroCriador = :numeroCriador"),
    @NamedQuery(name = "Criadores.findByCodigoCriador", query = "SELECT c FROM Criadores c WHERE c.codigoCriador = :codigoCriador"),
    @NamedQuery(name = "Criadores.findByNombre", query = "SELECT c FROM Criadores c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Criadores.findByApel1", query = "SELECT c FROM Criadores c WHERE c.apel1 = :apel1"),
    @NamedQuery(name = "Criadores.findByApel2", query = "SELECT c FROM Criadores c WHERE c.apel2 = :apel2"),
    @NamedQuery(name = "Criadores.findByCifNif", query = "SELECT c FROM Criadores c WHERE c.cifNif = :cifNif"),
    @NamedQuery(name = "Criadores.findByOtros", query = "SELECT c FROM Criadores c WHERE c.otros = :otros"),
    @NamedQuery(name = "Criadores.findByDireccion", query = "SELECT c FROM Criadores c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Criadores.findByCodigoPostal", query = "SELECT c FROM Criadores c WHERE c.codigoPostal = :codigoPostal"),
    @NamedQuery(name = "Criadores.findByLocalidad", query = "SELECT c FROM Criadores c WHERE c.localidad = :localidad"),
    @NamedQuery(name = "Criadores.findByProvincia", query = "SELECT c FROM Criadores c WHERE c.provincia = :provincia"),
    @NamedQuery(name = "Criadores.findByTelefono", query = "SELECT c FROM Criadores c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "Criadores.findByTelefonoMovil", query = "SELECT c FROM Criadores c WHERE c.telefonoMovil = :telefonoMovil"),
    @NamedQuery(name = "Criadores.findByFax", query = "SELECT c FROM Criadores c WHERE c.fax = :fax"),
    @NamedQuery(name = "Criadores.findByEmail", query = "SELECT c FROM Criadores c WHERE c.email = :email"),
    @NamedQuery(name = "Criadores.findByFechaAlta", query = "SELECT c FROM Criadores c WHERE c.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "Criadores.findByCuenta", query = "SELECT c FROM Criadores c WHERE c.cuenta = :cuenta"),
    @NamedQuery(name = "Criadores.findByTarjeta", query = "SELECT c FROM Criadores c WHERE c.tarjeta = :tarjeta"),
    @NamedQuery(name = "Criadores.findByExptarj", query = "SELECT c FROM Criadores c WHERE c.exptarj = :exptarj"),
    @NamedQuery(name = "Criadores.findByPago", query = "SELECT c FROM Criadores c WHERE c.pago = :pago"),
    @NamedQuery(name = "Criadores.findByFechaPago", query = "SELECT c FROM Criadores c WHERE c.fechaPago = :fechaPago"),
    @NamedQuery(name = "Criadores.findByCarnet", query = "SELECT c FROM Criadores c WHERE c.carnet = :carnet"),
    @NamedQuery(name = "Criadores.findByObservaciones", query = "SELECT c FROM Criadores c WHERE c.observaciones = :observaciones"),
    @NamedQuery(name = "Criadores.findByMarcaBaja", query = "SELECT c FROM Criadores c WHERE c.marcaBaja = :marcaBaja"),
    @NamedQuery(name = "Criadores.findByFechaBaja", query = "SELECT c FROM Criadores c WHERE c.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "Criadores.findByMotivoBaja", query = "SELECT c FROM Criadores c WHERE c.motivoBaja = :motivoBaja"),
    @NamedQuery(name = "Criadores.findByProfesion", query = "SELECT c FROM Criadores c WHERE c.profesion = :profesion"),
    @NamedQuery(name = "Criadores.findByPais", query = "SELECT c FROM Criadores c WHERE c.pais = :pais"),
    @NamedQuery(name = "Criadores.findByCvv", query = "SELECT c FROM Criadores c WHERE c.cvv = :cvv"),
    @NamedQuery(name = "Criadores.findByCodigoUsuario", query = "SELECT c FROM Criadores c WHERE c.codigoUsuario = :codigoUsuario"),
    @NamedQuery(name = "Criadores.findByIndVip", query = "SELECT c FROM Criadores c WHERE c.indVip = :indVip"),
    @NamedQuery(name = "Criadores.findByIban", query = "SELECT c FROM Criadores c WHERE c.iban = :iban"),
    @NamedQuery(name = "Criadores.findByBic", query = "SELECT c FROM Criadores c WHERE c.bic = :bic"),
    @NamedQuery(name = "Criadores.findByFeccadCarnet", query = "SELECT c FROM Criadores c WHERE c.feccadCarnet = :feccadCarnet")})
public class Criadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numero_criador")
    private Integer numeroCriador;
    @Basic(optional = false)
    @Column(name = "codigo_criador")
    private String codigoCriador;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apel1")
    private String apel1;
    @Column(name = "apel2")
    private String apel2;
    @Column(name = "cif_nif")
    private String cifNif;
    @Column(name = "otros")
    private String otros;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "codigo_postal")
    private String codigoPostal;
    @Column(name = "localidad")
    private String localidad;
    @Column(name = "provincia")
    private String provincia;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "telefono_movil")
    private String telefonoMovil;
    @Column(name = "fax")
    private String fax;
    @Column(name = "email")
    private String email;
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;
    @Column(name = "cuenta")
    private String cuenta;
    @Column(name = "tarjeta")
    private String tarjeta;
    @Column(name = "exptarj")
    private String exptarj;
    @Column(name = "pago")
    private String pago;
    @Column(name = "fecha_pago")
    @Temporal(TemporalType.DATE)
    private Date fechaPago;
    @Column(name = "carnet")
    @Temporal(TemporalType.DATE)
    private Date carnet;
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "marca_baja")
    private Boolean marcaBaja;
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.DATE)
    private Date fechaBaja;
    @Column(name = "motivo_baja")
    private String motivoBaja;
    @Column(name = "profesion")
    private String profesion;
    @Column(name = "pais")
    private String pais;
    @Column(name = "cvv")
    private String cvv;
    @Column(name = "codigo_usuario")
    private String codigoUsuario;
    @Column(name = "ind_vip")
    private Boolean indVip;
    @Column(name = "iban")
    private String iban;
    @Column(name = "bic")
    private String bic;
    @Column(name = "feccad_carnet")
    @Temporal(TemporalType.DATE)
    private Date feccadCarnet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroCriador")
    private Collection<Facturas> facturasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroCriador")
    private Collection<Pedidos> pedidosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroCriador")
    private Collection<CuotasCriadores> cuotasCriadoresCollection;

    public Criadores() {
    }

    public Criadores(Integer numeroCriador) {
        this.numeroCriador = numeroCriador;
    }

    public Criadores(Integer numeroCriador, String codigoCriador) {
        this.numeroCriador = numeroCriador;
        this.codigoCriador = codigoCriador;
    }

    public Integer getNumeroCriador() {
        return numeroCriador;
    }

    public void setNumeroCriador(Integer numeroCriador) {
        this.numeroCriador = numeroCriador;
    }

    public String getCodigoCriador() {
        return codigoCriador;
    }

    public void setCodigoCriador(String codigoCriador) {
        this.codigoCriador = codigoCriador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApel1() {
        return apel1;
    }

    public void setApel1(String apel1) {
        this.apel1 = apel1;
    }

    public String getApel2() {
        return apel2;
    }

    public void setApel2(String apel2) {
        this.apel2 = apel2;
    }

    public String getCifNif() {
        return cifNif;
    }

    public void setCifNif(String cifNif) {
        this.cifNif = cifNif;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
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

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getExptarj() {
        return exptarj;
    }

    public void setExptarj(String exptarj) {
        this.exptarj = exptarj;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getCarnet() {
        return carnet;
    }

    public void setCarnet(Date carnet) {
        this.carnet = carnet;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Boolean getMarcaBaja() {
        return marcaBaja;
    }

    public void setMarcaBaja(Boolean marcaBaja) {
        this.marcaBaja = marcaBaja;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getMotivoBaja() {
        return motivoBaja;
    }

    public void setMotivoBaja(String motivoBaja) {
        this.motivoBaja = motivoBaja;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Boolean getIndVip() {
        return indVip;
    }

    public void setIndVip(Boolean indVip) {
        this.indVip = indVip;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public Date getFeccadCarnet() {
        return feccadCarnet;
    }

    public void setFeccadCarnet(Date feccadCarnet) {
        this.feccadCarnet = feccadCarnet;
    }

    @XmlTransient
    public Collection<Facturas> getFacturasCollection() {
        return facturasCollection;
    }

    public void setFacturasCollection(Collection<Facturas> facturasCollection) {
        this.facturasCollection = facturasCollection;
    }

    @XmlTransient
    public Collection<Pedidos> getPedidosCollection() {
        return pedidosCollection;
    }

    public void setPedidosCollection(Collection<Pedidos> pedidosCollection) {
        this.pedidosCollection = pedidosCollection;
    }

    @XmlTransient
    public Collection<CuotasCriadores> getCuotasCriadoresCollection() {
        return cuotasCriadoresCollection;
    }

    public void setCuotasCriadoresCollection(Collection<CuotasCriadores> cuotasCriadoresCollection) {
        this.cuotasCriadoresCollection = cuotasCriadoresCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroCriador != null ? numeroCriador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Criadores)) {
            return false;
        }
        Criadores other = (Criadores) object;
        if ((this.numeroCriador == null && other.numeroCriador != null) || (this.numeroCriador != null && !this.numeroCriador.equals(other.numeroCriador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.ant.Criadores[ numeroCriador=" + numeroCriador + " ]";
    }
    
}
