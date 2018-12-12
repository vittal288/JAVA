package vittalk.com.company;



public class Main {

    public static void main(String[] args) {
        Table mainTable = new Table(4,300,600);
        Table diningTable = new Table(6,800,400);
        Chair diningChair = new Chair(200,400,"wooden");
        Chair computerChair = new Chair(300,500,"Fiber");
        Sofa mainSofa = new Sofa("Wooden","NeelKamal","Foam");
        Door mainDoor = new Door(7,4,"Wooden");

        Furniture furniture = new Furniture(mainTable,mainSofa,diningChair,computerChair,diningTable);
        TeleVision teleVision = new TeleVision("FullHD", 53);

        Room mainHall = new Room(furniture,teleVision,mainDoor);
        mainHall.openRoomDoor();
        mainHall.closeRoomDoor();
    }
}
