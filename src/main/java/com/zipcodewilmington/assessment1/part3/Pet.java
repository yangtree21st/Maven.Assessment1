package com.zipcodewilmington.assessment1.part3;

/**
 * Created by yang on 2/18/18.
 */
public abstract class Pet implements Animal {
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    protected  String name ="";
    protected Integer age=0 ;
    protected PetOwner owner;

    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    public Pet() {
        name = "";
        age = 0;
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {

        this.name = name;
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {

        this.age = age;
    }

    /**
     * @param name name of this pet
     * @param age  age of this pet
     */
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return name of this pet
     */
    public String getName() {

        return name;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {

        return age;
    }

    /**
     * @param newPetOwner the new owner of this pet
     *                    ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {
        owner = newPetOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {

        return owner;
    }
}