package by.epamtc.zasemkovajulia.task0103.logic;

import java.util.Scanner;

public class Input {

    public static double inputLength() {
        Scanner in = new Scanner(System.in);

        double length;
        do {
            length = in.nextDouble();
        } while (length < 0.0);

        return length;
    }
}
