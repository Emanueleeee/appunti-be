package it.philmark.appunti.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Appunti")
public class Appunti extends BaseEntity implements Serializable {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="titolo")
    private String titolo;
    @Column(name="sottotitolo")
    private String sottotitolo;
    @Column(name="testo")
    private String testo;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    @ManyToMany(fetch = FetchType.EAGER,
            cascade = { //quindi per salvare la relazione
                    CascadeType.PERSIST, //salveró la prenotazione e spring salvera entrambe
                    CascadeType.MERGE
            })
    @JoinTable(
            name = "appuntiTags",
            joinColumns = @JoinColumn(name = "appunti_id"),
            inverseJoinColumns = @JoinColumn(name = "tags_id"))
    private List<Tag> tags= new ArrayList<>();

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getSottotitolo() {
        return sottotitolo;
    }

    public void setSottotitolo(String sottotitolo) {
        this.sottotitolo = sottotitolo;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}

