package model;

public class Car {
    private String brand;
    private String name;
    private String releaseYear;
    private String transmission;
    private int topSpeed;
    private String color;
    private int mileAge;

    public Car() {
    }

    public Car(String brand, String name, String releaseYear, String transmission, int topSpeed, String color, int mileAge) {
        super();
        this.brand = brand;
        this.name = name;
        this.releaseYear = releaseYear;
        this.transmission = transmission;
        this.topSpeed = topSpeed;
        this.color = color;
        this.mileAge = mileAge;
    }

    public void drive(int topSpeed){
        this.topSpeed += topSpeed;
        this.mileAge += topSpeed;
        System.out.println("Your speed now " + topSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                ", transmission='" + transmission + '\'' +
                ", topSpeed=" + topSpeed +
                ", color='" + color + '\'' +
                ", mileAge=" + mileAge +
                '}';
    }
}
