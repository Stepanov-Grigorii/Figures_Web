package ru.figures.model;

public class Circle extends AbstractClosedFigure {
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public Double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public Double getPriority() {
        return 1.0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
