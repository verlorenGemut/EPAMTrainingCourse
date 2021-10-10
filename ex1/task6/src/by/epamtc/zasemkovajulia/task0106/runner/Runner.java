package by.epamtc.zasemkovajulia.task0106.runner;

import by.epamtc.zasemkovajulia.task0106.entity.Time;
import by.epamtc.zasemkovajulia.task0106.logic.Input;
public class Runner {

    public static void main(String[] args) {

        System.out.print("Enter time in seconds: ");
        int timeInSeconds = Input.inputTime();

        Time time = new Time();
        time.setTime(timeInSeconds);

        System.out.println(time);
    }
}
