package io.zipcoder.polymorphism.pets;

public class Shark extends Pet {

    public Shark(String name) {
        super(name);
    }

    public void speak() {
        System.out.print("Chomp!");
    }

    public String getPet() {
        return "Shark";
    }
}
