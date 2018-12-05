package vittalk.com.company;

import java.sql.SQLOutput;

public class Animal {
    private String name;
    private int weight;
    private int size;
    private int brain;
    private int body;

    public Animal(String name, int weight, int size, int brain, int body) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.brain = brain;
        this.body = body;
    }

    public void move(int speed){
        System.out.println("Animal.move() called. Animal is moving at " + speed);
    }

    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }
}
