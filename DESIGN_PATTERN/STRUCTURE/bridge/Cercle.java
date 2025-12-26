package DESIGN_PATTERN.STRUCTURE.bridge;

public class Cercle extends Forme {
    public Cercle(Couleur couleur){
        super(couleur);
    }
    public void colorier(){
        System.out.print("cercle remplie avec : \t");
        couleur.remplirCouleur();
    }
}
