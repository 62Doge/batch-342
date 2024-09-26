package model;

public class CalculatorTest {
    public static void main(String[] args) {
        // Using parameter Constructor
        Calculator calculator = new Calculator(5, 5);

        System.out.println("Using empty constructor");
        System.out.println("Number 1: " + calculator.getNumber1());
        System.out.println("Number 2: " + calculator.getNumber2());
        System.out.println(calculator.sum());
        System.out.println(calculator.minus());
        System.out.println(calculator.divide());
        System.out.println(calculator.multiply());

        System.out.println();
        // Using empty Constructor
        Calculator calculator1 = new Calculator();
        calculator1.setNumber1(9);
        calculator1.setNumber2(5);

        System.out.println("Using parameter constructor");
        System.out.println("Number 1: " + calculator1.getNumber1());
        System.out.println("Number 2: " + calculator1.getNumber2());
        System.out.println(calculator1.sum());
        System.out.println(calculator1.minus());
        System.out.println(calculator1.divide());
        System.out.println(calculator1.multiply());
    }
}
