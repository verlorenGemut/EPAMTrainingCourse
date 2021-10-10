package by.epamtc.zasemkovajulia.task0110.entity;

public class Function {
    private double x;

    public Function(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return String.format("%.2f", x) + "\t" + String.format("%.2f", y(x));
    }

    private double y(double x) {
        return Math.tan(x);
    }
}
