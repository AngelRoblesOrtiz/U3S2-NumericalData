package com.codedifferently.lab.partA;

public class Chickens01 {
    //Put your code here
    public static void main(String args[]) {
        //3 chickens, 5 eggs per
        int chickenCount = 3;
        int eggsPerChicken = 5;
        int totalEggs = 0;

        chickenCount += 1;
        chickenCount = chickenCount / 2;
        totalEggs = chickenCount * eggsPerChicken;
        System.out.println("Total Eggs: " + totalEggs);

        //8 chickens, 4 eggs per
        int chickenCount2 = 8;
        int eggsPerChicken2 = 4;
        int totalEggs2 = 0;

        chickenCount2 += 1;
        chickenCount2 = chickenCount2 / 2;
        totalEggs2 = chickenCount2 * eggsPerChicken2;
        System.out.println("Total Eggs: " + totalEggs2);
    }
}
