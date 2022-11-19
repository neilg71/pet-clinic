package com.adw.petclinic.petclinic.services;

import com.adw.petclinic.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLasName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
