package by.epamtc.zasemkovajulia.task0102.entity;

public class Date {
    private int month;
    private int year;

    public Date() {
        month = 9;
        year = 1999;
    }

    public Date(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDate() {
        return month + "." + year;
    }
}
