package week7Exercises.reflection7;

import week7Exercises.Line;
import week7Exercises.LineIterator;

import java.util.List;

public class TotalMoneyPaid {

    //Map<String, Integer> employees = new HashMap<>();
    FileReader reader = new FileReader();
    Splitor splitor = new Splitor();


    private static void readPayment(FileReader reader) {
        System.out.println("---- All Payments ----");
        List<String> lines = reader.asLines("/home/fatemeh/IdeaProjects/Week7/src/week7Exercises/reflection7/employees.csv");
        for (String line : lines) {
            //Splitor.

            System.out.println(line);
        }
    }

    Integer sum = 0;
    public Integer add(List<Integer> payments) {
        for (Integer payment : payments) {
            sum += payment;
        }
        return sum;

    }


}
