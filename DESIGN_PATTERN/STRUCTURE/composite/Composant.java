package DESIGN_PATTERN.STRUCTURE.composite;

public abstract class Composant {
    private String nom;
    private Type type;

    public abstract void decrire();

    public void ajouter(Composant c){}

    public void supprimer(Composant c){}

    public Composant obtenir(int indice){
        return null;
    }

    public Composant(String nom, Type type) {
        this.nom = nom;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public Type getType() {
        return type;
    }
}
