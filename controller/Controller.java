package controller;

import java.time.LocalDate;

import model.Animal;
import model.AnimalRegistry;
import service.ServiceImpl;

public class Controller {
    ServiceImpl serviceImpl;

    public Controller() {
        this.serviceImpl = new ServiceImpl();
    }

    public void SortedAnimalRegistry(AnimalRegistry animalRegistry) {
        serviceImpl.SortedAnimalRegistry(animalRegistry);
    }

    public void counterOfAnimals(AnimalRegistry animalRegistry) {
        serviceImpl.counterOfAnimals(animalRegistry);
    }

    public void createDog(AnimalRegistry animalRegistry) {
        serviceImpl.createDog(animalRegistry);
    }

    public void createCat(AnimalRegistry animalRegistry) {
        serviceImpl.createCat(animalRegistry);
    }

    public void createHamster(AnimalRegistry animalRegistry) {
        serviceImpl.createHamster(animalRegistry);
    }

    public void createHorse(AnimalRegistry animalRegistry) {
        serviceImpl.createHorse(animalRegistry);
    }

    public void createCamel(AnimalRegistry animalRegistry) {
        serviceImpl.createCamel(animalRegistry);
    }

    public void createDonkey(AnimalRegistry animalRegistry) {
        serviceImpl.createDonkey(animalRegistry);
    }

    public void createDog(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands) {
        serviceImpl.createDog(animalRegistry, name, birthDate, commands);
    }
    public void createCat(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands) {
        serviceImpl.createCat(animalRegistry, name, birthDate, commands);
    }
    public void createHamster(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands) {
        serviceImpl.createHamster(animalRegistry, name, birthDate, commands);
    }
    public void createHorse(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands) {
        serviceImpl.createHorse(animalRegistry, name, birthDate, commands);
    }
    public void createCamel(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands) {
        serviceImpl.createCamel(animalRegistry, name, birthDate, commands);
    }
    public void createDonkey(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands) {
        serviceImpl.createDonkey(animalRegistry, name, birthDate, commands);
    }

    public String commandsOfAnimal(Animal animal) {
        return serviceImpl.commandsOfAnimal(null);
    }

    public void newCommands(Animal animal, String newCommand) {
        serviceImpl.newCommands(animal, newCommand);
    }

}
