package model;

import java.time.LocalDate;

public class Animal {
    String name;
    String type;
    LocalDate birthDate;
    String commands;

    public Animal(String name, String type, LocalDate birthDate, String commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = commands;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public String getCommands() {
        return commands;
    }
    public void setCommands(String commands) {
        this.commands = commands;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "; " +
         "Вид: " + type + "; " +
         "Дата рождения: " + birthDate + "; " +
         "Выполняемые команды: " + commands 
        ;

    }
   
}
