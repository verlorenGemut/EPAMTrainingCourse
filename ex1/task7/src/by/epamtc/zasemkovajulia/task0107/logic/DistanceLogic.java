package by.epamtc.zasemkovajulia.task0107.logic;

import by.epamtc.zasemkovajulia.task0107.entity.Point;

public class DistanceLogic {
    public static Point closerToOrigin(Point point1, Point point2) {
        if(point1.getRadiusVector() < point2.getRadiusVector()) {
            return point1;
        }
        return point2;
    }
}
