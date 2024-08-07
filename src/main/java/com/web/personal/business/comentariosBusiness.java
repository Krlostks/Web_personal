/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.personal.business;

import javax.ejb.Stateless;
import javax.inject.Inject;
import com.web.personal.entity.Comentarios;
import com.web.personal.DAO.comentariosDAO;
import java.util.List;

/**
 *
 * @author Carlos
 */
@Stateless
public class comentariosBusiness {
  
    @Inject
    private comentariosDAO comentariosDAO;
    
    public List<Comentarios> obtenerComentariosByIdVideo(int id){
        return comentariosDAO.obtenerComentarioByIdVideo(id);
    }
}
