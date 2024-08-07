/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.personal.DAO;

import javax.ejb.Stateless;
import com.web.personal.entity.Comentarios;
import com.web.personal.utilerias.EntitiManager;
import com.web.personal.utilerias.persistence;
import java.util.List;
import javax.inject.Inject;
/**
 *
 * @author Carlos
 */
@Stateless
public class comentariosDAO extends EntitiManager<Comentarios>{
    @Inject
    private persistence persistence;
    
    @Override
    protected persistence getEntityManager(){
        return persistence;
    }
    public comentariosDAO(){
        super(Comentarios.class);
    }
    
    public List<Comentarios> obtenerComentarioByIdVideo(int id){
        System.out.println("id = " + id);
        return persistence.getEm().createNamedQuery("Comentarios.findByIdVideo").setParameter("idVideo", id).getResultList();
    }
    
}
