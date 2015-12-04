/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.secturnet.mshoficina.service;

import java.util.List;
 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.secturnet.mshoficina.model.Oficina;
import com.secturnet.mshoficina.dao.OficinaDAO;

@Service
public class OficinaServiceImpl implements OficinaService {
     
    private OficinaDAO oficinaDAO;
 
    public void setOficina(OficinaDAO oficinaDAO) {
        this.oficinaDAO = oficinaDAO;
    }
 
    @Override
    @Transactional
    public void addOficina(Oficina o) {
        this.oficinaDAO.addOficina(o);
    }
 
    @Override
    @Transactional
    public void updateOficina(Oficina o) {
        this.oficinaDAO.updateOficina(o);
    }
 
    @Override
    @Transactional
    public List<Oficina> listOficinas() {
        return this.oficinaDAO.listOficinas();
    }
 
    @Override
    @Transactional
    public Oficina getOficinaById(int id) {
        return this.oficinaDAO.getOficinaById(id);
    }
 
    @Override
    @Transactional
    public void removeOficina(int id) {
        this.oficinaDAO.removeOficina(id);
    }
 
}
