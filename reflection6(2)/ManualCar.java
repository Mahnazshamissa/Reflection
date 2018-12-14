package week6Exercises.reflection6;

public class ManualCar extends Car {

    public ManualCar(String brand) {
        super(brand);
    }

    @Override
    public String drive() {
        return "I love this Manual " + getBrand();
    }
}
