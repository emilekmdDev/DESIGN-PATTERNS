package SOLID_PRINCIPLES.LSP.corrigé;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(3);
        Shape rectangle = new Rectangle(3,3);
        System.out.println("Square Area : "+square.getArea());
        System.out.println("Rectangle Area: "+rectangle.getArea());
    }
}
