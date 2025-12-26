package DESIGN_PATTERN.STRUCTURE.bridge;

public class Client {
    static void main() {
        Couleur rouge = new Couleur.Rouge();
        Couleur bleu = new Couleur.Bleu();

        Rectangle rectangle = new Rectangle(rouge);
        Cercle cercle = new Cercle(bleu);

        rectangle.colorier();
        cercle.colorier();
    }
}
