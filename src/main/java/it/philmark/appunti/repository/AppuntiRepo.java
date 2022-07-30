package it.philmark.appunti.repository;


import java.util.List;

import it.philmark.appunti.models.Appunti;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Emanuele
 */
public interface AppuntiRepo extends JpaRepository<Appunti, Long> {
    Appunti findByTitolo(String titolo);
    List<Appunti> findAllByAppUserId(Long id);
}
