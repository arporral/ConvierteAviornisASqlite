/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titus.convierteaviornisasqlite.nue;

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
@Table(name = "tipos_anillas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposAnillas2.findAll", query = "SELECT t FROM TiposAnillas2 t"),
    @NamedQuery(name = "TiposAnillas2.findByTipoAnilla", query = "SELECT t FROM TiposAnillas2 t WHERE t.tipoAnilla = :tipoAnilla"),
    @NamedQuery(name = "TiposAnillas2.findByNombre", query = "SELECT t FROM TiposAnillas2 t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "TiposAnillas2.findByCodigoTipoAnilla", query = "SELECT t FROM TiposAnillas2 t WHERE t.codigoTipoAnilla = :codigoTipoAnilla"),
    @NamedQuery(name = "TiposAnillas2.findByOrdenacionColumnas", query = "SELECT t FROM TiposAnillas2 t WHERE t.ordenacionColumnas = :ordenacionColumnas")})
public class TiposAnillas2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "tipo_anilla")
    private String tipoAnilla;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "codigo_tipo_anilla")
    private String codigoTipoAnilla;
    @Column(name = "ordenacion_columnas")
    private Integer ordenacionColumnas;

    public TiposAnillas2() {
    }

    public TiposAnillas2(String tipoAnilla) {
        this.tipoAnilla = tipoAnilla;
    }

    public String getTipoAnilla() {
        return tipoAnilla;
    }

    public void setTipoAnilla(String tipoAnilla) {
        this.tipoAnilla = tipoAnilla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoTipoAnilla() {
        return codigoTipoAnilla;
    }

    public void setCodigoTipoAnilla(String codigoTipoAnilla) {
        this.codigoTipoAnilla = codigoTipoAnilla;
    }

    public Integer getOrdenacionColumnas() {
        return ordenacionColumnas;
    }

    public void setOrdenacionColumnas(Integer ordenacionColumnas) {
        this.ordenacionColumnas = ordenacionColumnas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoAnilla != null ? tipoAnilla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposAnillas2)) {
            return false;
        }
        TiposAnillas2 other = (TiposAnillas2) object;
        if ((this.tipoAnilla == null && other.tipoAnilla != null) || (this.tipoAnilla != null && !this.tipoAnilla.equals(other.tipoAnilla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.nue.TiposAnillas2[ tipoAnilla=" + tipoAnilla + " ]";
    }
    
}
