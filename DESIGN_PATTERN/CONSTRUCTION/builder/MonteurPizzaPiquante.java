package DESIGN_PATTERN.CONSTRUCTION.builder;

public class MonteurPizzaPiquante extends MonteurPizza{
    @Override
    public void monterPatte(){
        pizza.setPatte("feuilleté");
    }

    @Override
    public void monterSauce(){
        pizza.setSauce("piquante");
    };

    @Override
    public void monterGarniture(){
        pizza.setGarniture("pepperoni + salami");
    };
}
