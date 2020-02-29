package io.zipcoder.polymorphism.pets;

import java.util.*;

public class Application {

    public static Scanner kb = new Scanner(System.in);
    public static List<Pet> pets;
    public static Integer numOfPets;

    public static void main(String[] args) {

        numOfPets = getNumberPets();
        pets = new ArrayList<Pet>(numOfPets);
        getPets();
        printPets();
    }

    public static Integer getNumberPets(){
        Integer retInt;
        while (true){
            try {
                System.out.println("How many pets do you have?");
                retInt = Integer.parseInt(kb.nextLine());
                break;
            }catch (Exception e){
                System.out.println("Please enter in a number with no decimal.");
            }
        }
        return retInt;
    }

    public static String getPetType(){
        String retType;
        while (true){
            System.out.println("What kind of pet do you have? (Please enter Dog, Cat, Shark)");
            retType = kb.nextLine();
            if(retType.equalsIgnoreCase("dog") || retType.equalsIgnoreCase("cat") ||
                    retType.equalsIgnoreCase("shark")){
                break;
            }
        }
        return retType;
    }

    public static void setPetName(String petType, String petName){
        if(petType.equalsIgnoreCase("dog")){
            pets.add(new Dog(petName));
        }else if(petType.equalsIgnoreCase("cat")){
            pets.add(new Cat(petName));
        }else if(petType.equalsIgnoreCase("shark")){
            pets.add(new Shark(petName));
        }
    }

    public static String getPetName(){
        System.out.println("What is it's name?");
        return kb.nextLine();
    }

    public static void printPets(){
        for (int i = 0; i < numOfPets; i++) {
            System.out.printf("Your %s named %s says %s", pets.get(i).getPet(), pets.get(i).getName(), pets.get(i).speak());
            System.out.println();
        }
    }

    public static void getPets(){
        for (int i = 0; i < numOfPets ; i++) {
            String petType = getPetType();
            String petName = getPetName();
            setPetName(petType, petName);
        }
    }

}
