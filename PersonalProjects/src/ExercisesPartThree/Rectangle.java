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
