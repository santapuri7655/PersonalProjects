package OopsPartTwo;

public class LivingRoom {
    private Room room;
    private Furniture furniture;

    public LivingRoom(Room room, Furniture furniture){
        this.room = room;
        this.furniture = furniture;
    }

    public void enterRoom(boolean patio, String furnitureName, String inRoom){
        room.accessToPatio(patio);
        furniture.bringNewFurniture(furnitureName,inRoom);
    }
    public void setRoom(Room room){
        this.room = room;
    }
    public Room getRoom(){
        return room;
    }
}

