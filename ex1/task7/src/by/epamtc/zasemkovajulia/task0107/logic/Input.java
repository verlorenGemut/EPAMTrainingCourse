package by.epamtc.zasemkovajulia.task0107.logic;

import by.epamtc.zasemkovajulia.task0107.entity.Point;

import java.util.Scanner;

public class Input {

    public static Point inputPoint(Scanner in) {
        System.out.println("Enter coordinates of point:");
        double x = in.nextDouble();
        double y = in.nextDouble();
        return new Point(x, y);
    }
}
