package it.philmark.appunti.controllers;

import it.philmark.appunti.models.Appunti;
import it.philmark.appunti.models.Tag;
import it.philmark.appunti.security.service.ServiceTagImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author crist
 */
@CrossOrigin("*")
@RestController
@Slf4j
public class TagController
{
    @Autowired
    ServiceTagImpl serviceTagImpl;

    @PostMapping(value ={"/salvaTag"})//Si puo togliere perche saveAppunti fa tutto lui
    @ResponseBody
    public Tag salvaTag(
            @RequestBody Tag tag)
    {
        return this.serviceTagImpl.saveTag(tag);
    }

    @PostMapping(value ={"/cercaTag"})
    @ResponseBody
    public Tag cercaTag(@RequestBody String name){
        return serviceTagImpl.cercaTag(name);
    }

    @GetMapping(value ={"/listaTuttiTag"})
    @ResponseBody
    public List<Tag> listaTuttiTag()
    {
        return this.serviceTagImpl.listaTuttiTag();
    }
}
