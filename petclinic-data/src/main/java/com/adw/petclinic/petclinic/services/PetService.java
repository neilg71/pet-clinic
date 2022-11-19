package com.adw.petclinic.petclinic.services;

import com.adw.petclinic.petclinic.model.Owner;
import com.adw.petclinic.petclinic.model.Pet;

import java.util.Set;

public class PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
