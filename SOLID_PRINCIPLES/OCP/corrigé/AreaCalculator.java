package SOLID_PRINCIPLES.OCP.corrigé;

public class AreaCalculator {
    public static double calculateArea(Shape shape){
        return shape.calculateArea();
    }
}