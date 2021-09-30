package by.epamtc.zasemkovajulia.task0109.entity;

import by.epamtc.zasemkovajulia.task0109.logic.GeometricCalculations;

public class Circle {
    private double radius;
    private double length;
    private double square;

    public Circle(double radius) {
        this.radius = radius;
        this.length = GeometricCalculations.lengthOfCircle(radius);
        this.square = GeometricCalculations.squareOfCircle(radius);
    }

    public String toString() {
        return "radius: " + radius + "\nlength: " + length + "\nsquare: " + square;
    }
}
