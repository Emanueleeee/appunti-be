package it.philmark.appunti.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Appunti extends BaseEntity {
	


	private String titolo;
	private String sottotitolo;
	private String testo;
	
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Tag> tags= new ArrayList<>();

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
	
	
	
}
