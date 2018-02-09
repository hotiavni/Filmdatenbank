/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entitys.web;

import Entitys.Regissuer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Avni
 */
@Stateless
public class RegissuerFacade extends AbstractFacade<Regissuer> {

    @PersistenceContext(unitName = "FilmdatenbnkPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegissuerFacade() {
        super(Regissuer.class);
    }
    
}
