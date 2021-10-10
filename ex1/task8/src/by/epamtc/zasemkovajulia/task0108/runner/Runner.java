package by.epamtc.zasemkovajulia.task0108.runner;

import static by.epamtc.zasemkovajulia.task0108.logic.FunctionCalculations.solveFunction;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x = ");
        double x = in.nextDouble();
        System.out.println("F(x) = " + solveFunction(x));
    }
}
