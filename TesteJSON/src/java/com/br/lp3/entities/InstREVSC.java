/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Castelo
 */
@Entity
@Table(name = "INSTREV")
public class InstREVSC implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRev")
    private long idRev;
    private String photo;
    private String make;
    private String model;
    private String finish;
    private String year;
    private String title;
    private String description;

    public InstREVSC() {
    }

    public InstREVSC(String id, String photo, String make, String model, String finish, String year, String title, String description) {
//        this.id = id;
        this.photo = photo;
        this.make = make;
        this.model = model;
        this.finish = finish;
        this.year = year;
        this.title = title;
        this.description = description;
    }

    public long getIdRev() {
        return idRev;
    }

    public void setIdRev(long idRev) {
        this.idRev = idRev;
    }

    @Override
    public String toString() {
        return "InstRev{" + "idRev=" + idRev + '}';
    }
}
