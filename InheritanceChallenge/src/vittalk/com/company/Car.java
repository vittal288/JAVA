package vittalk.com.company;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;


    private int currentGear;

    public Car(int noOfWheels, String engineType, String name, int wheels, int doors, int gears, boolean isManual) {
        super(noOfWheels, engineType, name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCuurentGear is changed to "+ this.currentGear+ "gear.");
    }

    public void changeVelocity(int speed, int direction){
        //super.move(speed, direction);
        // OR
        System.out.println("Car.changeVelocity(): Velocity"+ speed +" direction "+ direction);
        move(speed,direction);

    }

//    @Override
//    public void stopVehicle() {
//        super.stopVehicle();
//    }
}
