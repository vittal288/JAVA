package com.vittalkamkar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a =10;
        int b=20;

        int result =0;

        result +=a;
        System.out.println(result);

        result *=b;
        System.out.println(result);

        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result /= a;
        System.out.println(result);

        result %=b+1;
        System.out.println(result);

        //booleans
        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not an Alien !!!");
        }else{
            System.out.println("Yes it is Alien !!!");
        }

        boolean car = true;
        String res = car ? "My Car":"Your Car";
        System.out.println("This car is "+ res);

        //assignment
        double dVal = 20d;
        double dVal1 = 80d;
        double dRes1 = (dVal1+dVal)*25;
        double remainder = dRes1 % 40;

        if(remainder > 10){
            System.out.println("Total was over the Limit 456");
        }else{
            System.out.println("Total was under the Limit 123");
        }

    }
}
