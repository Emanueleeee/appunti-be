/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.philmark.appunti.Controller;

import it.philmark.appunti.domain.AppUser;
import it.philmark.appunti.domain.Role;
import it.philmark.appunti.service.AppUserServicesImpl;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author Emanuele
 */
public class AppUserController {
     @Autowired
    AppUserServicesImpl servImpl;
    
    @GetMapping(value = {"/usersList"})
    public ResponseEntity<List<AppUser>> getUsers() {
        return ResponseEntity.ok().body(servImpl.getUsers());
    }

    @PostMapping(value = {"/saveUser"})
    public ResponseEntity<AppUser> getUser(@RequestBody AppUser user) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/saveUser").toUriString());
        return ResponseEntity.created(uri).body(servImpl.saveUser(user));
    }

    @RequestMapping(value = {"/saveRole"})
    public ResponseEntity<Role> getRole(@RequestBody Role role) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/saveRole").toUriString());
        return ResponseEntity.created(uri).body(servImpl.saveRole(role));
    }

    @RequestMapping(value = {"/addRoleToUser"})
    public ResponseEntity<?> addRoleToUser(@RequestBody String username, String name) {
        servImpl.addRoleToUser(username, name);
        return ResponseEntity.ok().build();
    }
}
