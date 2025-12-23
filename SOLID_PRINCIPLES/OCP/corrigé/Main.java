package SOLID_PRINCIPLES.OCP.corrigé;

public class Main {
    public static void main(String[] args) {
        Circle sahpe1 = new Circle(5);
        Rectangle sahpe2 = new Rectangle(5,5);
        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println(areaCalculator.calculateArea(sahpe1));
        System.out.println(areaCalculator.calculateArea(sahpe2));
    }
}
