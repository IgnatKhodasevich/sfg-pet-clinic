package com.example.petclinic.models;


public class PetType extends BaseEntity {

    private PetType petType;
    private Owner owner = new Owner();


    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }
}
