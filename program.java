import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import controller.Controller;
import model.Animal;
import model.AnimalRegistry;

public class program {
    public static void main(String[] args) {
        AnimalRegistry animalRegistry = new AnimalRegistry();
        initialData(animalRegistry);

        menu(animalRegistry);

    }

    public static void menu(AnimalRegistry animalRegistry) {
        Controller controller = new Controller();
        String[] commands = {
                "Добавить новое животное",
                "Вывести список команд конкретного животного",
                "Добавить команды конкретному животному",
                "Вывести список животных, отсортированный по дате рождения",
                "Узнать, сколько животных каждого вида есть в питомнике",
                "Выход из программы"

        };

        System.out.println("Укажите номер команды");
        for (int i = 0; i < commands.length; i++) {
            System.out.println((i + 1) + ". " + commands[i]);
        }

        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        try {
            choice = scanner.nextInt();
            if (choice < 1 || choice > commands.length) {
                throw new Exception("Такой команды пока нет");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            menu(animalRegistry);
            return;
        }

        switch (choice) {
            case 1:
                int firstChoice = 0;
                int secondChoice = 0;
                System.out.println("Усли вы хотите добавить домашнее животное - нажмите 1, если вьючное - нажмите 2: ");
                firstChoice = scanner.nextInt();
                if (firstChoice == 1) {
                    System.out.println(
                            "Усли вы хотите добавить собаку - нажмите 1, если кошку - нажмите 2, если хомячка - нажмите 3: ");
                    secondChoice = scanner.nextInt();
                    if (secondChoice == 1) {
                        controller.createDog(animalRegistry);
                    }
                    if (secondChoice == 2) {
                        controller.createCat(animalRegistry);
                    }
                    if (secondChoice == 3) {
                        controller.createHamster(animalRegistry);
                    } 
                }
                if (firstChoice == 2) {
                    System.out.println(
                            "Усли вы хотите добавить лошадь - нажмите 1, если верблюда - нажмите 2, если ослика - нажмите 3: ");
                    secondChoice = scanner.nextInt();
                    if (secondChoice == 1) {
                        controller.createHorse(animalRegistry);
                    }
                    if (secondChoice == 2) {
                        controller.createCamel(animalRegistry);
                    }
                    if (secondChoice == 3) {
                        controller.createDonkey(animalRegistry);
                    } 
                } 
                System.out.println("Вы внесли изменения в реестр: ");
                System.out.println(animalRegistry);
                break;
            case 2:
                System.out.println(animalRegistry);
                System.out.println("Введите номер животного, команды которого вас интересуют: ");
                int commandsChoice = scanner.nextInt();
                String result = controller.commandsOfAnimal(animalRegistry.getAnimals().get(commandsChoice-1));
                System.out.println("Выполняемые команды: " + result);
                break;
            case 3:
                System.out.println(animalRegistry);
                System.out.println("Введите номер животного, команды которого будем менять: ");
                int newCommandsChoice = scanner.nextInt();

                System.out.println("Введите команду, которую хотите добавить: ");
                String newCommand = scanner.nextLine();
                controller.newCommands(animalRegistry.getAnimals().get(newCommandsChoice-1), newCommand);
                
                String changedResult = controller.commandsOfAnimal(animalRegistry.getAnimals().get(newCommandsChoice-1));
                System.out.println("Новые выполняемые команды: " + changedResult);
                break;
            case 4:
                controller.SortedAnimalRegistry(animalRegistry);
                break;
            case 5:
                controller.counterOfAnimals(animalRegistry);
                break;
            case 6:
                System.out.println("Пока-пока, приходите еще");
                System.exit(0);
                break;

        }
        System.out.println(); 
        menu(animalRegistry);

    }

    public static void initialData(AnimalRegistry animalRegistry) {
        Controller controller = new Controller();
        controller.createDog(animalRegistry, "Fido", LocalDate.of(2020, 01, 01), "Sit, Stay, Fetch");
        controller.createCat(animalRegistry, "Whiskers", LocalDate.of(2019, 05, 15), "Sit, Pounce");
        controller.createHamster(animalRegistry, "Hammy", LocalDate.of(2021, 03, 10), "Roll, Hide");
        controller.createDog(animalRegistry, "Buddy", LocalDate.of(2018, 12, 10), "Sit, Paw, Bark");
        controller.createCat(animalRegistry, "Smudge", LocalDate.of(2020, 02, 20), "Sit, Pounce, Scratch");
        controller.createHamster(animalRegistry, "Peanut", LocalDate.of(2021, 8, 01), "Roll, Spin");
        controller.createDog(animalRegistry, "Bella", LocalDate.of(2019, 11, 11), "Sit, Stay, Roll");
        controller.createCat(animalRegistry, "Oliver", LocalDate.of(2020, 06, 30), "Meow, Scratch, Jump");

        controller.createHorse(animalRegistry, "Thunder", LocalDate.of(2015, 07, 21), "Trot, Canter, Gallop");
        controller.createCamel(animalRegistry, "Sandy", LocalDate.of(2016, 11, 03), "Walk, Carry Load");
        controller.createDonkey(animalRegistry, "Eeyore", LocalDate.of(2017, 9, 18), "Walk, Carry Load, Bray");
        controller.createHorse(animalRegistry, "Storm", LocalDate.of(2014, 05, 05), "Trot, Canter");
        controller.createCamel(animalRegistry, "Dune", LocalDate.of(2018, 12, 12), "Walk, Sit");
        controller.createDonkey(animalRegistry, "Burro", LocalDate.of(2019, 01, 23), "Walk, Bray, Kick");
        controller.createHorse(animalRegistry, "Blaze", LocalDate.of(2016, 02, 29), "Trot, Jump, Gallop");
        controller.createCamel(animalRegistry, "Sahara", LocalDate.of(2015, 8, 14), "Walk, Run");
        

    }

}