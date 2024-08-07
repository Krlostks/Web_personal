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
import com.web.personal.business.videosBusiness;
import com.web.personal.business.comentariosBusiness;
import com.web.personal.entity.Videos;
import org.primefaces.PrimeFaces;

/**
 *
 * @author Carlos
 */
@Named(value = "paginaSecundariaController")
@SessionScoped
public class paginaSecunariaController implements Serializable{
    @Inject 
    private personasBusiness business;
    @Inject
    private videosBusiness videosBusiness;
    @Inject
    private comentariosBusiness comentariosBusiness;

         
    private paginaSecundariaView view;
    
    @PostConstruct
    public void init(){
        view = new paginaSecundariaView();
        cargarListaPersonas();        
        cargarVideosActuales();
        view.setTabActual(1);
        view.setHayVideo(false);
        view.setIdPersonaje(0);
        System.out.println("idPersonaje: " + view.getIdPersonaje());
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

public void abrirVideo(Videos video){    
    view.setVideoActual(video);
    int idVideo = video.getId();
    view.setComentarios(comentariosBusiness.obtenerComentariosByIdVideo(idVideo));
    PrimeFaces.current().ajax().update(":form");
    PrimeFaces.current().executeScript("PF('mostrarVideo').show()");
}

public void cargarVideosActuales(){
   view.setVideosActuales(videosBusiness.obtenerTodosLosVideos());
}
public void cerrarDialogoVideo(){
    PrimeFaces.current().executeScript("PF('mostrarVideo').hide()");
    PrimeFaces.current().ajax().update(":form");
}
}
