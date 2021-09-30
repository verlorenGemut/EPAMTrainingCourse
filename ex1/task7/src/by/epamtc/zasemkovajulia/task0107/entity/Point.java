package by.epamtc.zasemkovajulia.task0107.entity;

import by.epamtc.zasemkovajulia.task0107.logic.ArithmeticLogic;

public class Point {
    private double x;
    private double y;
    private double radiusVector;

    public Point() {
        x = 0;
        y = 0;
        radiusVector = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.radiusVector = ArithmeticLogic.getLengthOfWay(x, y);
    }

    public String getCoordinates() {
        return "(" + x + ";" + y + ")";
    }

    public double getRadiusVector() {
        return radiusVector;
    }
}
