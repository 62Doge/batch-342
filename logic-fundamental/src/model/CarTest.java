package model;

public class CarTest {
    public static void main(String[] args) {
        Car volvo = new Car("Volvo", "XC90", "2000", "Manual", 250, "Black and Red Metallic", 0);
        System.out.println(volvo);
        volvo.drive(40);
        System.out.println(volvo);
    }
}
