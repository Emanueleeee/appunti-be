package it.philmark.appunti.service;

import it.philmark.appunti.domain.Tag;

public interface ServiceTag {
    void addTagToAppunti(String titolo, String descrizione);//Da chiedere idea ad ogni titolo appunti i tag
    Tag saveTag(Tag tag);
}
