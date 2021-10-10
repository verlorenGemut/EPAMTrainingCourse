package by.epamtc.zasemkovajulia.task02.entity;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> ballsInBasket;

    private static double summaryWeight = 0;

    public Basket() {
        ballsInBasket = new ArrayList<>();
    }

    public Basket(ArrayList<Ball> balls) {
        ballsInBasket = balls;
        for(Ball ball : balls) {
            summaryWeight += ball.getWeight();
        }
    }

    public void addBall(Ball ball) {
        ballsInBasket.add(ball);
        summaryWeight += ball.getWeight();
    }

    public void removeBall(Ball ball) {
        ballsInBasket.remove(ball);
        summaryWeight -= ball.getWeight();
    }

    public int countColorBalls(Color color) {
        int counter = 0;
        for(Ball ball : ballsInBasket) {
            if(ball.getColor() == color) {
                counter++;
            }
        }
        return counter;
    }

    public double getSummaryWeight() {
        return summaryWeight;
    }
}
