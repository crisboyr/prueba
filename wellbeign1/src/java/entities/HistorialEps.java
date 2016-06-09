/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cristian
 */
@Entity
@Table(name = "historialeseps")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistorialEps.findAll", query = "SELECT h FROM HistorialEps h"),
    @NamedQuery(name = "HistorialEps.findByIdHistorialEps", query = "SELECT h FROM HistorialEps h WHERE h.idHistorialEps = :idHistorialEps")})
public class HistorialEps implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idHistorialEps")
    private Integer idHistorialEps;
    @JoinColumn(name = "identificacion", referencedColumnName = "identificacion")
    @ManyToOne
    private DatosEmpleado identificacion;
    @JoinColumn(name = "idEps", referencedColumnName = "idEps")
    @ManyToOne
    private Eps idEps;

    public HistorialEps() {
    }

    public HistorialEps(Integer idHistorialEps) {
        this.idHistorialEps = idHistorialEps;
    }

    public Integer getIdHistorialEps() {
        return idHistorialEps;
    }

    public void setIdHistorialEps(Integer idHistorialEps) {
        this.idHistorialEps = idHistorialEps;
    }

    public DatosEmpleado getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(DatosEmpleado identificacion) {
        this.identificacion = identificacion;
    }

    public Eps getIdEps() {
        return idEps;
    }

    public void setIdEps(Eps idEps) {
        this.idEps = idEps;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHistorialEps != null ? idHistorialEps.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialEps)) {
            return false;
        }
        HistorialEps other = (HistorialEps) object;
        if ((this.idHistorialEps == null && other.idHistorialEps != null) || (this.idHistorialEps != null && !this.idHistorialEps.equals(other.idHistorialEps))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.HistorialEps[ idHistorialEps=" + idHistorialEps + " ]";
    }
    
}
