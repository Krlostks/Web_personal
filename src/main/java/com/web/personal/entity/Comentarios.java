/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.personal.entity;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carlos
 */
@Entity
@Table(name = "comentarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comentarios.findAll", query = "SELECT c FROM Comentarios c")
    , @NamedQuery(name = "Comentarios.findById", query = "SELECT c FROM Comentarios c WHERE c.id = :id")
    , @NamedQuery(name = "Comentarios.findByUsuaro", query = "SELECT c FROM Comentarios c WHERE c.usuaro = :usuaro")
    , @NamedQuery(name = "Comentarios.findByComentario", query = "SELECT c FROM Comentarios c WHERE c.comentario = :comentario")
    , @NamedQuery(name = "Comentarios.findByTipo", query = "SELECT c FROM Comentarios c WHERE c.tipo = :tipo")
    , @NamedQuery(name = "Comentarios.findByIdVideo", query = "SELECT c FROM Comentarios c WHERE c.idVideo.id = :idVideo")})
public class Comentarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "usuaro")
    private String usuaro;
    @Size(max = 45)
    @Column(name = "comentario")
    private String comentario;
    @Size(max = 45)
    @Column(name = "tipo")
    private String tipo;
    @JoinColumn(name = "id_video", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Videos idVideo;

    public Comentarios() {
    }

    public Comentarios(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuaro() {
        return usuaro;
    }

    public void setUsuaro(String usuaro) {
        this.usuaro = usuaro;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Videos getIdVideo() {
        return idVideo;
    }

    public void setIdVideo(Videos idVideo) {
        this.idVideo = idVideo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comentarios)) {
            return false;
        }
        Comentarios other = (Comentarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.personal.entity.Comentarios[ id=" + id + " ]";
    }
    
}
