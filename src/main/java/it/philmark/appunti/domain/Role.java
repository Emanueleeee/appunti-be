/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.philmark.appunti.domain;

import javax.persistence.Entity;


/**
 * @author Emanuele
 */
@Entity
public class Role extends BaseEntity {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role(Long id, String name) {
        this.name = name;
    }

    public Role() {
    }

}
