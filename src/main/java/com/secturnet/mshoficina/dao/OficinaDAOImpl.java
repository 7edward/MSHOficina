/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.secturnet.mshoficina.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.secturnet.mshoficina.model.Oficina;

@Repository
public class OficinaDAOImpl implements OficinaDAO {

    private static final Logger logger = LoggerFactory.getLogger(OficinaDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addOficina(Oficina o) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(o);
        logger.info("Office saved successfully, Office Details=" + o);
    }

    @Override
    public void updateOficina(Oficina o) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(o);
        logger.info("Office updated successfully, Office Details=" + o);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Oficina> listOficinas() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Oficina> oficinaList = session.createQuery("from Oficina").list();
        for (Oficina o : oficinaList) {
            logger.info("Oficina List::" + o);
        }
        return oficinaList;
    }

    @Override
    public Oficina getOficinaById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Oficina o = (Oficina) session.load(Oficina.class, new Integer(id));
        logger.info("Oficna loaded successfully, Oficina details=" + o);
        return o;
    }

    @Override
    public void removeOficina(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Oficina o = (Oficina) session.load(Oficina.class, new Integer(id));
        if (null != o) {
            session.delete(o);
        }
        logger.info("Oficina deleted successfully, Oficina details=" + o);
    }
}