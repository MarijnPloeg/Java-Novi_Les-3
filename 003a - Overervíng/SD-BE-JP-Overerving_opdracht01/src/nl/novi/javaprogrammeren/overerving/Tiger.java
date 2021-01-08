package nl.novi.javaprogrammeren.overerving;

import java.util.Calendar;

public class Tiger extends WildAnimal{
    private int amountOfStripes;

    public Tiger(String cageName, String dateLastFed, String countryOfOrigin, int amountOfStripes) {
        super(cageName, dateLastFed, countryOfOrigin);
        this.amountOfStripes = amountOfStripes;
    }

    @Override
    public void makeSound() {
        System.out.println("This animal is very silent");
    }

    @Override
    public void sleep() {
        System.out.println("Purrrrr  Purrrrr");
    }

    @Override
    public void eat() {
        System.out.println("This animal is eating a gazelle");
    }
}
