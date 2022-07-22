package it.philmark.appunti.service;

import java.util.List;

import it.philmark.appunti.domain.Appunti;

public class ServiceAppuntiImpl implements ServiceAppunti{

	@Override
	public Appunti saveAppunti(Appunti appunti) {
		return appuntiRepo.save(appunti);
	}

	@Override
	public void appuntiDel(Appunti appunti) {
		
		appuntiRepo.delete(appunti);
	}

	@Override
	public List<Appunti> listaAppunti() {
		
		return appuntiRepo.findAll();
	}

	@Override
	public List<Appunti> listaAppuntiPerUtente(Long id) {
		
		 return appuntiRepo.findAllByAppUserId(id);
	}
	
	
}


