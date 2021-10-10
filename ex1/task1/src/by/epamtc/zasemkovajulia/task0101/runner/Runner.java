package by.epamtc.zasemkovajulia.task0101.runner;

import java.util.Scanner;

import static by.epamtc.zasemkovajulia.task0101.util.ArithmeticLogic.*;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = in.nextInt();
        int square = squareOf(number);
        int lastDigit = lastDigitOf(square);

        System.out.println("Last digit of square of " + number + " is " + lastDigit);
    }
}
