package OopsPartTwo;

public class Furniture {

    private String couch;
    private String table;
    private String tv;
    private String chair;
    private String bed;
    private String dresser;
    private String sideTables;
    private String lamps;

    public Furniture(String couch, String table, String tv, String chair, String bed, String dresser, String sideTables, String lamps){
        this.couch = couch;
        this.table = table;
        this.tv = tv;
        this.chair = chair;
        this.bed = bed;
        this.dresser = dresser;
        this.sideTables = sideTables;
        this.lamps = lamps;
    }
    public void bringNewFurniture(String furniture, String inRoom){
        System.out.println("New furniture bought " + furniture + " for room " + inRoom);
    }
    public String getCouch(){
        return couch;
    }
    public String getTable(){
        return table;
    }
    public String getTv(){
        return tv;
    }
    public String getChair(){
        return chair;
    }

    public String getBed() {
        return bed;
    }

    public String getDresser() {
        return dresser;
    }

    public String getSideTables() {
        return sideTables;
    }

    public String getLamps() {
        return lamps;
    }
}
