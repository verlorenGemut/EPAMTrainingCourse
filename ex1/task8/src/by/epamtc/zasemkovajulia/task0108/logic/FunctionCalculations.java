package by.epamtc.zasemkovajulia.task0108.logic;

public class FunctionCalculations {
    public static double f1(double x) {
        return -x * x + 3 * x + 9;
    }

    public static double f2(double x) {
        return 1.0 / (x * x * x - 6);
    }

    public static double solveFunction(double x) {
        if (x >= 3) {
            return FunctionCalculations.f1(x);
        } else {
            return FunctionCalculations.f2(x);
        }
    }
}
