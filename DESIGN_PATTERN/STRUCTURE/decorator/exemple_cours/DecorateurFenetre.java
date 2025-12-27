package DESIGN_PATTERN.STRUCTURE.decorator.exemple_cours;

public abstract class DecorateurFenetre implements Fenetre{
    protected Fenetre fenetre;

    public DecorateurFenetre(Fenetre fenetre){
        this.fenetre=fenetre;
    }
}
