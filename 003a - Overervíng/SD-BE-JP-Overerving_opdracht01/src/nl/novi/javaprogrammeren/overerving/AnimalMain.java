package nl.novi.javaprogrammeren.overerving;
//super class
public abstract class AnimalMain {
    private String name;
    private Sex sex;

    public void Move(){
        System.out.println("The animal has moved 0,25m");
    }

    public void makeSound(){
        System.out.println("Hello");
    }

    public void sleep(){
        System.out.println("The animal is going to sleep");
    }

    public void eat(){
        System.out.println("The animal is eating ");
    }
}
