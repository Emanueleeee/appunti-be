/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.philmark.appunti.repository;


import it.philmark.appunti.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Emanuele
 */
public interface RoleRepo extends JpaRepository<Role, Long> {
    
    Role findByName(String name);
}
