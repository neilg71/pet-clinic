package com.adw.petclinic.petclinic.services;

import com.adw.petclinic.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
