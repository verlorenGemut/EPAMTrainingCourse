package by.epamtc.zasemkovajulia.task0107.runner;

import by.epamtc.zasemkovajulia.task0107.entity.Point;
import by.epamtc.zasemkovajulia.task0107.logic.Input;

import static by.epamtc.zasemkovajulia.task0107.logic.DistanceLogic.closerToOrigin;

public class Runner {

    public static void main(String[] args) {

        Point p1 = Input.inputPoint();
        Point p2 = Input.inputPoint();

        System.out.println("Point" + closerToOrigin(p1, p2) + " is closer to the origin");
    }
}
