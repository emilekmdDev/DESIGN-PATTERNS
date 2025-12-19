package CONSTRUCTION.builder;

public class Client {
    static void main() {
        Directeur directeur = new Directeur();
        Pizza pizzaReine = directeur.construirePizzaReine();
        Pizza pizzaPiquante = directeur.constriurePizzaPiquante();

        System.out.println(pizzaReine.affiche());
        System.out.println(pizzaPiquante.affiche());
    }
}
