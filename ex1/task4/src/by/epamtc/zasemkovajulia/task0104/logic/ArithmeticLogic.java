package by.epamtc.zasemkovajulia.task0104.logic;

import by.epamtc.zasemkovajulia.task0104.entity.Numbers;

public class ArithmeticLogic {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isStatementTrue(Numbers numbers) {
        int counterOfEven = 0;
        for(int i : numbers.getArrayList()) {
            if(isEven(i)) {
                counterOfEven++;
            }
        }
        return counterOfEven >= 2;
    }
}
