package week6Exercises.reflection6;

public class AutomaticCar extends Car {

    public AutomaticCar(String brand) {
        super(brand);
    }

    @Override
    public String drive() {
        return "I love this Automatic " + getBrand();
    }
}
