package by.epamtc.zasemkovajulia.task0108.entity;

import by.epamtc.zasemkovajulia.task0108.logic.Arithmetic;

public class Function {
    private double x;
    private double y;

    public Function(double x) {
        this.x = x;

        if (x >= 3) {
            this.y = Arithmetic.f1(x);
        } else {
            this.y = Arithmetic.f2(x);
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
