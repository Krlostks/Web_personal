/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.personal.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import com.web.personal.view.paginaSecundariaView;
import javax.inject.Inject;
import com.web.personal.business.personasBusiness;
/**
 *
 * @author Carlos
 */
@Named(value = "paginaSecundariaController")
@SessionScoped
public class paginaSecunariaController implements Serializable{
    @Inject 
    private personasBusiness business;
         
    private paginaSecundariaView view;
    
    @PostConstruct
    public void init(){
        view = new paginaSecundariaView();
        cargarListaPersonas();
        view.setTabActual(1);
    }
    
    public  paginaSecundariaView getView(){
        return view;
    }
    
    public String regresar(){
        return "/index.xhtml?faces-redirect=true";
    }
    
    public void imprimirAlgo(){
        System.out.println("Esto es un nuevo mensaje impreso");
    }
    
public void   cargarListaPersonas(){
    view.setPersonasAll(business.obtenerTodasLasPersonas());
}
public void ponerTabActual(int tab){
    view.setTabActual(tab);
    System.out.println("tab actual:" + view.getTabActual());
}        
}
