/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bony.dao;

import com.bony.entity.Tablecustomers;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */

@Repository
@Transactional
public class CustomerService {
    
    static final Logger logger = Logger.getLogger(CustomerService.class.getName());

    @PersistenceUnit
    EntityManagerFactory emf;

    private EntityManager em;
    
    @Transactional
    public void saveCustomer(Tablecustomers customer){
        setEm(emf.createEntityManager());
        getEm().getTransaction().begin();
        getEm().persist(customer);
        getEm().getTransaction().commit();
        getEm().close();
        
    }
    
    public Tablecustomers findByUsername(String username){
        Tablecustomers customer = new Tablecustomers();
        try {
            //setEm(emf.createEntityManager());
            em = emf.createEntityManager();
            
            customer = (Tablecustomers) em.createNamedQuery("Tablecustomers.findByUsername").setParameter("username", username).getSingleResult();
            System.out.println("Nama CUstomers: " + customer.getUsername());
        } catch (NoResultException nre) {
            logger.severe("Username tidak ada");
        }
        
        return customer;
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }
}
