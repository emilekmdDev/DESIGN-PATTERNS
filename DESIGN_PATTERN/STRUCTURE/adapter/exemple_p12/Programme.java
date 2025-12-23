package DESIGN_PATTERN.STRUCTURE.adapter.exemple_p12;

public class Programme {
    static void main() {
        Carre rectangle = new  AdaptRectangle();

        System.out.println(rectangle.perimetre());
        System.out.println(rectangle.aire());
    }
}
