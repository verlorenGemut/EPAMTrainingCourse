package by.epamtc.zasemkovajulia.task0109.entity;

import by.epamtc.zasemkovajulia.task0109.logic.GeometricCalculations;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "radius: " + radius +
                "\nlength: " + GeometricCalculations.lengthOfCircle(radius) +
                "\nsquare: " + GeometricCalculations.squareOfCircle(radius);
    }


}
