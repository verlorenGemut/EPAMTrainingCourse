package by.epamtc.zasemkovajulia.task0102.runner;

import by.epamtc.zasemkovajulia.task0102.entity.Date;
import by.epamtc.zasemkovajulia.task0102.logic.DateArithmetic;
import by.epamtc.zasemkovajulia.task0102.logic.DateInput;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Date date = DateInput.input(in);
        System.out.println("Your date is " + date.getDate());
        System.out.println("This month has " + DateArithmetic.getAmountOfDays(date) + " days");
    }
}
