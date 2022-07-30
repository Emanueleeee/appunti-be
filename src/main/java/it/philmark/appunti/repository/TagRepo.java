package it.philmark.appunti.repository;


import it.philmark.appunti.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author crist
 */
public interface TagRepo extends JpaRepository<Tag, Long>
{
    Tag findByName(String descrizione);
}
