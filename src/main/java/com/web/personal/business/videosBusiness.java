/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.personal.business;

import javax.ejb.Stateless;
import javax.inject.Inject;
import com.web.personal.DAO.videosDAO;
import com.web.personal.entity.Videos;
import java.util.List;

/**
 *
 * @author Carlos
 */
@Stateless
public class videosBusiness {
    @Inject
    private videosDAO videosDao;
    
    public List<Videos> obtenerTodosLosVideos(){
        return videosDao.obtenerTodosLosVideos();
    }
    
}
