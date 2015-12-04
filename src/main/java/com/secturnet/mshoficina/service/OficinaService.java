/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.secturnet.mshoficina.service;

import java.util.List;
 
import com.secturnet.mshoficina.model.Oficina;
 
public interface OficinaService {
 
    public void addOficina(Oficina p);
    public void updateOficina(Oficina p);
    public List<Oficina> listOficinas();
    public Oficina getOficinaById(int id);
    public void removeOficina(int id);
     
}