package nl.novi.javaprogrammeren.overerving;

import java.util.Calendar;

public class Lion extends WildAnimal{
    private int amountOfChilderen;

    public Lion(String cageName, String dateLastFed, String countryOfOrigin, int amountOfChilderen) {
        super(cageName, dateLastFed, countryOfOrigin);
        this.amountOfChilderen = amountOfChilderen;
    }

    @Override
    public void makeSound() {
        System.out.println("Growl");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping, do not wake him!");
    }

    @Override
    public void eat() {
        System.out.println("The lion is eating a wildebeast");
    }
}
