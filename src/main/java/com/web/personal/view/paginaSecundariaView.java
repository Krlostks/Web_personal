/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.personal.view;

import com.web.personal.entity.Personas;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class paginaSecundariaView {
    private List<Personas> personasAll;
    
    public List<Personas> getPersonasAll(){
        return personasAll;
        }
    
    public void setPersonasAll(List<Personas> personas){
        this.personasAll = personas;
    }
    
}
