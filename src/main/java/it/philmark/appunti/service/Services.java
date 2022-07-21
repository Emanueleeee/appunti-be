/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.philmark.appunti.service;

import it.philmark.appunti.domain.AppUser;
import it.philmark.appunti.domain.Appunti;
import it.philmark.appunti.domain.Role;
import it.philmark.appunti.domain.Tag;
import java.util.List;

/**
 *
 * @author Emanuele
 */
public interface Services {
    //Metodi Utente
    AppUser saveUser(AppUser user);
    AppUser getUser(String username);
    List<AppUser>getUsers();
    //Metodi Ruoli
    Role saveRole(Role role);
    void addRoleToUser(String username, String name);
    //Metodi Appunti
     Appunti saveAppunti(Appunti appunti);
    public void appuntiDel(Appunti appunti);
    public List<Appunti>listaAppunti();
   // public List<Appunti>listaAppuntiPerUtente(Long id);
    //Metodi Tag
    void addTagToAppunti(String titolo, String descrizione);//Da chiedere idea ad ogni titolo appunti i tag
     Tag saveTag(Tag tag);
    
    
    
    
}
