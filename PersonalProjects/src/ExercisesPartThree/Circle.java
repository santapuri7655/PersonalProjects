package ExercisesPartThree;

public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
        if(this.radius < 0){
            this.radius = 0;
        }
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }
}
