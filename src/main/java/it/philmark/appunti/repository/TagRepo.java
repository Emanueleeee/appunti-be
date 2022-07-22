/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package it.philmark.appunti.repository;

import it.philmark.appunti.domain.Appunti;
import it.philmark.appunti.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author crist
 */
public interface TagRepo extends JpaRepository<Tag, Long>
{
    Tag findByName(String descrizione);
}
