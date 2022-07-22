package it.philmark.appunti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import it.philmark.appunti.domain.Appunti;
import it.philmark.appunti.domain.Tag;
import it.philmark.appunti.repository.AppuntiRepo;
import it.philmark.appunti.repository.TagRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional//Serve per mettere many to many subito
@Slf4j
public class ServiceAppuntiImpl implements ServiceAppunti{

	@Autowired
    AppuntiRepo appuntiRepo;
	@Autowired
    TagRepo tagRepo;
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
        
        @Override
        public void addTagToAppunti(String titolo, String name) {
         Appunti appunti = appuntiRepo.findByTitolo(titolo);
        Tag tag = tagRepo.findByName(name);
        appunti.getTags().add(tag);
    }
	
	
}


