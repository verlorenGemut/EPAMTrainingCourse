package by.epamtc.zasemkovajulia.task0103.logic;

public class GeometricCalculations {
    public static double getSquareSide(double squareArea) {
        return Math.sqrt(squareArea);
    }

    public static double getCathetus(double hypotenuse) {
        return Math.sqrt(2) * hypotenuse / 2;
    }
}
