/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.philmark.appunti.domain;

import javax.persistence.Entity;


/**
 *
 * @author crist
 */
@Entity
public class Tag extends BaseEntity
{

    private String descrizione;


    public String getDescrizione()
    {
        return descrizione;
    }

    public void setDescrizione(String descrizione)
    {
        this.descrizione = descrizione;
    }
    
    
}
