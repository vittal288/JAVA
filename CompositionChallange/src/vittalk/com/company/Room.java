package vittalk.com.company;

public class Room {

    private Furniture furniture;
    private TeleVision teleVision;
    private Door door;

    public Room(Furniture furniture, TeleVision teleVision, Door door) {
        this.furniture = furniture;
        this.teleVision = teleVision;
        this.door = door;
    }

    public void openRoomDoor(){
        this.door.openDoor();
    }

    public void  closeRoomDoor(){
        this.door.closeDoor();
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public TeleVision getTeleVision() {
        return teleVision;
    }

    public Door getDoor() {
        return door;
    }
}
