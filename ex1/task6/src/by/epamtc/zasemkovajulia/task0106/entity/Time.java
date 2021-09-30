package by.epamtc.zasemkovajulia.task0106.entity;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public void setTime(int timeInSeconds) {
        hours = timeInSeconds / 3600;
        minutes = (timeInSeconds - hours * 3600) / 60;
        seconds = timeInSeconds - hours * 3600 - minutes * 60;
    }

    public String getTime() {
        return hours + " h " + minutes + " min " + seconds + " sec\n";
    }
}
