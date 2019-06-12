/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import facade.CiudadesFacade;
import facade.ProfesoresFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.Ciudades;
import modelo.Profesores;

/**
 *
 * @author NelsonHernan
 */
@ManagedBean(name = "p")
@SessionScoped
public class ProfesorControlador {

    /**
     * Creates a new instance of ProfesorControlador
     */
    public ProfesorControlador() {
    }
    @EJB
    ProfesoresFacade profesoresFacade;
    @EJB
    CiudadesFacade ciudadesFacade;
    Profesores profesor=new Profesores();
    Ciudades ciudad=new Ciudades();

    public Ciudades getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudades ciudad) {
        this.ciudad = ciudad;
    }

    public Profesores getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesores profesor) {
        this.profesor = profesor;
    }
    
    public List<Profesores> consultarProfes()
    {
        return profesoresFacade.findAll();
}
    public String crearProfesor()
    {
        
        profesor.setIdCiudad(ciudadesFacade.find(ciudad.getIdCiudad()));
        profesoresFacade.registrar(profesor);
        profesor=new Profesores();
        return "Lista";
    }
    public String editarProfesor(Profesores profesor){
        this.profesor=profesor;
        //this.ciudad=ciudadesFacade.find(profesor.getIdCiudad());
        return "Actualizar";
    }   
    public String editarProfesor(){
        profesor.setIdCiudad(ciudadesFacade.find(ciudad.getIdCiudad()));
        profesoresFacade.edit(profesor);
        profesor=new Profesores();
        ciudad=new Ciudades();
        return "Lista";
    }
    public String eliminarProfesor(Profesores profesor)
    {
        profesoresFacade.remove(profesor);
        return "Lista";
    }
}