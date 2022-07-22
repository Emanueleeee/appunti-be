package it.philmark.appunti.service;

import it.philmark.appunti.domain.Tag;
import it.philmark.appunti.repository.AppuntiRepo;
import it.philmark.appunti.repository.TagRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceTagImpl implements ServiceTag {

    @Autowired
    TagRepo tagRepo;

    @Override
    public Tag saveTag(Tag tag) {
        return tagRepo.save(tag);
    }

}
