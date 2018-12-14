package week6Exercises.reflection6;

public abstract class Car {

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract String drive();
}

//The Car class must be abstract.
// It has a brand that is given with the constructor.
// It has the drive method.