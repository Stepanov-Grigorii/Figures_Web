package ru.figures.model;

public class RightTriangle extends Triangle {
    public RightTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public Double getPriority(){
        return 3.5;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "a=" + getA() +
                ", b=" + getB() +
                ", c=" + getC() +
                '}';
    }
}
