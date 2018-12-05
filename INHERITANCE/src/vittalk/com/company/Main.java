package vittalk.com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("name",20,10,1,1);

        Dog dog = new Dog("Daber",1,1,2,10,4,1,"long silky");
        dog.eat();//method or behaviour from Animal base class but inherited from Animal class to Dog class
        dog.walk();
        dog.run();

        StarFish starfish1 = new StarFish("starfish1",10,10,1,110,2,10,10);

        starfish1.move(10);
        starfish1.swimInFreshWater();
    }
}
