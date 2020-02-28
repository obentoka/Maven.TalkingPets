package io.zipcoder.polymorphism.pets;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    public void speak() {
        System.out.print("Woooof Woof!");
    }

    public String getPet() {
        return "Dog";
    }
}
