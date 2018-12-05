public class BarkingDog {

    private static final String INVALID_VALLUE_MESSAGE = "Invalid Value";

    public  static  void main(String[] args){
//        System.out.println(bark(true,1));
//        System.out.println(bark(false,2));
//        System.out.println(bark(true,8));
//        System.out.println(bark(true,-1));

//        System.out.println(getDurationString(60,45));
//
//        System.out.println(getDurationString(340));

        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(5.0,-1));
    }


//    private static boolean bark(boolean barking, int hourOfTheDay){
//        if(hourOfTheDay >= 0 && hourOfTheDay<=23){
//            if((hourOfTheDay < 8 || hourOfTheDay>= 22) && barking){
//                return true;
//            }else{
//                return false;
//            }
//        }else{
//            return false;
//        }
//    }
//
//    private  static String getDurationString(long minutes, long seconds){
//        if((minutes <0)  || (seconds < 0) || (seconds > 59)){
//            return  INVALID_VALLUE_MESSAGE;
//        }
//
//        long hours = minutes /60;
//        long remainingMinutes = minutes %60;
//        return hours+"h "+remainingMinutes+"m "+seconds+"s ";
//    }
//
//    private  static  String getDurationString(long seconds){
//        if( seconds < 0){
//            return INVALID_VALLUE_MESSAGE;
//        }
//
//        long minutes = seconds / 60;
//        long reminingSeconds = seconds % 60;
//        return minutes +"m " + reminingSeconds +"s";
//    }


    //AREA Calculator
    private static final double PI = 3.142;

    private static double area(double r){
        if(r < 0){
            return -1;
        }
        return 2*PI*r;
    }

    private static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1;
        }
        return x*y;
    }
}
