/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.philmark.appunti.service;

import it.philmark.appunti.domain.AppUser;
import it.philmark.appunti.domain.Role;
import it.philmark.appunti.repository.RoleRepo;
import it.philmark.appunti.repository.UserRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Emanuele
 */
@Service
public class ServicesImpl implements Services {

    @Autowired
    UserRepo repoUser;
    @Autowired
    RoleRepo repoRole;
    @Override
    public AppUser saveUser(AppUser user) {
        
        return repoUser.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return repoRole.save(role);
    }

    @Override
    public void addRoleToUser(String username, String name) {
        AppUser user =repoUser.findByUsername(username);
        Role role=repoRole.findByName(name);
        user.getRoles().add(role);
        
    }

    @Override
    public AppUser getUser(String username) {
        return repoUser.findByUsername(username);
    }

    @Override
    public List<AppUser> getUsers() {
        return repoUser.findAll();
    }
    
}
