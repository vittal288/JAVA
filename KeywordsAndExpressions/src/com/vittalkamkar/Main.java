package com.vittalkamkar;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 10;
        int b = 20;

        double a1 = 1000;
        double b1 = 2000;

        System.out.println(calcSum(a,b));
        System.out.println(calcSum(a1,b1));
    }

    public static double calcSum(double x,double y){
        double sum = x+y;
        System.out.println("Sum of two variable is"+ sum);
        return sum;
    }
}
