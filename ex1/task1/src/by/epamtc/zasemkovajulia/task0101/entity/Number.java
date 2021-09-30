package by.epamtc.zasemkovajulia.task0101.entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
    private int number;

    public Number(Scanner in) {
        System.out.print("Please, enter integer number: ");
        while(!in.hasNextInt()) {
            in.nextInt();
        }
        number = in.nextInt();
    }

    public int getNumber() {
        return number;
    }
}
