package it.philmark.appunti.security.service;

import java.util.List;

import it.philmark.appunti.models.Appunti;
import it.philmark.appunti.models.Tag;
import org.springframework.beans.factory.annotation.Autowired;


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
    public List<Appunti> appuntiDel(Appunti appunti) {

        appuntiRepo.delete(appunti);
        return appuntiRepo.findAll();
    }

    @Override
    public List<Appunti> listaAppunti() {

        return appuntiRepo.findAll();
    }

    @Override
    public List<Appunti> listaAppuntiPerUtente(Long id) {

        return appuntiRepo.findAllByUserId(id);
    }

    @Override
    public void addTagToAppunti(String titolo, String name) {
        Appunti appunti = appuntiRepo.findByTitolo(titolo);
        Tag tag = tagRepo.findByName(name);
        appunti.getTags().add(tag);
    }


}



