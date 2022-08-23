package it.philmark.appunti.controllers;

import it.philmark.appunti.models.Appunti;
import it.philmark.appunti.security.service.ServiceAppuntiImpl;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


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
    public List<Appunti> cancellaAppunti(
            @RequestBody Appunti appunti)
    {
        return this.serviceAppuntiImpl.appuntiDel(appunti);
    }

    @GetMapping(value ={"/listaAppunti"})
    @PreAuthorize("hasRole('ADMIN')")
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

    @PostMapping(value ={"/listaAppuntiPub"})
    @ResponseBody
    public List<Appunti> listaAppuntiPub(@RequestBody Boolean pub)
    {
        return this.serviceAppuntiImpl.listaAppuntiPub(pub);

    }

    @PostMapping(value ={"/appuntoById"})
    @ResponseBody
    public Appunti appuntoById(@RequestBody Long id)
    {
        return this.serviceAppuntiImpl.appuntoById(id);
    }
    
}

