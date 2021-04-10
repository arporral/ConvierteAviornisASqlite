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
@Table(name = "numeros_anillas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NumerosAnillas2.findAll", query = "SELECT n FROM NumerosAnillas2 n"),
    @NamedQuery(name = "NumerosAnillas2.findByNumSec", query = "SELECT n FROM NumerosAnillas2 n WHERE n.numSec = :numSec"),
    @NamedQuery(name = "NumerosAnillas2.findByNumeroCriador", query = "SELECT n FROM NumerosAnillas2 n WHERE n.numeroCriador = :numeroCriador"),
    @NamedQuery(name = "NumerosAnillas2.findByCodigoAnilla", query = "SELECT n FROM NumerosAnillas2 n WHERE n.codigoAnilla = :codigoAnilla"),
    @NamedQuery(name = "NumerosAnillas2.findByCodigoTipoAnilla", query = "SELECT n FROM NumerosAnillas2 n WHERE n.codigoTipoAnilla = :codigoTipoAnilla"),
    @NamedQuery(name = "NumerosAnillas2.findByAnno", query = "SELECT n FROM NumerosAnillas2 n WHERE n.anno = :anno"),
    @NamedQuery(name = "NumerosAnillas2.findByCodigoDiametro", query = "SELECT n FROM NumerosAnillas2 n WHERE n.codigoDiametro = :codigoDiametro"),
    @NamedQuery(name = "NumerosAnillas2.findByNumeroAnilla", query = "SELECT n FROM NumerosAnillas2 n WHERE n.numeroAnilla = :numeroAnilla"),
    @NamedQuery(name = "NumerosAnillas2.findByMarcaEspecial", query = "SELECT n FROM NumerosAnillas2 n WHERE n.marcaEspecial = :marcaEspecial"),
    @NamedQuery(name = "NumerosAnillas2.findByNumeroPedido", query = "SELECT n FROM NumerosAnillas2 n WHERE n.numeroPedido = :numeroPedido"),
    @NamedQuery(name = "NumerosAnillas2.findByTipoAnilla", query = "SELECT n FROM NumerosAnillas2 n WHERE n.tipoAnilla = :tipoAnilla"),
    @NamedQuery(name = "NumerosAnillas2.findByFechaRecepcion", query = "SELECT n FROM NumerosAnillas2 n WHERE n.fechaRecepcion = :fechaRecepcion"),
    @NamedQuery(name = "NumerosAnillas2.findByNumeroCertif", query = "SELECT n FROM NumerosAnillas2 n WHERE n.numeroCertif = :numeroCertif"),
    @NamedQuery(name = "NumerosAnillas2.findByEspecie", query = "SELECT n FROM NumerosAnillas2 n WHERE n.especie = :especie"),
    @NamedQuery(name = "NumerosAnillas2.findByFechaEnvio", query = "SELECT n FROM NumerosAnillas2 n WHERE n.fechaEnvio = :fechaEnvio")})
public class NumerosAnillas2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "num_sec")
    private Long numSec;
    @Basic(optional = false)
    @Column(name = "numero_criador")
    private int numeroCriador;
    @Basic(optional = false)
    @Column(name = "codigo_anilla")
    private int codigoAnilla;
    @Basic(optional = false)
    @Column(name = "codigo_tipo_anilla")
    private String codigoTipoAnilla;
    @Basic(optional = false)
    @Column(name = "anno")
    private String anno;
    @Basic(optional = false)
    @Column(name = "codigo_diametro")
    private String codigoDiametro;
    @Basic(optional = false)
    @Column(name = "numero_anilla")
    private int numeroAnilla;
    @Column(name = "marca_especial")
    private String marcaEspecial;
    @Basic(optional = false)
    @Column(name = "numero_pedido")
    private String numeroPedido;
    @Basic(optional = false)
    @Column(name = "tipo_anilla")
    private String tipoAnilla;
    @Column(name = "fecha_recepcion")
    @Temporal(TemporalType.DATE)
    private Date fechaRecepcion;
    @Column(name = "numero_certif")
    private String numeroCertif;
    @Column(name = "especie")
    private String especie;
    @Column(name = "fecha_envio")
    @Temporal(TemporalType.DATE)
    private Date fechaEnvio;

    public NumerosAnillas2() {
    }

    public NumerosAnillas2(Long numSec) {
        this.numSec = numSec;
    }

    public NumerosAnillas2(Long numSec, int numeroCriador, int codigoAnilla, String codigoTipoAnilla, String anno, String codigoDiametro, int numeroAnilla, String numeroPedido, String tipoAnilla) {
        this.numSec = numSec;
        this.numeroCriador = numeroCriador;
        this.codigoAnilla = codigoAnilla;
        this.codigoTipoAnilla = codigoTipoAnilla;
        this.anno = anno;
        this.codigoDiametro = codigoDiametro;
        this.numeroAnilla = numeroAnilla;
        this.numeroPedido = numeroPedido;
        this.tipoAnilla = tipoAnilla;
    }

    public Long getNumSec() {
        return numSec;
    }

    public void setNumSec(Long numSec) {
        this.numSec = numSec;
    }

    public int getNumeroCriador() {
        return numeroCriador;
    }

    public void setNumeroCriador(int numeroCriador) {
        this.numeroCriador = numeroCriador;
    }

    public int getCodigoAnilla() {
        return codigoAnilla;
    }

    public void setCodigoAnilla(int codigoAnilla) {
        this.codigoAnilla = codigoAnilla;
    }

    public String getCodigoTipoAnilla() {
        return codigoTipoAnilla;
    }

    public void setCodigoTipoAnilla(String codigoTipoAnilla) {
        this.codigoTipoAnilla = codigoTipoAnilla;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getCodigoDiametro() {
        return codigoDiametro;
    }

    public void setCodigoDiametro(String codigoDiametro) {
        this.codigoDiametro = codigoDiametro;
    }

    public int getNumeroAnilla() {
        return numeroAnilla;
    }

    public void setNumeroAnilla(int numeroAnilla) {
        this.numeroAnilla = numeroAnilla;
    }

    public String getMarcaEspecial() {
        return marcaEspecial;
    }

    public void setMarcaEspecial(String marcaEspecial) {
        this.marcaEspecial = marcaEspecial;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getTipoAnilla() {
        return tipoAnilla;
    }

    public void setTipoAnilla(String tipoAnilla) {
        this.tipoAnilla = tipoAnilla;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
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

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
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
        if (!(object instanceof NumerosAnillas2)) {
            return false;
        }
        NumerosAnillas2 other = (NumerosAnillas2) object;
        if ((this.numSec == null && other.numSec != null) || (this.numSec != null && !this.numSec.equals(other.numSec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.nue.NumerosAnillas2[ numSec=" + numSec + " ]";
    }    
}