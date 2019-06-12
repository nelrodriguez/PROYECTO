/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Aprendiz
 */
@Named(value = "claseControlador")
@SessionScoped
public class ClaseControlador implements Serializable {

    /**
     * Creates a new instance of ClaseControlador
     */
    public ClaseControlador() {
    }
    
}
