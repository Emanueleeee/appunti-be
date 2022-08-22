package it.philmark.appunti.security.service;

import java.util.List;

import it.philmark.appunti.models.Appunti;

public interface ServiceAppunti {

    //void addTagToAppunti(Long id, String name);//Da chiedere idea ad ogni titolo appunti i tag

    Appunti saveAppunti(Appunti appunti);

    public List<Appunti> appuntiDel(Appunti appunti);

    public List<Appunti> listaAppunti();

    public List<Appunti> listaAppuntiPerUtente(Long id);
    
    public List<Appunti> listaAppuntiPub(Boolean pub);


}
