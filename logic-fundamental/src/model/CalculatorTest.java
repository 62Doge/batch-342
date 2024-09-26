package model;

public class CalculatorTest {
    public static void main(String[] args) {
        // Using parameter Constructor
        Calculator calculator = new Calculator(5, 5);

        System.out.println("Using parameter constructor");
        System.out.println("Number 1: " + calculator.getNumber1());
        System.out.println("Number 2: " + calculator.getNumber2());
        System.out.println("Sum : " + calculator.sum());
        System.out.println("Minus : " + calculator.minus());
        System.out.println("Divide : " + calculator.divide());
        System.out.println("Multiply : " + calculator.multiply());

        System.out.println();
        // Using empty Constructor
        Calculator calculator1 = new Calculator();
        calculator1.setNumber1(9);
        calculator1.setNumber2(5);

        System.out.println("Using empty constructor");
        System.out.println("Number 1: " + calculator1.getNumber1());
        System.out.println("Number 2: " + calculator1.getNumber2());
        System.out.println("Sum : " + calculator1.sum());
        System.out.println("Minus : " + calculator1.minus());
        System.out.println("Divide : " + calculator1.divide());
        System.out.println("Multiply : " + calculator1.multiply());
    }
}
