package SOLID_PRINCIPLES.OCP.erroné;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double height, double width){
        this.height=height;
        this.width=width;
    }

    public double getHeight(){return height;}
    public double getWidth(){return width;}
}
