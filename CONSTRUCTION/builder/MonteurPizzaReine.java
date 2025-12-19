package CONSTRUCTION.builder;

public class MonteurPizzaReine extends MonteurPizza{

    @Override
    public void monterPatte(){
        pizza.setPatte("croisé");
    }

    @Override
    public void monterSauce(){
        pizza.setSauce("douce");
    };

    @Override
    public void monterGarniture(){
        pizza.setGarniture("jambon et champignon");
    };

}
