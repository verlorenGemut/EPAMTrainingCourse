package by.epamtc.zasemkovajulia.task0102.logic;

import by.epamtc.zasemkovajulia.task0102.entity.ShortDate;

public class DateArithmetic {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isBigMonth(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return true;
        }
        return false;
    }

    public static int amountOfDays(ShortDate shortDate) {
        if (shortDate.getMonth() == 2) {
            if (isLeapYear(shortDate.getYear())) {
                return 29;
            }
            return 28;
        }
        if (isBigMonth(shortDate.getMonth())) {
            return 31;
        }
        return 30;
    }
}
