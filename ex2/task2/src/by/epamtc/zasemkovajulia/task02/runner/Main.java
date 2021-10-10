package by.epamtc.zasemkovajulia.task02.runner;

import by.epamtc.zasemkovajulia.task02.entity.Ball;
import by.epamtc.zasemkovajulia.task02.entity.Basket;
import by.epamtc.zasemkovajulia.task02.entity.Color;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();

        basket.addBall(new Ball(6.66, Color.BLACK));
        basket.addBall(new Ball(5.43, Color.GREEN));
        basket.addBall(new Ball(7.8, Color.BLUE));
        basket.addBall(new Ball(1.3, Color.BLUE));

        System.out.println("Basket weighs " + basket.getSummaryWeight() + " g");
        System.out.println("There are " + basket.countColorBalls(Color.BLUE) + " balls");

    }
}
