package by.epamtc.zasemkovajulia.task0110.runner;

import by.epamtc.zasemkovajulia.task0110.logic.TableSheet;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter min x value: ");
        double a = in.nextDouble();
        System.out.print("Enter max x value: ");
        double b = in.nextDouble();
        System.out.print("Enter step: ");
        double h = in.nextDouble();

        TableSheet.makeTable(a, b, h);
    }
}
