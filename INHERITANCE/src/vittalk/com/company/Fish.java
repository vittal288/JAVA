package vittalk.com.company;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int weight, int size, int brain, int body, int gills, int eyes, int fins) {
        super(name, 10, size, 1, 1);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){
        System.out.println("Fish.moveMuscles() called");
    }

    private void moveBackFins(){
        System.out.println("Fish.moveBackFins() called");
    }
    private void swim(int speed){
        moveBackFins();
        moveMuscles();

       super.move(speed);
    }

    public void swimInFreshWater(){

    }
}
