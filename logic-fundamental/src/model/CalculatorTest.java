package model;

public class CalculatorTest {
    public static void main(String[] args) {
        // Using parameter Constructor
        Calculator calculator = new Calculator(5, 5);

        System.out.println(calculator.sum());
        System.out.println(calculator.minus());
        System.out.println(calculator.divide());
        System.out.println(calculator.multiply());

        // Using empty Constructor
        Calculator calculator1 = new Calculator();
        calculator1.setNumber1(9);
        calculator1.setNumber2(5);

        System.out.println(calculator.sum());
        System.out.println(calculator.minus());
        System.out.println(calculator.divide());
        System.out.println(calculator.multiply());
    }
}
