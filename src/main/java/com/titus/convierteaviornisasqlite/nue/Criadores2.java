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
@Table(name = "criadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Criadores2.findAll", query = "SELECT c FROM Criadores2 c"),
    @NamedQuery(name = "Criadores2.findByNumeroCriador", query = "SELECT c FROM Criadores2 c WHERE c.numeroCriador = :numeroCriador"),
    @NamedQuery(name = "Criadores2.findByCodigoCriador", query = "SELECT c FROM Criadores2 c WHERE c.codigoCriador = :codigoCriador"),
    @NamedQuery(name = "Criadores2.findByNombre", query = "SELECT c FROM Criadores2 c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Criadores2.findByApel1", query = "SELECT c FROM Criadores2 c WHERE c.apel1 = :apel1"),
    @NamedQuery(name = "Criadores2.findByApel2", query = "SELECT c FROM Criadores2 c WHERE c.apel2 = :apel2"),
    @NamedQuery(name = "Criadores2.findByCifNif", query = "SELECT c FROM Criadores2 c WHERE c.cifNif = :cifNif"),
    @NamedQuery(name = "Criadores2.findByOtros", query = "SELECT c FROM Criadores2 c WHERE c.otros = :otros"),
    @NamedQuery(name = "Criadores2.findByDireccion", query = "SELECT c FROM Criadores2 c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Criadores2.findByCodigoPostal", query = "SELECT c FROM Criadores2 c WHERE c.codigoPostal = :codigoPostal"),
    @NamedQuery(name = "Criadores2.findByLocalidad", query = "SELECT c FROM Criadores2 c WHERE c.localidad = :localidad"),
    @NamedQuery(name = "Criadores2.findByProvincia", query = "SELECT c FROM Criadores2 c WHERE c.provincia = :provincia"),
    @NamedQuery(name = "Criadores2.findByTelefono", query = "SELECT c FROM Criadores2 c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "Criadores2.findByTelefonoMovil", query = "SELECT c FROM Criadores2 c WHERE c.telefonoMovil = :telefonoMovil"),
    @NamedQuery(name = "Criadores2.findByFax", query = "SELECT c FROM Criadores2 c WHERE c.fax = :fax"),
    @NamedQuery(name = "Criadores2.findByEmail", query = "SELECT c FROM Criadores2 c WHERE c.email = :email"),
    @NamedQuery(name = "Criadores2.findByFechaAlta", query = "SELECT c FROM Criadores2 c WHERE c.fechaAlta = :fechaAlta"),
    @NamedQuery(name = "Criadores2.findByCuenta", query = "SELECT c FROM Criadores2 c WHERE c.cuenta = :cuenta"),
    @NamedQuery(name = "Criadores2.findByTarjeta", query = "SELECT c FROM Criadores2 c WHERE c.tarjeta = :tarjeta"),
    @NamedQuery(name = "Criadores2.findByExptarj", query = "SELECT c FROM Criadores2 c WHERE c.exptarj = :exptarj"),
    @NamedQuery(name = "Criadores2.findByPago", query = "SELECT c FROM Criadores2 c WHERE c.pago = :pago"),
    @NamedQuery(name = "Criadores2.findByFechaPago", query = "SELECT c FROM Criadores2 c WHERE c.fechaPago = :fechaPago"),
    @NamedQuery(name = "Criadores2.findByCarnet", query = "SELECT c FROM Criadores2 c WHERE c.carnet = :carnet"),
    @NamedQuery(name = "Criadores2.findByObservaciones", query = "SELECT c FROM Criadores2 c WHERE c.observaciones = :observaciones"),
    @NamedQuery(name = "Criadores2.findByMarcaBaja", query = "SELECT c FROM Criadores2 c WHERE c.marcaBaja = :marcaBaja"),
    @NamedQuery(name = "Criadores2.findByFechaBaja", query = "SELECT c FROM Criadores2 c WHERE c.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "Criadores2.findByMotivoBaja", query = "SELECT c FROM Criadores2 c WHERE c.motivoBaja = :motivoBaja"),
    @NamedQuery(name = "Criadores2.findByProfesion", query = "SELECT c FROM Criadores2 c WHERE c.profesion = :profesion"),
    @NamedQuery(name = "Criadores2.findByPais", query = "SELECT c FROM Criadores2 c WHERE c.pais = :pais"),
    @NamedQuery(name = "Criadores2.findByCvv", query = "SELECT c FROM Criadores2 c WHERE c.cvv = :cvv"),
    @NamedQuery(name = "Criadores2.findByCodigoUsuario", query = "SELECT c FROM Criadores2 c WHERE c.codigoUsuario = :codigoUsuario"),
    @NamedQuery(name = "Criadores2.findByIndVip", query = "SELECT c FROM Criadores2 c WHERE c.indVip = :indVip"),
    @NamedQuery(name = "Criadores2.findByIban", query = "SELECT c FROM Criadores2 c WHERE c.iban = :iban"),
    @NamedQuery(name = "Criadores2.findByBic", query = "SELECT c FROM Criadores2 c WHERE c.bic = :bic"),
    @NamedQuery(name = "Criadores2.findByFeccadCarnet", query = "SELECT c FROM Criadores2 c WHERE c.feccadCarnet = :feccadCarnet")})
public class Criadores2 implements Serializable {

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
    private Collection<Facturas2> facturasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroCriador")
    private Collection<Pedidos2> pedidosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroCriador")
    private Collection<CuotasCriadores2> cuotasCriadoresCollection;

    public Criadores2() {
    }

    public Criadores2(Integer numeroCriador) {
        this.numeroCriador = numeroCriador;
    }

    public Criadores2(Integer numeroCriador, String codigoCriador) {
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
    public Collection<Facturas2> getFacturasCollection() {
        return facturasCollection;
    }

    public void setFacturasCollection(Collection<Facturas2> facturasCollection) {
        this.facturasCollection = facturasCollection;
    }

    @XmlTransient
    public Collection<Pedidos2> getPedidosCollection() {
        return pedidosCollection;
    }

    public void setPedidosCollection(Collection<Pedidos2> pedidosCollection) {
        this.pedidosCollection = pedidosCollection;
    }

    @XmlTransient
    public Collection<CuotasCriadores2> getCuotasCriadoresCollection() {
        return cuotasCriadoresCollection;
    }

    public void setCuotasCriadoresCollection(Collection<CuotasCriadores2> cuotasCriadoresCollection) {
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
        if (!(object instanceof Criadores2)) {
            return false;
        }
        Criadores2 other = (Criadores2) object;
        if ((this.numeroCriador == null && other.numeroCriador != null) || (this.numeroCriador != null && !this.numeroCriador.equals(other.numeroCriador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.nue.Criadores2[ numeroCriador=" + numeroCriador + " ]";
    }
    
}
