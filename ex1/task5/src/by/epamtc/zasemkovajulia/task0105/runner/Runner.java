package by.epamtc.zasemkovajulia.task0105.runner;

import java.util.Scanner;

import static by.epamtc.zasemkovajulia.task0105.logic.ArithmeticLogic.isPerfectNumber;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = in.nextInt();
        System.out.println(isPerfectNumber(number));
    }
}
