package com.vittalkamkar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //width of int is 32 (4 bytes)
        int myIntVal = 5 / 3;
        //width of float is 32 (4bytes)
        float myFloatVal = 5f / 3f;
        //width of double is 64 (8bytes)
        double myDoubleVal = 5d / 3d;

        System.out.println("My Int Val = " + myIntVal);
        System.out.println("My Float Val = " + myFloatVal);
        System.out.println("My Double Val = " + myDoubleVal);


        // convert given number of pounds to kilograms 1pound = 0.45359237kg

        double givenPoundVal =  200;
        double convertedKGVal = givenPoundVal * 0.45359237d;

        System.out.println("Converted Pound To KG = " + convertedKGVal);
    }
}
