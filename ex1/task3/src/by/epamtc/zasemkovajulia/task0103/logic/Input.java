package by.epamtc.zasemkovajulia.task0103.logic;

import java.util.Scanner;

public class Input {

    public static double inputLength(Scanner in) {
        double length = -1.0;
        do {
            length = in.nextDouble();
        } while (length < 0.0);

        return length;
    }
}
