package by.epamtc.zasemkovajulia.task0105.logic;

public class ArithmeticLogic {

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return number == sum;
    }
}
