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
@Named(value = "paginaSecundariaController")
@SessionScoped
public class paginaSecunariaController implements Serializable{
    @PostConstruct
    public void init(){
        System.out.println("ya se ejecutó el init");
    }
    
    public String regresar(){
        return "/index.xhtml?faces-redirect=true";
    }
    
    public void imprimirAlgo(){
        System.out.println("Esto es un nuevo mensaje impreso");
    }
    
}
