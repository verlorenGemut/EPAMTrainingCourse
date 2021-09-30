package by.epamtc.zasemkovajulia.task0105.runner;

import by.epamtc.zasemkovajulia.task0105.entity.Number;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = in.nextInt();
        Number number = new Number(i);
        System.out.println(number.isPerfectNumber());
    }
}
