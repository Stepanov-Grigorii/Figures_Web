package ru.figures.model;

public abstract class AbstractClosedFigure implements ClosedFigure {
    @Override
    public int compareTo(ClosedFigure figure){
        return this.getPriority().compareTo(figure.getPriority()) !=0 ? this.getPriority().compareTo(figure.getPriority()) :
                this.getArea().compareTo(figure.getArea());
    }
}
