package by.epamtc.zasemkovajulia.task0102.logic;

import by.epamtc.zasemkovajulia.task0102.entity.Date;

import java.util.Scanner;

public class DateInput {
    public static Date input(Scanner in) {
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

        return new Date(month, year);
    }
}
