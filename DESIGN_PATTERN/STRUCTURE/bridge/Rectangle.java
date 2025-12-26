package DESIGN_PATTERN.STRUCTURE.bridge;

public class Rectangle extends Forme {
    public Rectangle(Couleur couleur) {
        super(couleur);
    }
    public void colorier(){
        System.out.print("rectangle remplie avec : \t");
        couleur.remplirCouleur();
    }
}