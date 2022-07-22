package it.philmark.appunti.service;

import java.util.List;

import it.philmark.appunti.domain.Appunti;

public interface ServiceAppunti {
		 Appunti saveAppunti(Appunti appunti);
		    public void appuntiDel(Appunti appunti);
		    public List<Appunti>listaAppunti();
		    public List<Appunti>listaAppuntiPerUtente(Long id);

	}


