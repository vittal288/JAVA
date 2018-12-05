package vittalk.com.company;

public class Dog extends Animal {//inherit all properties from Animal class(base class) to Dog class

    //specific to dogs
    private int eyes;
    private int teeth;
    private int legs;
    private int tail;
    private String coat;

    public Dog(String name, int size, int brain, int eyes, int teeth, int legs, int tail, String coat){
        super(name,1,size,1,brain);// call the constructor of base class

        this.eyes = eyes;
        this.teeth = teeth;
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat(){
        System.out.println("Dog.eat called");
        chew();
        super.eat();
    }


    public void walk(){
        System.out.println("Dog.walk() is called");
        super.move(5);// invokes method from base Animal class
    }

    public void run(){
        System.out.println("Dog.run() is called");
        move(10);//invokes method from same class i.e Dog
    }

    public void moveLegs(){
        System.out.println("Dog.moveLegs called!");
    }

    @Override
    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs();
        super.move(speed);
    }
}
