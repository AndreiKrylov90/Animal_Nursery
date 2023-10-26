package service;

import java.time.LocalDate;

import model.Animal;
import model.AnimalRegistry;
import model.Camel;
import model.Cat;
import model.Dog;
import model.Donkey;
import model.Hamster;
import model.Horse;

public interface Service {
    public Dog createDog(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands);
    public Cat createCat(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands);
    public Hamster createHamster(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands);
    public Horse createHorse(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands);
    public Camel createCamel(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands);
    public Donkey createDonkey(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands);

    public Dog createDog(AnimalRegistry animalRegistry);
    public Cat createCat(AnimalRegistry animalRegistry);
    public Hamster createHamster(AnimalRegistry animalRegistry);
    public Horse createHorse(AnimalRegistry animalRegistry);
    public Camel createCamel(AnimalRegistry animalRegistry);
    public Donkey createDonkey(AnimalRegistry animalRegistry);

    public String commandsOfAnimal(Animal animal);

    public void newCommands(Animal animal, String newCommand);
     
    public void SortedAnimalRegistry(AnimalRegistry animalRegistry);

    public void counterOfAnimals(AnimalRegistry animalRegistry); 

}
