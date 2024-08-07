/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.personal.DAO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import com.web.personal.entity.Videos;
import com.web.personal.utilerias.persistence;
import com.web.personal.utilerias.EntitiManager;
import java.util.List;

/**
 *
 * @author Carlos
 */
@Stateless
public class videosDAO extends EntitiManager<Videos>{
    @Inject
    private persistence persistence;
    
    @Override
    protected persistence getEntityManager(){
        return persistence;
    }
    
    public videosDAO(){
        super(Videos.class);
    }
    
    public List<Videos> obtenerTodosLosVideos(){
        return persistence.getEm().createNamedQuery("Videos.findAll").getResultList();
    }
}

