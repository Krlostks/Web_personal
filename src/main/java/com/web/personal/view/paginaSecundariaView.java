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
    private int tabActual;
    private boolean hayVideo;    
        public boolean getHayVideo(){
        return hayVideo;
    }
    
    public void setHayVideo(boolean viedeo){
        this.hayVideo= viedeo;
    }
    public int getTabActual(){
        return tabActual;
    }
    
    public void setTabActual(int tab){
        this.tabActual= tab;
    }
    
    public List<Personas> getPersonasAll(){
        return personasAll;
        }
    
    public void setPersonasAll(List<Personas> personas){
        this.personasAll = personas;
    }
    
}
