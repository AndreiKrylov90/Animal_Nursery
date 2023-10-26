package service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import model.Animal;
import model.AnimalRegistry;
import model.Camel;
import model.Cat;
import model.Dog;
import model.Donkey;
import model.Hamster;
import model.Horse;

public class ServiceImpl implements Service{

    @Override
    public Dog createDog(AnimalRegistry animalRegistry) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        DateTimeFormatter dateTFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Введите дату рождения в формате *yyyy-mm-dd* : ");
        String inputDate = scanner.nextLine();
        
        LocalDate birthDate = LocalDate.parse(inputDate, dateTFormatter);
        
        System.out.println("Введите выполняемые команды: ");
        String commands = scanner.nextLine();

        Dog dog = new Dog(name, birthDate, commands);
        animalRegistry.addAnimal(dog);
        return dog;
    }

    @Override
        public Dog createDog(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands) {
            Dog dog = new Dog(name, birthDate, commands);
            animalRegistry.addAnimal(dog);
            return dog;
        }

    @Override
        public Cat createCat(AnimalRegistry animalRegistry) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = scanner.nextLine();

            DateTimeFormatter dateTFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            System.out.println("Введите дату рождения в формате *yyyy-mm-dd* : ");
            String inputDate = scanner.nextLine();
            
            LocalDate birthDate = LocalDate.parse(inputDate, dateTFormatter);
            
            System.out.println("Введите выполняемые команды: ");
            String commands = scanner.nextLine();
            Cat cat = new Cat(name, birthDate, commands);
            animalRegistry.addAnimal(cat);
            return cat;
        }


    @Override
    public Cat createCat(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands) {
            Cat cat = new Cat(name, birthDate, commands);
            animalRegistry.addAnimal(cat);
            return cat;
    }

    @Override
    public Hamster createHamster(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands) {
            Hamster hamster = new Hamster(name, birthDate, commands);
            animalRegistry.addAnimal(hamster);
            return hamster;
    }

    @Override
    public Horse createHorse(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands) {
            Horse horse = new Horse(name, birthDate, commands);
            animalRegistry.addAnimal(horse);
            return horse;
    }

    @Override
    public Camel createCamel(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands) {
            Camel camel = new Camel(name, birthDate, commands);
            animalRegistry.addAnimal(camel);
            return camel;
    }

    @Override
    public Donkey createDonkey(AnimalRegistry animalRegistry, String name, LocalDate birthDate, String commands) {
            Donkey donkey = new Donkey(name, birthDate, commands);
            animalRegistry.addAnimal(donkey);
            return donkey;
    }

    @Override
    public String commandsOfAnimal(Animal animal) {
        return animal.getCommands();
    }

    @Override
    public void newCommands(Animal animal, String newCommand) {
        String newCommands = animal.getCommands() + newCommand;
        animal.setCommands(newCommands); 

    }

    @Override
    public void SortedAnimalRegistry(AnimalRegistry animalRegistry) {
        Comparator<Animal> birthDateComparator = Comparator.comparing(Animal::getBirthDate);
        Collections.sort(animalRegistry.getAnimals(), birthDateComparator);
        System.out.println("Список животных, отсортированный по дате рождения: ");
        for (Animal animal: animalRegistry.getAnimals()) {
            System.out.println(animal);
        }
    }

    @Override
    public void counterOfAnimals(AnimalRegistry animalRegistry) {
        System.out.println("В нашем питомнике находится " + animalRegistry.getPet_numbers() + " домашних животных и " + animalRegistry.getPack_numbers() + " вьючных животных");
    }

    
    @Override
    public Hamster createHamster(AnimalRegistry animalRegistry) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        DateTimeFormatter dateTFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Введите дату рождения в формате *yyyy-mm-dd* : ");
        String inputDate = scanner.nextLine();
        
        LocalDate birthDate = LocalDate.parse(inputDate, dateTFormatter);
        
        System.out.println("Введите выполняемые команды: ");
        String commands = scanner.nextLine();
        
        Hamster hamster = new Hamster(name, birthDate, commands);
        animalRegistry.addAnimal(hamster);
        return hamster;

    }

    @Override
    public Horse createHorse(AnimalRegistry animalRegistry) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        DateTimeFormatter dateTFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Введите дату рождения в формате *yyyy-mm-dd* : ");
        String inputDate = scanner.nextLine();
        
        LocalDate birthDate = LocalDate.parse(inputDate, dateTFormatter);
        
        System.out.println("Введите выполняемые команды: ");
        String commands = scanner.nextLine();

        Horse horse = new Horse(name, birthDate, commands);
        animalRegistry.addAnimal(horse);
        return horse;

    }

    @Override
    public Camel createCamel(AnimalRegistry animalRegistry) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        DateTimeFormatter dateTFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Введите дату рождения в формате *yyyy-mm-dd* : ");
        String inputDate = scanner.nextLine();
        
        LocalDate birthDate = LocalDate.parse(inputDate, dateTFormatter);
        
        System.out.println("Введите выполняемые команды: ");
        String commands = scanner.nextLine();

        Camel camel = new Camel(name, birthDate, commands);
        animalRegistry.addAnimal(camel);
        return camel;

    }

    @Override
    public Donkey createDonkey(AnimalRegistry animalRegistry) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        DateTimeFormatter dateTFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Введите дату рождения в формате *yyyy-mm-dd* : ");
        String inputDate = scanner.nextLine();
        
        LocalDate birthDate = LocalDate.parse(inputDate, dateTFormatter);
        
        System.out.println("Введите выполняемые команды: ");
        String commands = scanner.nextLine();

        Donkey donkey = new Donkey(name, birthDate, commands);
        animalRegistry.addAnimal(donkey);
        return donkey;

    }
    
}
