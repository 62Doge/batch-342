package model;

public class Calculator {
    private int number1;
    private int number2;
    public Calculator() {
    }
    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }



    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int sum(){
        int result;
        result = this.number1 + this.number2;
        return result;
    }
    public int multiply(){
        int result;
        result = this.number1 * this.number2;
        return result;
    }
    public double divide(){
        double result;
        result = (double) this.number1 / this.number2;
        return result;
    }


    public int minus(){
        int result;
        result = this.number1 - this.number2;
        return result;
    }
}
