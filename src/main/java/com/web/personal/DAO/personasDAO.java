/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.personal.DAO;
import com.web.personal.entity.Personas;
import com.web.personal.utilerias.EntitiManager;
import com.web.personal.utilerias.persistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
/**
 *
 * @author Carlos
 */
@Stateless
public class personasDAO extends EntitiManager<Personas>{
    
    @Inject
    private persistence persistence;
    
    @Override
    protected persistence getEntityManager(){
        return persistence;
    }
    
    public personasDAO(){
        super(Personas.class);
    }
    
    public List<Personas> obtenerPersonas(){
        return persistence.getEm().createNamedQuery("Personas.findAll").getResultList();
    }
    
    
    
}
