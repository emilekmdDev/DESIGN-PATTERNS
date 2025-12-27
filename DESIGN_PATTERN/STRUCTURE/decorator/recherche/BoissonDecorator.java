package DESIGN_PATTERN.STRUCTURE.decorator.recherche;

public abstract class BoissonDecorator implements Boisson{
    protected Boisson boisson;

    public BoissonDecorator(Boisson boisson){
        this.boisson=boisson;
    }
}
