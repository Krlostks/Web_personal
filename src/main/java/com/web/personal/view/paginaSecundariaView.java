/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.personal.view;

import com.web.personal.entity.Personas;
import java.util.List;
import com.web.personal.entity.Videos;
import com.web.personal.entity.Comentarios;

/**
 *
 * @author Carlos
 */
public class paginaSecundariaView {
    private List<Personas> personasAll;
    private int tabActual;
    private int idPersonaje;
    private boolean hayVideo;    
    private Videos videoActual;
    private List<Videos> videosActuales;
    public List<Comentarios> comentarios;
    
    public List<Comentarios> getComentarios(){
        return comentarios;
    }
    
    public void setComentarios(List<Comentarios> comentarios){
        this.comentarios = comentarios;
    }    
    
    public Videos getVideoActual(){
        return videoActual;
    }
    
    public void setVideoActual(Videos video){
        this.videoActual= video;
    }
    
    public List<Videos> getVideosActuales(){
        return videosActuales;
    }
    
    public void setVideosActuales(List<Videos> videos){
        this.videosActuales = videos;
    }
    
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
    
        public int getIdPersonaje(){
        return idPersonaje;
    }
    
    public void setIdPersonaje(int id){
        this.idPersonaje= id;
    }
    
    public List<Personas> getPersonasAll(){
        return personasAll;
        }
    
    public void setPersonasAll(List<Personas> personas){
        this.personasAll = personas;
    }
    
}
