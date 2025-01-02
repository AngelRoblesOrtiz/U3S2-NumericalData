package com.codedifferently.lab.partA;

public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
        int totalEggs = 100 + 121 + 117;
        int dailyAverage = totalEggs / 3;
        System.out.println("Daily Average:   " + dailyAverage);

        int monthlyAverage = dailyAverage * 30;
        System.out.println("Monthly Average: " + monthlyAverage);

        double monthlyProfit = monthlyAverage * 0.18;
        System.out.println("Monthly Profit:  $" + monthlyProfit);
    }
}
