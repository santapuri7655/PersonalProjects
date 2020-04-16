package OopsPartTwo;
// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.
public class Room {

    private String doors;
    private String windows;

    public Room(String doors, String windows){
        this.doors = doors;
        this.windows = windows;
    }

    public void accessToPatio(boolean patio){
        if(patio){
            System.out.println("Access to patio");
        }
        else{
            System.out.println("No access to patio");
        }
    }
    public String livingRoom(){
        return "Living room";
    }
    public String bedRoom(){
        return "Bedroom";
    }
    public String getDoors(){
        return doors;
    }
    public String getWindows(){
        return windows;
    }
}
