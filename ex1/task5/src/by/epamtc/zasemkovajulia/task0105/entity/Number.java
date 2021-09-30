package by.epamtc.zasemkovajulia.task0105.entity;

import by.epamtc.zasemkovajulia.task0105.logic.ArithmeticLogic;

public class Number {
    private int number;
    private boolean isPerfectNumber;

    public Number() {
        number = 0;
        isPerfectNumber = false;
    }

    public Number(int number) {
        this.number = number;
        isPerfectNumber = ArithmeticLogic.isPerfectNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public boolean isPerfectNumber() {
        return isPerfectNumber;
    }
}
