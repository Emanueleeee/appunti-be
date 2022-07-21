/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.philmark.appunti.repository;

import it.philmark.appunti.domain.Appunti;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Emanuele
 */
public interface AppuntiRepo extends JpaRepository<Appunti, Long> {
    
}
