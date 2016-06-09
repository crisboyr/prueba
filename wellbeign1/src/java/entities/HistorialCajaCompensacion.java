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
@Table(name = "historialescajacompensacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistorialCajaCompensacion.findAll", query = "SELECT h FROM HistorialCajaCompensacion h"),
    @NamedQuery(name = "HistorialCajaCompensacion.findByIdHistorialCajaCompensacion", query = "SELECT h FROM HistorialCajaCompensacion h WHERE h.idHistorialCajaCompensacion = :idHistorialCajaCompensacion")})
public class HistorialCajaCompensacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idHistorialCajaCompensacion")
    private Integer idHistorialCajaCompensacion;
    @JoinColumn(name = "idCajaCompensacion", referencedColumnName = "idCajaCompensacion")
    @ManyToOne
    private CajaCompensacion idCajaCompensacion;

    public HistorialCajaCompensacion() {
    }

    public HistorialCajaCompensacion(Integer idHistorialCajaCompensacion) {
        this.idHistorialCajaCompensacion = idHistorialCajaCompensacion;
    }

    public Integer getIdHistorialCajaCompensacion() {
        return idHistorialCajaCompensacion;
    }

    public void setIdHistorialCajaCompensacion(Integer idHistorialCajaCompensacion) {
        this.idHistorialCajaCompensacion = idHistorialCajaCompensacion;
    }

    public CajaCompensacion getIdCajaCompensacion() {
        return idCajaCompensacion;
    }

    public void setIdCajaCompensacion(CajaCompensacion idCajaCompensacion) {
        this.idCajaCompensacion = idCajaCompensacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHistorialCajaCompensacion != null ? idHistorialCajaCompensacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialCajaCompensacion)) {
            return false;
        }
        HistorialCajaCompensacion other = (HistorialCajaCompensacion) object;
        if ((this.idHistorialCajaCompensacion == null && other.idHistorialCajaCompensacion != null) || (this.idHistorialCajaCompensacion != null && !this.idHistorialCajaCompensacion.equals(other.idHistorialCajaCompensacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.HistorialCajaCompensacion[ idHistorialCajaCompensacion=" + idHistorialCajaCompensacion + " ]";
    }
    
}
