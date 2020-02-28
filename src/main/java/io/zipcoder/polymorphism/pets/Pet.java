package io.zipcoder.polymorphism.pets;

abstract class Pet {

    String name;

    public Pet(String  name){
        this.name = name;
    }

    abstract public String speak();

    abstract public String getPet();

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }
}
