/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titus.convierteaviornisasqlite.ant;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "datos_fijos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatosFijos.findAll", query = "SELECT d FROM DatosFijos d"),
    @NamedQuery(name = "DatosFijos.findByNumSec", query = "SELECT d FROM DatosFijos d WHERE d.numSec = :numSec"),
    @NamedQuery(name = "DatosFijos.findByNombreEmpresa", query = "SELECT d FROM DatosFijos d WHERE d.nombreEmpresa = :nombreEmpresa"),
    @NamedQuery(name = "DatosFijos.findByResponsable", query = "SELECT d FROM DatosFijos d WHERE d.responsable = :responsable"),
    @NamedQuery(name = "DatosFijos.findByDireccion", query = "SELECT d FROM DatosFijos d WHERE d.direccion = :direccion"),
    @NamedQuery(name = "DatosFijos.findByLocalidad", query = "SELECT d FROM DatosFijos d WHERE d.localidad = :localidad"),
    @NamedQuery(name = "DatosFijos.findByProvincia", query = "SELECT d FROM DatosFijos d WHERE d.provincia = :provincia"),
    @NamedQuery(name = "DatosFijos.findByPais", query = "SELECT d FROM DatosFijos d WHERE d.pais = :pais"),
    @NamedQuery(name = "DatosFijos.findByTelefono", query = "SELECT d FROM DatosFijos d WHERE d.telefono = :telefono"),
    @NamedQuery(name = "DatosFijos.findByFax", query = "SELECT d FROM DatosFijos d WHERE d.fax = :fax"),
    @NamedQuery(name = "DatosFijos.findByEmail", query = "SELECT d FROM DatosFijos d WHERE d.email = :email"),
    @NamedQuery(name = "DatosFijos.findByCif", query = "SELECT d FROM DatosFijos d WHERE d.cif = :cif"),
    @NamedQuery(name = "DatosFijos.findByCcc", query = "SELECT d FROM DatosFijos d WHERE d.ccc = :ccc"),
    @NamedQuery(name = "DatosFijos.findByServidorCorreoSaliente", query = "SELECT d FROM DatosFijos d WHERE d.servidorCorreoSaliente = :servidorCorreoSaliente"),
    @NamedQuery(name = "DatosFijos.findByCuentaCorreoSaliente", query = "SELECT d FROM DatosFijos d WHERE d.cuentaCorreoSaliente = :cuentaCorreoSaliente"),
    @NamedQuery(name = "DatosFijos.findByUsuario", query = "SELECT d FROM DatosFijos d WHERE d.usuario = :usuario"),
    @NamedQuery(name = "DatosFijos.findByClave", query = "SELECT d FROM DatosFijos d WHERE d.clave = :clave"),
    @NamedQuery(name = "DatosFijos.findByCodigoPostal", query = "SELECT d FROM DatosFijos d WHERE d.codigoPostal = :codigoPostal"),
    @NamedQuery(name = "DatosFijos.findByDiasCarenciaNuevasAltas", query = "SELECT d FROM DatosFijos d WHERE d.diasCarenciaNuevasAltas = :diasCarenciaNuevasAltas"),
    @NamedQuery(name = "DatosFijos.findByDiaCobroCuotas", query = "SELECT d FROM DatosFijos d WHERE d.diaCobroCuotas = :diaCobroCuotas"),
    @NamedQuery(name = "DatosFijos.findByMesCobroCuotas", query = "SELECT d FROM DatosFijos d WHERE d.mesCobroCuotas = :mesCobroCuotas"),
    @NamedQuery(name = "DatosFijos.findByIban", query = "SELECT d FROM DatosFijos d WHERE d.iban = :iban"),
    @NamedQuery(name = "DatosFijos.findByBic", query = "SELECT d FROM DatosFijos d WHERE d.bic = :bic")})
public class DatosFijos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "num_sec")
    private Integer numSec;
    @Column(name = "nombre_empresa")
    private String nombreEmpresa;
    @Column(name = "responsable")
    private String responsable;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "localidad")
    private String localidad;
    @Column(name = "provincia")
    private String provincia;
    @Column(name = "pais")
    private String pais;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "fax")
    private String fax;
    @Column(name = "email")
    private String email;
    @Column(name = "CIF")
    private String cif;
    @Column(name = "CCC")
    private String ccc;
    @Column(name = "servidor_correo_saliente")
    private String servidorCorreoSaliente;
    @Column(name = "cuenta_correo_saliente")
    private String cuentaCorreoSaliente;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "clave")
    private String clave;
    @Column(name = "codigo_postal")
    private String codigoPostal;
    @Column(name = "dias_carencia_nuevas_altas")
    private Integer diasCarenciaNuevasAltas;
    @Column(name = "dia_cobro_cuotas")
    private String diaCobroCuotas;
    @Column(name = "mes_cobro_cuotas")
    private String mesCobroCuotas;
    @Column(name = "iban")
    private String iban;
    @Column(name = "bic")
    private String bic;

    public DatosFijos() {
    }

    public DatosFijos(Integer numSec) {
        this.numSec = numSec;
    }

    public Integer getNumSec() {
        return numSec;
    }

    public void setNumSec(Integer numSec) {
        this.numSec = numSec;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
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

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getCcc() {
        return ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    public String getServidorCorreoSaliente() {
        return servidorCorreoSaliente;
    }

    public void setServidorCorreoSaliente(String servidorCorreoSaliente) {
        this.servidorCorreoSaliente = servidorCorreoSaliente;
    }

    public String getCuentaCorreoSaliente() {
        return cuentaCorreoSaliente;
    }

    public void setCuentaCorreoSaliente(String cuentaCorreoSaliente) {
        this.cuentaCorreoSaliente = cuentaCorreoSaliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Integer getDiasCarenciaNuevasAltas() {
        return diasCarenciaNuevasAltas;
    }

    public void setDiasCarenciaNuevasAltas(Integer diasCarenciaNuevasAltas) {
        this.diasCarenciaNuevasAltas = diasCarenciaNuevasAltas;
    }

    public String getDiaCobroCuotas() {
        return diaCobroCuotas;
    }

    public void setDiaCobroCuotas(String diaCobroCuotas) {
        this.diaCobroCuotas = diaCobroCuotas;
    }

    public String getMesCobroCuotas() {
        return mesCobroCuotas;
    }

    public void setMesCobroCuotas(String mesCobroCuotas) {
        this.mesCobroCuotas = mesCobroCuotas;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numSec != null ? numSec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosFijos)) {
            return false;
        }
        DatosFijos other = (DatosFijos) object;
        if ((this.numSec == null && other.numSec != null) || (this.numSec != null && !this.numSec.equals(other.numSec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.ant.DatosFijos[ numSec=" + numSec + " ]";
    }
    
}
