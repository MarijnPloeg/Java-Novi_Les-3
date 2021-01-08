package nl.novi.javaprogrammeren.overerving;
//parentclass
public abstract class DomesticAnimal extends AnimalMain{
    private String ownerName;
    private String favoriteFoodBrand;
    private Species species;

    public DomesticAnimal(String ownerName, String favoriteFoodBrand, Species species) {
        this.ownerName = ownerName;
        this.favoriteFoodBrand = favoriteFoodBrand;
        this.species = species;
    }

    @Override
    public void Move() {
        System.out.println("The animal has moved 0,25m");
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        super.eat();
    }
}
