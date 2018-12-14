package week6Exercises.reflection6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testAutomaticCarDrive() {
        AutomaticCar bmw = new AutomaticCar("BMW");
        String expected = "I love this Automatic BMW";
        Assertions.assertEquals(expected,bmw.drive());
    }

    @Test
    void testManualCarDrive() {
        ManualCar bmw = new ManualCar("BMW");
        String expected = "I love this Manual BMW";
        Assertions.assertEquals(expected,bmw.drive());
    }
}