package by.epamtc.zasemkovajulia.task0102.runner;

import by.epamtc.zasemkovajulia.task0102.entity.ShortDate;
import by.epamtc.zasemkovajulia.task0102.logic.DateInput;

import static by.epamtc.zasemkovajulia.task0102.logic.DateArithmetic.*;

public class Runner {

    public static void main(String[] args) {
        ShortDate shortDate = DateInput.input();
        System.out.println("Your date is " + shortDate);
        System.out.println("This month has " + amountOfDays(shortDate) + " days");
    }
}
