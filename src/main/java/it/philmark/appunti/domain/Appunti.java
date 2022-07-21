package it.philmark.appunti.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Appunti extends BaseEntity {
	


	private String titolo;
	private String sottotitolo;
	private String testo;
	
	@ManyToOne
	@JoinColumn(name="app_user_id")
	private AppUser appUser;
	@ManyToMany(fetch = FetchType.EAGER)
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

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }
	
	
	
}
