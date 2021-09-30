package by.epamtc.zasemkovajulia.task0110.logic;

import by.epamtc.zasemkovajulia.task0110.entity.Function;

public class TableSheet {

    public static void makeTable(double a, double b, double h) {
        System.out.println("x\ty");
        for(double i = a; i < b; i += h) {
            Function function = new Function(i);
            System.out.println(function.getFunction());
        }
    }
}
