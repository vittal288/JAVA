package vittalk.com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int val =1;
//        if(val ==1){
//            System.out.println("Value is 1");
//        } else if(val == 2){
//            System.out.println("value is 2");
//        }else{
//            System.out.println("default value");
//        }
//
//
//        //switch statement
//        int switchVal =0;
//        switch (switchVal){
//            case 1:
//                System.out.println("switch value is 1");
//                break;
//            case 2:
//                System.out.println("switch value is 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("switch value 3 or 4 or 5 ");
//             default:
//                 System.out.println("switch default value");
//                 break;
//        }
        printDayOfTheWeek(3);
        //for(initialize;condition;increment){//}
        for(int i =0;i<=10;i++){
            System.out.println(i);
        }

        //while loop
        /*
        * intialize;
        * while(condition){
        * //increment
        * }
        *
        * */

        int i=10;//increment
        while(i<100){//condition
            System.out.println(i);
            i++;//increment
        }
    }


    private static void printDayOfTheWeek(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Data !!!");
        }
    }
}
