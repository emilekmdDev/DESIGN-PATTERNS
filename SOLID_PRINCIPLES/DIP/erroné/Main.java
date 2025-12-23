package SOLID_PRINCIPLES.DIP.erroné;

public class Main {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder("Données à sauvegarder");
    }
}