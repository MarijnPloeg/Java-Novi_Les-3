package nl.novi.javaprogrammeren.overerving;

import java.util.Calendar;

public class Wolf extends WildAnimal{
    private String packName;

    public Wolf(String cageName, String dateLastFed, String countryOfOrigin, String packName) {
        super(cageName, dateLastFed, countryOfOrigin);
        this.packName = packName;
    }

    @Override
    public void makeSound() {
        System.out.println("Angry howl");
    }

    @Override
    public void sleep() {
        System.out.println("Angry snoring");
    }

    @Override
    public void eat() {
        System.out.println("The wolf is eating a rabbit");
    }
}
