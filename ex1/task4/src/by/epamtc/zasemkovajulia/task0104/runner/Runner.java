package by.epamtc.zasemkovajulia.task0104.runner;

import by.epamtc.zasemkovajulia.task0104.entity.Numbers;
import by.epamtc.zasemkovajulia.task0104.logic.Input;

import static by.epamtc.zasemkovajulia.task0104.logic.ArithmeticLogic.*;

public class Runner {

    public static void main(String[] args) {

        Numbers numbers = Input.inputNumbers();
        System.out.println(isStatementTrue(numbers));
    }
}
