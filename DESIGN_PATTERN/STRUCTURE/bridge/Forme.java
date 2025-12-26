package DESIGN_PATTERN.STRUCTURE.bridge;

public abstract class Forme {
    protected Couleur couleur;

    public Forme(Couleur couleur){
        this.couleur = couleur;
    }

    abstract public void colorier();
}
