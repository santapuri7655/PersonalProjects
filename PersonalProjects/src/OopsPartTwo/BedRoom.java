package OopsPartTwo;

public class BedRoom {

    private Furniture furniture;
    private Room room;

    public BedRoom(Room room, Furniture furniture){
        this.room = room;
        this.furniture = furniture;
    }

    public void bringBedRoomFurniture(){
        System.out.println(furniture.getBed());
        System.out.println(furniture.getDresser());
        System.out.println(furniture.getLamps());
    }

    public Furniture getFurniture() {
        System.out.println("Furniture for bedroom brought");
        return furniture;
    }
    public Room getRoom() {
        return room;
    }
}
