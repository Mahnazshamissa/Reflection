package reflectionBew1.fruitshop.controller;

import reflectionBew1.fruitshop.model.Fruit;

import java.util.List;

public class FruitCounter {
    public static void countFruit(List<Fruit> fruits) {
        System.out.println("\n------- FRUITS -------\n");
        fruits.stream().forEach(e->display(e));
    }

    private String display(Fruit fruit) {
        return " \n" + fruit.getName() + ", " + fruit.getAmount() + " \n";
    }
}
