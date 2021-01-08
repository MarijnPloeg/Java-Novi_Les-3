package nl.novi.javaprogrammeren.overerving;

public class Cat extends DomesticAnimal{
    private PreferredEnvironment preferredEnvironment;

    public Cat(String ownerName, String favoriteFoodBrand, Species species, PreferredEnvironment preferredEnvironment) {
        super(ownerName, favoriteFoodBrand, species);
        this.preferredEnvironment = preferredEnvironment;

        System.out.println("The owner of this animal is called " + ownerName + ", this is a " + species + ". This animal likes to be " + preferredEnvironment + " and likes to eat " + favoriteFoodBrand);
    }

    @Override
    public void Move() {
        super.Move();
    }

    @Override
    public void makeSound() {
        System.out.println("Miauw");
    }

    @Override
    public void sleep() {
        System.out.println("Purrr");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating catfood");
    }
}
