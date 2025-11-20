package CONSTRUCTION.FACTORY.exercice;

public abstract class ProduitFactory {
    protected abstract ProduitA createProduit();
    public ProduitA getProduitA(){
        return createProduit();
    }
}

class ProduitFactory1 extends ProduitFactory{
    @Override
    protected ProduitA createProduit(){
        return new ProduitA1();
    }
}

class ProduitFactory2 extends ProduitFactory{
    @Override
    protected ProduitA createProduit(){
        return  new ProduitA2();
    }
}

class ProduitFactory3 extends ProduitFactory{
    @Override
    protected ProduitA createProduit(){
        return new ProduitA3();
    }
}