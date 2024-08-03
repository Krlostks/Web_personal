/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.personal.utilerias;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Carlos
 */
@Stateless
public class persistence {
    
    @PersistenceContext(unitName = "com.web.personal.persistence")
    
    private EntityManager entityManager;
    
    public  EntityManager getEm(){
        return entityManager;
    }
    
    
}
