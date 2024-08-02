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

/**
 *
 * @author Carlos
 */
@Named(value="indexController")
@SessionScoped

public class indexController implements Serializable{
    
    @PostConstruct    
    public void init(){
        System.out.println("ya paso por el init");
    }
    
    public String llevarPaginaSecundaria(){
        try {
        System.out.println("si entró a este metodo ");
    return "/rutas/paginaSecundaria.xhtml?faces-redirect=true";           
        } catch (Exception e) {
            System.out.println("el error fue: " + e);
        }
        return "";
    }
    
    public void imprimir(){
        System.out.println("Esto se debe de imprimir");
    }
    
    
}
