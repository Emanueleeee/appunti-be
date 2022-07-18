/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.philmark.appunti.service;

import it.philmark.appunti.domain.AppUser;
import it.philmark.appunti.domain.Role;
import java.util.List;

/**
 *
 * @author Emanuele
 */
public interface Services {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String name);
    AppUser getUser(String username);
    List<AppUser>getUsers();
}
