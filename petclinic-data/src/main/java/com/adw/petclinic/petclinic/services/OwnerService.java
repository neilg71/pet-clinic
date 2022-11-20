package com.adw.petclinic.petclinic.services;

import com.adw.petclinic.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
