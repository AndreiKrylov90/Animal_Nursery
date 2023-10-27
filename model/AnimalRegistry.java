package model;

import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry {
    List<Animal> animals;
    int pet_numbers;
    int pack_numbers;
    
    public AnimalRegistry() {
        this.animals = new ArrayList<Animal>();
        this.pet_numbers = 0;
        this.pack_numbers = 0;
    }

    public int getPet_numbers() {
        return pet_numbers;
    }

    public int getPack_numbers() {
        return pack_numbers;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        String allAnimals = "";
        int i = 1;
        for (Animal animal: animals) {
            allAnimals += i + ": " + animal.toString() + "\n";
            i++;
        }
        
        return "Реестр зверей в питомнике: " + "\n" +
        allAnimals;

    }

     
    public void addAnimal(Animal animal) {
        animals.add(animal);
        if (animal.getType() == "Dog" || animal.getType() == "Cat" || animal.getType() == "Hamster") {
            pet_numbers += 1;
        }
        if (animal.getType() == "Horse" || animal.getType() == "Camel" || animal.getType() == "Donkey") {
            pack_numbers += 1;
        }
    }
    
    
}
