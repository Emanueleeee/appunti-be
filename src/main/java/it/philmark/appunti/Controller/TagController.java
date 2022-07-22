/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.philmark.appunti.Controller;

import it.philmark.appunti.domain.Tag;
import it.philmark.appunti.service.AppUserServicesImpl;
import it.philmark.appunti.service.ServiceTagImpl;
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
    
}
