package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.pets.Dog;
import io.zipcoder.polymorphism.pets.Pet;
import io.zipcoder.polymorphism.pets.Shark;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharkTest {
    @Test
    public void testShark()
    {
        Shark testShark = new Shark("Jaws Four the Revenge");
        String expectedNameBeforeChange = "Jaws Four the Revenge";
        String expectedNameAfterChange = "Jaws Five Jaws Hard or Die Jawsing";
        String expectedNoise = "Chomp!";
        String expectedPet = "Shark";

        String actualNameBeforeChange = testShark.getName();
        testShark.setName("Jaws Five Jaws Hard or Die Jawsing");
        String actualNameAfterChange = testShark.getName();
        String actualNoise = testShark.speak();
        String actualPet = testShark.getPet();

        assertTrue(testShark instanceof Pet);
        assertTrue(testShark instanceof Shark);
        assertEquals(expectedNameBeforeChange, actualNameBeforeChange);
        assertEquals(expectedNameAfterChange, actualNameAfterChange);
        assertEquals(expectedNoise, actualNoise);
        assertEquals(expectedPet, actualPet);
    }
}
