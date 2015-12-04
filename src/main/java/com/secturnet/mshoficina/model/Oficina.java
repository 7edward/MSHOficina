/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.secturnet.mshoficina.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations Hibernate provides JPA implementation
 */
@Entity
@Table(name = "OFICINA")
public class Oficina{

    @Id
    @Column(name = "idcontacto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre_contacto;
    private String correo_oficina;
    private String tel_oficina;
    private String fax;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_contacto() {
        return nombre_contacto;
    }

    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }
    public String getCorreo_oficina() {
        return correo_oficina;
    }

    public void setCorreo_oficina(String correo_oficina) {
        this.correo_oficina = correo_oficina;
    }
    public String getTel_oficina() {
        return tel_oficina;
    }

    public void setTel_oficina(String tel_oficina) {
        this.tel_oficina = tel_oficina;
    }
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre_contacto=" + nombre_contacto + ", correo_oficina=" + correo_oficina
                + ", tel_oficina=" + tel_oficina+ ", fax=" + fax;
    }

}

