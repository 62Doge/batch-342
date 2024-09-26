package model;

public class Parallelogram extends Shape{

    public Parallelogram() {
    }

    @Override
    public double area() {
        double area;
        area = getHorizontal() * getVertical();
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter;
        perimeter = 2 * (getHorizontal() + getDiagonal());
        return perimeter;
    }

    @Override
    public String toString() {
        return "Shape{name = '" + getName() + "'}";
    }
}
