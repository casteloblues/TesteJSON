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
@Table(name = "INFOREVSC")
public class InfoUREVSC implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInfoUser")
    private long idInfoUser;
    
    @Column(name = "idUser")
    private String user;
    
    @Column(name = "info")
    private String info;

    public InfoUREVSC() {
    }

    public long getIdInfoUser() {
        return idInfoUser;
    }

    public void setIdInfoUser(long idInfoUser) {
        this.idInfoUser = idInfoUser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "InfoUREVSC{" + "idInfoUser=" + idInfoUser + ", user=" + user + ", info=" + info + '}';
    }
}
