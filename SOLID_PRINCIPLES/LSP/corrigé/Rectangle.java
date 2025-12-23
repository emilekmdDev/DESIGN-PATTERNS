package SOLID_PRINCIPLES.LSP.corrigé;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }

    public double getArea(){return height*width;}
}
