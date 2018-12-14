package week6Exercises.reflection6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cars {


   /*
    private static List<Car> model=Arrays.asList(new AutomaticCar());
    */

    public Car getNextcar(String brand) {
        Random random = new Random();
        Integer randomcar = random.nextInt(2);

        if (randomcar == 0) {
            AutomaticCar automaticCar = new AutomaticCar(brand);
            return automaticCar;
        } else {
            ManualCar manualCar = new ManualCar(brand);
            return manualCar;
        }

    }

}

/*
The Cars class has the getNextCar method that receives a brand
and creates a random automatic or manual car to return it as a Car.

 */