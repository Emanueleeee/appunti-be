package it.philmark.appunti.controllers;

import it.philmark.appunti.models.Tag;
import it.philmark.appunti.security.service.ServiceTagImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
}
