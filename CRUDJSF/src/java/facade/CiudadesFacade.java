/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Ciudades;

/**
 *
 * @author NelsonHernan
 */
@Stateless
public class CiudadesFacade extends AbstractFacade<Ciudades> {
    @PersistenceContext(unitName = "CRUDJSFPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CiudadesFacade() {
        super(Ciudades.class);
    }
    
}
