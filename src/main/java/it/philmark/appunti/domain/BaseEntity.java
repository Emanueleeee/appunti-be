/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.philmark.appunti.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

/**
 *
 * @author Emanuele
 */
@MappedSuperclass
public class BaseEntity {
    
    private LocalDate dataCreazione;
    private LocalDate dataModifica;
    private String utenteCreazione;
    private String utenteModifica;
    
   
    public LocalDate getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(LocalDate dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public LocalDate getDataModifica() {
        return dataModifica;
    }

    public void setDataModifica(LocalDate dataModifica) {
        this.dataModifica = dataModifica;
    }

    public String getUtenteCreazione() {
        return utenteCreazione;
    }

    public void setUtenteCreazione(String utenteCreazione) {
        this.utenteCreazione = utenteCreazione;
    }

    public String getUtenteModifica() {
        return utenteModifica;
    }

    public void setUtenteModifica(String utenteModifica) {
        this.utenteModifica = utenteModifica;
    }
    
}
