package by.epamtc.zasemkovajulia.task0107.entity;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }

    public double getRadiusVector() {
        return Math.sqrt(x*x+y*y);
    }
}
