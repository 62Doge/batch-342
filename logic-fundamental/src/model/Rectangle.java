package model;

public class Rectangle extends Shape{


    public Rectangle() {
    }

    @Override
    public double area() {
        double area;
        area = getVertical() * getHorizontal();
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter;
        perimeter = 2 * (getVertical() + getHorizontal());
        return perimeter;
    }

    @Override
    public String toString() {
        return "Shape{name = '" + getName() + "'}";
    }

}
