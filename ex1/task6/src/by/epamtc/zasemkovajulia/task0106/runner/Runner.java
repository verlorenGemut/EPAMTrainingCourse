package by.epamtc.zasemkovajulia.task0106.runner;

import by.epamtc.zasemkovajulia.task0106.entity.Time;
import by.epamtc.zasemkovajulia.task0106.logic.Input;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int timeInSeconds = Input.inputTime(in);

        Time time = new Time();
        time.setTime(timeInSeconds);
        
        System.out.println(time.getTime());
    }
}
