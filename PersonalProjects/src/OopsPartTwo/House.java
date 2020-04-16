package OopsPartTwo;

public class House {
    public static void main(String[] args) {
        Room room = new Room("2 doors", "4 windows");
        Furniture furniture = new Furniture("recliner", "coffee table", "plasma", "rocking chair", "bed frame", "white colored dresser", "two side tables", "shaded lamps");
        LivingRoom livingRoom = new LivingRoom(room, furniture);
        BedRoom bedRoom = new BedRoom(room, furniture);
        String LIVINGROOM = room.livingRoom();
        String BEDROOM = room.bedRoom();

        livingRoom.enterRoom(false, "another couch", LIVINGROOM);
        System.out.println("number of doors = " + room.getDoors());
        bedRoom.bringBedRoomFurniture();
    }
}
