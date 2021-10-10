package by.epamtc.zasemkovajulia.task0103.runner;

import by.epamtc.zasemkovajulia.task0103.logic.GeometricCalculations;
import by.epamtc.zasemkovajulia.task0103.logic.Input;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter area of the outer square: ");
        double outerSquareArea = Input.inputLength();

        double radius = GeometricCalculations.squareSide(outerSquareArea) / 2;
        double innerSquareArea = Math.pow(GeometricCalculations.cathetus(radius * 2), 2);
        System.out.println("Area of the inner square is " + outerSquareArea / innerSquareArea +
                " times less then the area on outer one");
    }
}
