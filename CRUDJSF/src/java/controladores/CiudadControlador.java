/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import facade.CiudadesFacade;
import java.util.List;
import java.util.Set;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import modelo.Ciudades;

/**
 *
 * @author NelsonHernan
 */
@ManagedBean(name = "c")
@SessionScoped
public class CiudadControlador {

    /**
     * Creates a new instance of CiudadControlador
     */
    @EJB
    CiudadesFacade ciudadFacade;
    Ciudades ciudad=new Ciudades();
    public CiudadControlador() {
    }
    

    public Ciudades getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudades ciudad) {
        this.ciudad = ciudad;
    }
      
    public List<Ciudades> consultarCiudad(){
        return ciudadFacade.findAll();
    }
    
    public String crearCiudad(){
          
         ciudadFacade.registrar(ciudad);
         ciudad=new Ciudades();
         return "Crear";
     }
    public String editarCiudad(Ciudades ciudad){
        this.ciudad=ciudad;
        return "Actualizar";
    }   
    public String editarCiudad(){
        ciudadFacade.edit(ciudad);
        ciudad=new Ciudades();
        return "Lista";
    }
    public void eliminarCiudad(Ciudades ciudad)
    {
        ciudadFacade.remove(ciudad);
        //return "Lista";
    }
    
}
