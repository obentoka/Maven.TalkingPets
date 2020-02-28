package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.pets.Cat;
import io.zipcoder.polymorphism.pets.Pet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CatTest {
    @Test
    public void testCat() {
        Pet testCat = new Cat("Whiskers");
        String expectedNameBeforeChange = "Whiskers";
        String expectedNameAfterChange = "Mr. Meows";
        String expectedNoise = "Meow~";
        String expectedPet = "Cat";

        String actualNameBeforeChange = testCat.getName();
        testCat.setName("Mr. Meows");
        String actualNameAfterChange = testCat.getName();
        String actualNoise = testCat.speak();
        String actualPet = testCat.getPet();

        assertTrue(testCat instanceof Pet);
        assertTrue(testCat instanceof Cat);
        assertEquals(expectedNameBeforeChange, actualNameBeforeChange);
        assertEquals(expectedNameAfterChange, actualNameAfterChange);
        assertEquals(expectedNoise, actualNoise);
        assertEquals(expectedPet, actualPet);
    }
}
