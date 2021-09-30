package by.epamtc.zasemkovajulia.task0108.runner;

import by.epamtc.zasemkovajulia.task0108.entity.Function;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x = ");
        double x = in.nextDouble();
        Function function = new Function(x);
        System.out.println("F(x) = " + function.getY());
    }
}
