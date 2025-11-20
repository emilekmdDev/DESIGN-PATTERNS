package CONSTRUCTION.FACTORY.methode2;

public abstract class ProduitFactory {
    protected abstract ProduitA createProduitA();

    public ProduitA getProduitA(){
        return createProduitA();
    }
}

class ProduitFactory1 extends ProduitFactory{
    @Override
    protected ProduitA createProduitA(){
        return new ProduitA1();
    }
}

class ProduitFactory2 extends  ProduitFactory{
    @Override
    protected ProduitA createProduitA(){
        return new ProduitA2();
    }
}