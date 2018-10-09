package com.vittalkamkar;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // it has widtj of 64
        long minLongVal = -9_223_372_036_854_775_808L; //2^63
        long maxLongVal = 9_223_372_036_854_775_807L;

        // it has a width of 32
        int minVal = -2_147_483_648;//we can use underscore for numbers in java 7 , 2147483648;
        int maxVal = 2_147_483_647;

        // it has width of 16
        short shortMinVal = -32768;
        short shortMaxVal = 32767;

        // it has width of 8
        byte byteMinVal = -128;
        byte myNewByteVal = (byte) (byteMinVal /2);//type casting convert int type to byte
        byte byteMaxVal = 127;


        // assignment

        byte sByteVal = 100;
        short sShortVal = 30000;
        int sIntVal = -20000;

        long  lTotalVal = 50000L+ (10L * (sByteVal+sIntVal+sShortVal));

        //short  sVal1 = (short) 50+ (0 * (sByteVal+sIntVal+sShortVal));

        System.out.println("Total Long Value = " + lTotalVal);



    }
}
