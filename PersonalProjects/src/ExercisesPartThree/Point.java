package ExercisesPartThree;

public class Point {
    private int x;
    private int y;

    public Point(){
        this(0,0);
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double distance(){
        double distance = Math.sqrt(((getX())*(getX())) +((getY())* (getY())));
        return distance;
    }
    public double distance(int x, int y){
        double distance = Math.sqrt(((x - getX())*(x - getX())) +((y - getY())* (y - getY())));
        return distance;
    }
    public double distance(Point point){
        double distance = Math.sqrt((point.x - getX())*(point.x - getX())+(point.y - getY())*(point.y - getY()));
        return distance;
    }
}
