package it.philmark.appunti.security.service;

import it.philmark.appunti.models.Tag;
import it.philmark.appunti.repository.TagRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional//Serve per mettere many to many subito
@Slf4j
public class ServiceTagImpl implements ServiceTag {

    @Autowired
    TagRepo tagRepo;

    @Override
    public Tag saveTag(Tag tag) {
        return tagRepo.save(tag);
    }

}

