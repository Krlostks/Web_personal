/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.personal.business;

import com.web.personal.entity.Personas;
import com.web.personal.DAO.personasDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Carlos
 */
@Stateless
public class personasBusiness {
    
    @Inject
    private personasDAO personasDAO;    
    
    public List<Personas> obtenerTodasLasPersonas(){
        return personasDAO.obtenerPersonas();
    }
    
}
