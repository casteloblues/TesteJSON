
package com.br.lp3.entities;

import java.io.Serializable;
import javax.persistence.Column;

/**
 *
 * @author 31240550
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "USERLP3")
public class UserLP3 implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_user")
    private long idUser;
    
    @Column (name = "USERNAME")
    private String username;
    
    @Column (name = "PASSWORD")
    private String password;

    public UserLP3() {
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserLP3{" + "idUser=" + idUser + ", username=" + username + ", password=" + password + '}';
    }
}
