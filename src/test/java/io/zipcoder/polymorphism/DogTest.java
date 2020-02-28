package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.pets.Pet;
import io.zipcoder.polymorphism.pets.Dog;
import io.zipcoder.polymorphism.pets.Shark;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    @Test
    public void testDog()
    {
        Pet testDog = new Dog("Roofus");
        String expectedNameBeforeChange = "Roofus";
        String expectedNameAfterChange = "Doofus";
        String expectedNoise = "Woooof Woof!";
        String expectedPet = "Dog";

        String actualNameBeforeChange = testDog.getName();
        testDog.setName("Doofus");
        String actualNameAfterChange = testDog.getName();
        String actualNoise = testDog.speak();
        String actualPet = testDog.getPet();

        assertTrue(testDog instanceof Pet);
        assertTrue(testDog instanceof Dog);
        assertEquals(expectedNameBeforeChange, actualNameBeforeChange);
        assertEquals(expectedNameAfterChange, actualNameAfterChange);
        assertEquals(expectedNoise, actualNoise);
        assertEquals(expectedPet, actualPet);
    }
}
