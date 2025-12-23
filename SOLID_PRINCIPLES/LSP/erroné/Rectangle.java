package SOLID_PRINCIPLES.LSP.erroné;

public class Rectangle {
    private double width;
    private double height;

    public void setHeight(double height){
        this.height = height;
    }
    
    public void setWidth(double width){
        this.width = width;
    }

    public double getArea(){return height*width;}
}
