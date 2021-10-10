package by.epamtc.zasemkovajulia.task0109.runner;

import by.epamtc.zasemkovajulia.task0109.entity.Circle;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = in.nextDouble();
        Circle circle = new Circle(radius);

        System.out.println(circle);
    }
}
