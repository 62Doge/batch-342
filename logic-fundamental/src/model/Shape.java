package model;

import repository.IShape;

public abstract class Shape implements IShape {
    //Vertikal
    //Horizontal
    //Diagonal
    //Jari Jari
    private String name;
    private double vertical;
    private double horizontal;
    private double diagonal;
    //Jari-jari
    private double radius;

    public Shape() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVertical() {
        return vertical;
    }

    public void setVertical(double vertical) {
        this.vertical = vertical;
    }

    public double getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(double horizontal) {
        this.horizontal = horizontal;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
