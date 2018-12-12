package vittalk.com.company;

public class Door {
    private int height;
    private int width;
    private String typeOfMaterial;

    public Door(int height, int width, String typeOfMaterial) {
        this.height = height;
        this.width = width;
        this.typeOfMaterial = typeOfMaterial;
    }

    public void openDoor(){
        System.out.println("Door of "+ this.typeOfMaterial +" material "+ this.height +" feet height and " +this.width+" feet width is opened" );
    }

    public void closeDoor(){
        System.out.println("Door of "+ this.typeOfMaterial +" material "+ this.height +" feet height and " +this.width+" feet width is closed" );
    }
}
