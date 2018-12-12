package vittalk.com.company;

public class Chair {
    private int size;
    private int height;
    private String type;

    public Chair(int size, int height, String type) {
        this.size = size;
        this.height = height;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }
}
