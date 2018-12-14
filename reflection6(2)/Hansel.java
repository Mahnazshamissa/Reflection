package week6Exercises.reflection6;

import java.util.Arrays;
import java.util.List;

public class Hansel {

    /*private static List<Car> brands= Arrays.asList(
            new Car( "BMW"), new Car("VW"),
            new Car( "Reno"), new Car("AUDI"),
            new Car( "Mercedess"), new Car("Matiz"),

            );*/

    private void haveATry(String Car){
       //Car car = new Car;
        //car.drive();
        Cars cars = new Cars();

        System.out.println("I love this "+ cars.getNextcar("BMW"));

    }
}

/*
The Hansel class has the haveATry method that receives a Car
and drives it to display the following message
 “I love this <car kind> <brand>”.

 */
