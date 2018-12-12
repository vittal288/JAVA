package vittalk.com.company;

public class TeleVision {
    private String model;
    private int size;

    public TeleVision(String model, int size){
        this.model= model;
        this.size = size;
    }

    public void playTV(){
        System.out.println("TV is playing !!!");
    }

    public void stopTV(){
        System.out.println("TV stopped !!!");
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }
}
