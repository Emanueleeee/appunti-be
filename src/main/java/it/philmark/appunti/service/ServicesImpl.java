/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.philmark.appunti.service;

import it.philmark.appunti.domain.AppUser;
import it.philmark.appunti.domain.Appunti;
import it.philmark.appunti.domain.Role;
import it.philmark.appunti.domain.Tag;
import it.philmark.appunti.repository.AppuntiRepo;
import it.philmark.appunti.repository.RoleRepo;
import it.philmark.appunti.repository.TagRepo;
import it.philmark.appunti.repository.UserRepo;

import static java.lang.System.console;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Emanuele
 */
@Service
@Transactional//Serve per mettere many to many subito
@Slf4j
public class ServicesImpl implements Services, UserDetailsService {

    @Autowired
    UserRepo repoUser;
    @Autowired
    RoleRepo repoRole;
    @Autowired
    AppuntiRepo appuntiRepo;
    @Autowired
    TagRepo repoTag;
    private final PasswordEncoder passwordEncoder;

    public ServicesImpl(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public AppUser saveUser(AppUser user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repoUser.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return repoRole.save(role);
    }

    @Override
    public void addRoleToUser(String username, String name) {
        AppUser user = repoUser.findByUsername(username);
        Role role = repoRole.findByName(name);
        user.getRoles().add(role);

    }

    @Override
    public AppUser getUser(String username) {
        return repoUser.findByUsername(username);
    }

    @Override
    public List<AppUser> getUsers() {
        return repoUser.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        AppUser user = repoUser.findByUsername(username);
        UserDetails userDetails;
        if (user == null) {
            throw new UsernameNotFoundException("Username not found");
        } else {
            Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
            user.getRoles().forEach(role -> authorities.add(new SimpleGrantedAuthority(role.getName())));
            userDetails = (UserDetails) new User(user.getUsername(), user.getPassword(), authorities);
        }
        return userDetails;

    }

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
        return appuntiRepo.findAllByUtenteId(id);
    }

    @Override
    public void addTagToAppunti(String titolo, String descrizione) {
        Appunti appunti = appuntiRepo.findByTitolo(titolo);
        Tag tag = repoTag.findByDescrizione(descrizione);
        appunti.getTags().add(tag);
    }

    @Override
    public Tag saveTag(Tag tag) {
        return repoTag.save(tag);
    }

}
