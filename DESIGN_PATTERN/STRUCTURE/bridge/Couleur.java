package DESIGN_PATTERN.STRUCTURE.bridge;

public interface Couleur {
    void remplirCouleur();
    class Rouge implements Couleur{
        public void remplirCouleur(){
            System.out.println("Couleur Rouge");
        }
    }

    class Bleu implements Couleur{
        public void remplirCouleur(){
            System.out.println("Couleur Bleu");
        }
    }
}
