package SOLID_PRINCIPLES.OCP.corrigé;

public class Rectangle implements Shape{
    private double width;
    private double height;

    public Rectangle(double height, double width){
        this.height=height;
        this.width=width;
    }

    @Override
    public double calculateArea(){
        return width*height;
    }
}
