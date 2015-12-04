/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.secturnet.mshoficina.dao;

import java.util.List;
 
import com.secturnet.mshoficina.model.Oficina;

public interface OficinaDAO {
    public void addOficina(Oficina o);
    public void updateOficina(Oficina o);
    public List<Oficina> listOficinas();
    public Oficina getOficinaById(int id);
    public void removeOficina(int id);
}
