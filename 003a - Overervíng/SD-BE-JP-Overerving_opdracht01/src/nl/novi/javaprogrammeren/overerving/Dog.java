package nl.novi.javaprogrammeren.overerving;

public class Dog extends DomesticAnimal {

    public Dog(String ownerName, String favoriteFoodBrand, Species species) {
        super(ownerName, favoriteFoodBrand, species);
    }

    @Override
    public void Move() {
        super.Move();
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void sleep() {
        System.out.println("Snoring sound");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating dogfood");
    }
}
