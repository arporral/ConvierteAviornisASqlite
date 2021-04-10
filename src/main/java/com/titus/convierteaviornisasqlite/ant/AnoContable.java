/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titus.convierteaviornisasqlite.ant;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "ano_contable")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AnoContable.findAll", query = "SELECT a FROM AnoContable a"),
    @NamedQuery(name = "AnoContable.findByAno", query = "SELECT a FROM AnoContable a WHERE a.ano = :ano"),
    @NamedQuery(name = "AnoContable.findByUltimoPedido", query = "SELECT a FROM AnoContable a WHERE a.ultimoPedido = :ultimoPedido"),
    @NamedQuery(name = "AnoContable.findByIndActivo", query = "SELECT a FROM AnoContable a WHERE a.indActivo = :indActivo")})
public class AnoContable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ano")
    private Integer ano;
    @Basic(optional = false)
    @Column(name = "ultimo_pedido")
    private int ultimoPedido;
    @Basic(optional = false)
    @Column(name = "ind_activo")
    private boolean indActivo;

    public AnoContable() {
    }

    public AnoContable(Integer ano) {
        this.ano = ano;
    }

    public AnoContable(Integer ano, int ultimoPedido, boolean indActivo) {
        this.ano = ano;
        this.ultimoPedido = ultimoPedido;
        this.indActivo = indActivo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public int getUltimoPedido() {
        return ultimoPedido;
    }

    public void setUltimoPedido(int ultimoPedido) {
        this.ultimoPedido = ultimoPedido;
    }

    public boolean getIndActivo() {
        return indActivo;
    }

    public void setIndActivo(boolean indActivo) {
        this.indActivo = indActivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ano != null ? ano.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnoContable)) {
            return false;
        }
        AnoContable other = (AnoContable) object;
        if ((this.ano == null && other.ano != null) || (this.ano != null && !this.ano.equals(other.ano))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.titus.convierteaviornisasqlite.ant.AnoContable[ ano=" + ano + " ]";
    }
    
}
