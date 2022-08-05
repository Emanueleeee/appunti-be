package it.philmark.appunti.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 *
 * @author crist
 */

@Entity
public class Tag {

    @Id
    @Column( name = "name", length = 50)
    private String name;

    @ManyToMany(mappedBy = "listaTag")
    private List<Appunti> listaAppunti = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
