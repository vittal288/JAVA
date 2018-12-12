package vittalk.com.company;


public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("220B","Dell","240", dimensions);

	    Monitor monitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));

	    MotherBoard motherBoard = new MotherBoard("BJ-200","Asus",4,6,"v2.24");

	    PC thePC = new PC(theCase,monitor,motherBoard);
	    // we are accessing all the all classes methods and properties using thePC object through COMPOSITION
        thePC.powerUp();
    }
}
