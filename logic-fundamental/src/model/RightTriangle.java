package model;

public class RightTriangle extends Shape{


    public RightTriangle() {
    }

    @Override
    public double area() {
        double area;
        area = 0.5 * getHorizontal() * getVertical();
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter;

        perimeter = getHorizontal() + getVertical() + getDiagonal();

        return perimeter;
    }

    @Override
    public String toString() {
        return "Shape{name = '" + getName() + "'}";
    }
}
