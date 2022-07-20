/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.philmark.appunti.Controller;

import com.sun.jndi.toolkit.url.Uri;
import it.philmark.appunti.domain.AppUser;
import it.philmark.appunti.domain.Role;
import it.philmark.appunti.service.ServicesImpl;
import java.net.URI;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author Emanuele
 */
@CrossOrigin("*")
@RestController
public class Controller01 {

    @Autowired
    ServicesImpl servImpl;

    @GetMapping(value = {"/usersList"})
    public ResponseEntity<List<AppUser>> getUsers() {
        return ResponseEntity.ok().body(servImpl.getUsers());
    }

    @RequestMapping(value = {"/saveUser"})
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
    @RequestMapping(value = {"/refreshToken"})
    public void refreshToken(HttpServletRequest request, HttpServletResponse response) {
         String authorizationHeader = request.getHeader(AUTHORIZATION);
    }

  

//
}
