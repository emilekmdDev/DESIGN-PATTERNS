package DESIGN_PATTERN.CONSTRUCTION.builder;

public class Directeur {
    protected MonteurPizza monteurPizzaReine = new MonteurPizzaReine();
    protected MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();

    public Pizza construirePizzaReine(){
        monteurPizzaReine.creeNouvellePizza();
        monteurPizzaReine.monterPatte();
        monteurPizzaReine.monterSauce();
        monteurPizzaReine.monterGarniture();

        return monteurPizzaReine.getPizza();
    }

    public Pizza constriurePizzaPiquante(){
        monteurPizzaPiquante.creeNouvellePizza();
        monteurPizzaPiquante.monterPatte();
        monteurPizzaPiquante.monterSauce();
        monteurPizzaPiquante.monterGarniture();

        return monteurPizzaPiquante.getPizza();
    }
}
