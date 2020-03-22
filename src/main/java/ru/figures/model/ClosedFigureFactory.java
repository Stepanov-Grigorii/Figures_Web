package ru.figures.model;

import java.util.*;

public class ClosedFigureFactory {
    private static Scanner scanner = new Scanner(System.in);

    public static Circle createCircle(int radius) throws FiguresException {
        if(radius <= 0){
            throw new RuntimeException("Radius mast be positive");
        }
        Circle circle = new Circle();
        circle.setRadius(radius);

        return circle;
    }

    public static Rectangle createRectangle(Double width, Double length) throws FiguresException {

        if(width.equals(length))
            return new Square(length);

        return new Rectangle(width, length);
    }

    public static Triangle createTriangle(Double a, Double b, Double c) throws FiguresException {
        List<Double> side = new ArrayList<>();
        side.add(a);
        side.add(b);
        side.add(c);

        if(side.get(0) == Math.sqrt(Math.pow(side.get(1), 2) + Math.pow(side.get(2), 2))) {
            return new RightTriangle(side.get(0), side.get(1), side.get(2));
        }
        return new Triangle(side.get(0), side.get(1), side.get(2));
    }

    public static Polygon createPolygon(int numberOfSides, int length) throws FiguresException {
        return new Polygon(numberOfSides, length);
    }

    public static double setLength() throws FiguresException {
        double length = scanner.nextDouble();
        if(length > 0){
            return length;
        }else{
            throw new FiguresException("Length must be positive.");
        }
    }

    public static int setNumberOfSides() throws FiguresException {
        int numberOfSides = scanner.nextInt();
        if(numberOfSides > 2){
            return numberOfSides;
        }else{
            throw new FiguresException("Number of sides must be more than 2.");
        }
    }

    public static List<Double> setSides() throws FiguresException {
        List<Double> side = new ArrayList<>();
        scanner.useLocale(Locale.US);
        side.add(setLength());
        side.add(setLength());
        side.add(setLength());
        Collections.sort(side, Collections.reverseOrder());

        if(side.get(0) >= side.get(1) + side.get(2)) {
            side.clear();
            throw new FiguresException("One side is larger than the sum of the other two.");
        }
        return side;
    }
}