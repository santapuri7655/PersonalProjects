package ExercisesPartThree;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
        if(this.length<0){
            this.length = 0;
        }
        if(this.width<0){
            this.width = 0;
        }
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return getLength()*getWidth();
    }
}

class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
        if(this.height<0){
            this.height=0;
        }
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea()*getHeight();
    }
}

class CuboidTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
