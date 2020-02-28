package io.zipcoder.polymorphism.pets;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    public void speak() {
        System.out.print("Meow~");
    }

    public String getPet() {
        return "Cat";
    }
}
