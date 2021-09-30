package by.epamtc.zasemkovajulia.task0101.runner;

import by.epamtc.zasemkovajulia.task0101.entity.Number;
import by.epamtc.zasemkovajulia.task0101.util.ArithmeticLogic;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Number number = new Number(in);

        System.out.println("Last digit of square of " + number.getNumber() + " is "
                + ArithmeticLogic.getLastDigit(ArithmeticLogic.getSquare(number.getNumber())));
    }
}
