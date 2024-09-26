package model;

public class Square extends Shape{

    public Square() {
    }

    @Override
    public double area() {
        double area;
        area = getVertical() * getVertical();
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter;
        perimeter = 4 * getVertical();
        return perimeter;
    }

    @Override
    public String toString() {
        return "Shape{name = '" + getName() + "'}";
    }

}
