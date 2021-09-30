package by.epamtc.zasemkovajulia.task0110.entity;

public class Function {
    private double x;
    private double y;

    public Function(double x) {
        this.x = x;
        this.y = Math.tan(x);
    }

    public String getFunction() {
        return x + "\t" + String.format("%.3f", y);
    }
}
