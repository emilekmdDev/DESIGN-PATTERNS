package SOLID_PRINCIPLES.OCP.erroné;

public class Main {
    public static void main(String[] args) {
        Circle shape1 = new Circle(5);
        Rectangle shape2 = new Rectangle(5,5);
        AreaCalculator areaCalculator = new  AreaCalculator();
        
        System.out.println(areaCalculator.calculateArea(shape1));
        System.out.println(areaCalculator.calculateArea(shape2));
    }
}