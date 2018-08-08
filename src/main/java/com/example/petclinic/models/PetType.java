package com.example.petclinic.models;


/**
 * Created by Ignat on 08.08.2018.
 */
public class PetType {

    private PetType petType;
    private Owner owner = new Owner();


    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }
}
