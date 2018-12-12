package vittalk.com.company;

public class Table {
    private int legs;
    private int width;
    private int height;


    public Table(int legs, int width, int height) {
        this.legs = legs;
        this.width = width;
        this.height = height;
    }

    public int getLegs() {
        return legs;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
