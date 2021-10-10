package by.epamtc.zasemkovajulia.task0104.logic;

import by.epamtc.zasemkovajulia.task0104.entity.Numbers;

import java.util.Scanner;

public class Input {

    public static Numbers inputNumbers() {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = in.nextInt();
        System.out.print("Enter b = ");
        int b = in.nextInt();
        System.out.print("Enter c = ");
        int c = in.nextInt();
        System.out.print("Enter d = ");
        int d = in.nextInt();

        return new Numbers(a, b, c, d);
    }
}
