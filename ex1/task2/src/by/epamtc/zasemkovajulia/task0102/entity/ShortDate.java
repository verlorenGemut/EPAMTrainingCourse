package by.epamtc.zasemkovajulia.task0102.entity;

public class ShortDate {
    private int month;
    private int year;

    public ShortDate(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return month + "." + year;
    }
}
