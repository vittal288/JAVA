package com.vittalkamkar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //width is 16 (2bytes)
        char myChar  = 'A';
        char myChar2 = '\u23CD';  // https://unicode-table.com/en/

        System.out.println("Unicode output was = "+ myChar2);


        boolean myBoolean = true;

        String myStr = "10";
        int myInt = 50;

        String conCatString = myInt+myStr;
        System.out.println("Concatinated string is = " + conCatString);

        // primitive data types
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        //String is Java class
    }
}
