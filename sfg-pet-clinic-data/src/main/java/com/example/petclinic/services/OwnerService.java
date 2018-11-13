package com.example.petclinic.services;


import com.example.petclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
