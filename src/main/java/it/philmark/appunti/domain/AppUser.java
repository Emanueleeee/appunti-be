/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.philmark.appunti.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/**
 *
 * @author Emanuele
 */
@Entity
@Table(name="AppUser")
public class AppUser implements Serializable {
	
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    private Long id;
    @Column(unique=true,name="username", length=50)
    private String username;
    @Column(name="name")
    private String name;
    @Column(name="password",nullable=false)
    private String password;
    
    
    @OneToMany(cascade = CascadeType.ALL,
    		   fetch=FetchType.LAZY,
    		   mappedBy="appUser")
    private List<Appunti> listaAppunti = new ArrayList<>(); 
    
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Role> roles= new ArrayList<>();
    
    public AppUser() {
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public AppUser(Long id, String name, String username, String password,ArrayList<Role> list) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.roles=list;
       
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
