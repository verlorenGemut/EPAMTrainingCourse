package by.epamtc.zasemkovajulia.task0104.runner;

import by.epamtc.zasemkovajulia.task0104.entity.Numbers;
import by.epamtc.zasemkovajulia.task0104.logic.ArithmeticLogic;
import by.epamtc.zasemkovajulia.task0104.logic.Input;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Numbers numbers = Input.inputNumbers(in);
        System.out.println(ArithmeticLogic.checkStatement(numbers));
    }
}
