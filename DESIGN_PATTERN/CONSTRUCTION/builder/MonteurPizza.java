package DESIGN_PATTERN.CONSTRUCTION.builder;

public abstract class MonteurPizza {
    protected Pizza pizza;

    public Pizza getPizza(){ return pizza;}
    public void creeNouvellePizza(){pizza = new Pizza();}

    public void monterPatte(){};
    public void monterSauce(){};
    public void monterGarniture(){};
}
