package model;

public class IsoscelesTriangle extends Shape{

    public IsoscelesTriangle() {
    }

    @Override
    public double area() {
        double area;
        area = 0.5 * getVertical() * getHorizontal();
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter;
        perimeter = getHorizontal() + (2 * getDiagonal());
        return perimeter;
    }

    @Override
    public String toString() {
        return "Shape{name = '" + getName() + "'}";
    }
}
