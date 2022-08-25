package it.philmark.appunti.security.service;

import it.philmark.appunti.models.Tag;

import java.util.List;

public interface ServiceTag {

    Tag saveTag(Tag tag);
    Tag cercaTag(String name);
    List<Tag> listaTuttiTag();
}

