package STRUCTURE.composite;

public class Fichier extends Composant{

    public Fichier(String nom, Type type) {
        super(nom, type);
    }

    @Override
    public void decrire() {
        System.out.println("Fichier : " + getNom() + " (" + getType() + ")");
    }
}
