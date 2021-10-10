package by.epamtc.zasemkovajulia.task02.entity;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> ballsInBasket;

    public Basket() {
        ballsInBasket = new ArrayList<>();
    }

    public Basket(ArrayList<Ball> balls) {
        ballsInBasket = balls;
    }

    public void addBall(Ball ball) {
        ballsInBasket.add(ball);
    }

    public void removeBall(Ball ball) {
        if(ballsInBasket.contains(ball)) {
            ballsInBasket.remove(ball);
        } else {
            System.out.println("You are trying to take a ball, which does not exists. Think about it.");
        }
    }

    public int countColorBalls(Color color) {
        int counter = 0;
        for (Ball ball : ballsInBasket) {
            if (ball.getColor() == color) {
                counter++;
            }
        }
        return counter;
    }

    public double getSummaryWeight() {
        double summaryWeight = 0;
        for (Ball ball : ballsInBasket) {
            summaryWeight += ball.getWeight();
        }
        return summaryWeight;
    }
}
