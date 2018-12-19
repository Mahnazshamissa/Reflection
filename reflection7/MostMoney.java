package week7Exercises.reflection7;

import java.util.List;

public class MostMoney {
    public Integer maximum(List<Integer> payments) {
        Integer maxValue = payments.get(0);
        for (Integer number : payments) {
            if (number >= maxValue) {
                maxValue = number;
            }
        }
        return maxValue;

    }
}
