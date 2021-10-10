package by.epamtc.zasemkovajulia.task0106.logic;

import java.util.Scanner;

public class Input {

    public static int inputTime() {
        Scanner in = new Scanner(System.in);

        int time = -1;
        do {
            time = in.nextInt();
        } while (time < 0);

        return time;
    }
}
