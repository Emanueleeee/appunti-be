package it.philmark.appunti.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 *
 * @author crist
 */

@Entity
public class Tag {

    @Id
    @NotEmpty
    @Size(max = 20,min= 3)
    @Column( name = "name")
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
