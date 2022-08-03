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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(unique = true, name = "name", length = 50)
    private String name;
    
//     @ManyToMany(fetch=FetchType.LAZY,
//            cascade = {
//                CascadeType.MERGE,
//                CascadeType.PERSIST
//               
//            },mappedBy="listaTag")
    @ManyToMany(mappedBy = "listaTag")
    private List<Appunti> listaAppunti = new ArrayList<>();

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

}
