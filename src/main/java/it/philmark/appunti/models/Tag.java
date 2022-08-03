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
@Table(name = "Tag")
public class Tag implements Serializable
{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true, name="name",length=50)
    private String name;

    @ManyToMany(fetch=FetchType.EAGER,
                cascade = { CascadeType.ALL },
                mappedBy="tags")
    private List<Appunti> listaAppunti= new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListaAppunti(List<Appunti> listaAppunti) {
        this.listaAppunti = listaAppunti;
    }
}

