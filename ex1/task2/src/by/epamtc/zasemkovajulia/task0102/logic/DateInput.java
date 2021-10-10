package by.epamtc.zasemkovajulia.task0102.logic;

import by.epamtc.zasemkovajulia.task0102.entity.ShortDate;

import java.util.Scanner;

public class DateInput {
    public static ShortDate input() {
        Scanner in = new Scanner(System.in);

        int month = 0;
        int year = 0;

        do {
            System.out.print("Enter month: ");
            month = in.nextInt();
        } while (month > 12 || month < 1);

        do {
            System.out.print("Enter year: ");
            year = in.nextInt();
        } while (year < 1);

        return new ShortDate(month, year);
    }
}
