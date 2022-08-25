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
    @Column (name="Id")
    private Long id;
    @Column(name="titolo")
    private String titolo;
    @Column(name="sottotitolo")
    private String sottotitolo;
    @Column(name="testo")
    @Lob
    private String testo;

    @Column(name="pub")
    private Boolean pub;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToMany(cascade=CascadeType.MERGE)
    @JoinTable(
           name = "appunti_tag", 
           joinColumns = @JoinColumn(name = "appunti_id"), 
           inverseJoinColumns = @JoinColumn(name = "tag_name"))
    private List<Tag> listaTag = new ArrayList<>();

    //dwjwfjwf


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

    public List<Tag> getListaTag() {
        return listaTag;
    }

    public void setListaTag(List<Tag> listaTag) {
        this.listaTag = listaTag;
    }

    public Boolean getPub() {
        return pub;
    }

    public void setPub(Boolean pub) {
        this.pub = pub;
    }
}

