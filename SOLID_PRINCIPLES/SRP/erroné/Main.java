package SOLID_PRINCIPLES.SRP.erroné;

public class Main {
    public static void main(String[] args) {
        Book b1 = new  Book("test title","nothing","john Doe");
        b1.printToScreen();
        b1.saveToDataBase();
        b1.emprunter("emile");
    }
}
