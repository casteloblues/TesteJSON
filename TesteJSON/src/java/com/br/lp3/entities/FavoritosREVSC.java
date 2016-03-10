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
@Table(name = "FAVORITOSREVSC")
public class FavoritosREVSC implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFav")
    private long idFav;
    
    @Column(name = "idUser")
    private String user;
    
    @Column(name = "idRev")
    private String idRev;

    public FavoritosREVSC() {
    }

    public long getIdFav() {
        return idFav;
    }

    public void setIdFav(long idFav) {
        this.idFav = idFav;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIdRev() {
        return idRev;
    }

    public void setIdRev(String idRev) {
        this.idRev = idRev;
    }

    @Override
    public String toString() {
        return "FavoritosREVSC{" + "idFav=" + idFav + ", user=" + user + ", idRev=" + idRev + '}';
    }
}
