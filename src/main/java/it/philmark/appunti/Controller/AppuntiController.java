/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.philmark.appunti.Controller;

import it.philmark.appunti.domain.Appunti;
import it.philmark.appunti.service.ServiceAppuntiImpl;
import it.philmark.appunti.service.ServiceTagImpl;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author crist
 */
@CrossOrigin("*")
@RestController
@Slf4j
public class AppuntiController
{
    @Autowired
    ServiceAppuntiImpl serviceAppuntiImpl;
    
    
    @PostMapping(value ={"/salvaAppunti"})
    @ResponseBody
    public Appunti salvaAppunti(
            @RequestBody Appunti appunti)
    {
        return this.serviceAppuntiImpl.saveAppunti(appunti);
    }
    
    @PostMapping(value ={"/cancellaAppunti"})
    @ResponseBody
    public void cancellaAppunti(
            @RequestBody Appunti appunti)
    {
        this.serviceAppuntiImpl.appuntiDel(appunti);
    }
    
    @GetMapping(value ={"/listaAppunti"})
    @ResponseBody
    public List<Appunti> listaAppunti()
    {
        return this.serviceAppuntiImpl.listaAppunti();
    }
    
    @PostMapping(value ={"/listaAppuntiUtente"})
    @ResponseBody
    public List<Appunti> listaAppuntiUtente(
            @RequestBody Long id)
    {
        return this.serviceAppuntiImpl.listaAppuntiPerUtente(id);
    }
    @PostMapping(value ={"/aggiungiTagAppunti"})
    @ResponseBody
    public void aggiungiTagAppunti(
            @RequestBody String titolo, String descizione)
    {
        this.serviceAppuntiImpl.addTagToAppunti(titolo, descizione);
    }
}
