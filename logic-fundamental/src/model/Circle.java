package model;

public class Circle extends Shape{

    private final double PI = 3.14159;

    public Circle() {
    }

    @Override
    public double area() {
        double area;

        area = PI * (getRadius() * getRadius());
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter;
        perimeter = 2 * PI * getRadius();
        return perimeter;
    }

    @Override
    public String toString() {
        return "Shape{name = '" + getName() + "'}";
    }
}
