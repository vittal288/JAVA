package vittalk.com.company;

public class Vehicle {
    //private int noOfWheels;
    private String engineType;
    private String name;
    private int currentVelocity;
    private int currentDirection;


    public Vehicle(int noOfWheels, String engineType, String name) {
        this.engineType = engineType;
        this.name = name;

        this.currentVelocity = 0;
        this.currentDirection =0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicla.steer() called, Steerin at "+ this.currentDirection + "degrees");
    }

    public void move(int velocity, int direction){
        this.currentDirection = direction;
        this.currentVelocity = velocity;

        System.out.println("Vehicle.move() called. Moving at "+this.currentVelocity +" direction " + this.currentDirection);
    }


    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void stopVehicle(){
        this.currentVelocity =0;
    }
}
