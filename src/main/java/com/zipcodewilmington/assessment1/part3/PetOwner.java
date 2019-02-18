package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Yang on 02/18/19.
 */
public class PetOwner {
    protected String name;
    protected Pet[] pets = new Pet[0];

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */


    TreeMap<String, ArrayList<String>> petOwners;

    public PetOwner() {
        petOwners = new TreeMap<String, ArrayList<String>>();
    }

    public void add(String name, String petName) {
        if (petOwners.containsKey(name)) {
            ArrayList<String> retrievedpetName = petOwners.get(name);
            retrievedpetName.add(petName);
            petOwners.put(name, retrievedpetName);
        } else {
            ArrayList<String> newNumber = new ArrayList<String>();
            newNumber.add(petName);
            petOwners.put(name, newNumber);
        }
    }

    public PetOwner(String name, Pet... pets) {
            this.name = name;
            if (pets != null) {
                this.pets = pets.clone();
                setOwner(this.pets);
            }
        }

        public void setOwner (Pet... pets) {
            for(Pet pet : pets) {
                pet.setOwner(this);
            }
        }

        /**
         * @param array to be added to the composite collection of Pets
         */

        public List<Pet> convertToList(Pet[] array) {
            return new ArrayList<>(Arrays.asList(pets));
        }

        public Pet[] convertFromList(List<Pet> list) {
            return list.toArray(new Pet[list.size()]);
        }
        public void addPet(Pet pet) {
            List<Pet> listPets = convertToList(pets);
            listPets.add(pet);
            this.pets = convertFromList(listPets);
        }

        /**
         * @param pet pet to be removed from the composite collection Pets
         */
        public void removePet(Pet pet) {
            List<Pet> listPets = convertToList(pets);
            listPets.remove(pet);
            if(convertFromList(listPets).length > 0) {
                this.pets = convertFromList(listPets);
            } else {
                this.pets = new Pet[1];
            }
        }

        /**
         * @param pet pet to evaluate ownership of
         * @return true if I own this pet
         */
        public Boolean isOwnerOf(Pet pet) {
            List<Pet> listP = convertToList(pets);
            return listP.contains(pet);
        }

        /**
         * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
         */
        public Integer getYoungetPetAge() {
            Pet younGest = pets[0];
            for (Pet pet : pets) {
                if (pet.getAge() < younGest.getAge()) {
                    younGest = pet;
                }
            }
            return younGest.getAge();
        }




        /**
         * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
         */
        public Integer getOldestPetAge() {
            Pet oldest = pets[0];
            for (Pet pet : pets) {
                if (pet.getAge() > oldest.getAge()) {
                    oldest = pet;
                }
            }
            return oldest.getAge();
        }


        /**
         * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
         */
        public Float getAveragePetAge() {
            int total = 0;
            for (Pet pet : pets) {
                total += pet.getAge();
            }
            return (float)total/pets.length;
        }

        /**
         * @return the number of Pet objects stored in this class
         */
        public Integer getNumberOfPets() {
            return pets.length;
        }

        /**
         * @return the name property of the Pet
         */
        public String getName() {
            return name;
        }

        /**
         * @return array representation of animals owned by this PetOwner
         */
        public Pet[] getPets() {
            if(pets.length > 0) {
                return pets;
            } else {
                return null;
            }
        }
    }
