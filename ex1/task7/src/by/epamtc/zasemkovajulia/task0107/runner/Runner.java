package by.epamtc.zasemkovajulia.task0107.runner;

import by.epamtc.zasemkovajulia.task0107.entity.Point;
import by.epamtc.zasemkovajulia.task0107.logic.Input;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Point p1 = Input.inputPoint(in);
        Point p2 = Input.inputPoint(in);

        if (p1.getRadiusVector() > p2.getRadiusVector()) {
            System.out.println("Second point is closer to the origin");
        } else {
            System.out.println("First point is closer to the origin");
        }
    }
}
