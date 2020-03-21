package ru.figures.model;

public interface ClosedFigure extends Comparable<ClosedFigure>{
    Double getArea();
    Double getPerimeter();
    Double getPriority();
}
