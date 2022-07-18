/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.philmark.appunti.Controller;

import it.philmark.appunti.domain.AppUser;
import it.philmark.appunti.service.ServicesImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Emanuele
 */
@CrossOrigin("*")
@RestController
public class Controller01 {

    @Autowired
    ServicesImpl servImpl;

    @RequestMapping(value = {"/listaUtenti"})
    public ResponseEntity<List<AppUser>> getUsers() {
        return ResponseEntity.ok().body(servImpl.getUsers());
    }
//
}
