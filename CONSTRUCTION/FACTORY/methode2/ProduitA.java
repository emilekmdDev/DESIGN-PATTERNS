package CONSTRUCTION.FACTORY.methode2;

public abstract class ProduitA {
    public abstract void methodeA();
}

class ProduitA1 extends ProduitA{
    @Override
    public void methodeA(){
        System.out.println("je suis un produit de type A1");
    }
}

class ProduitA2 extends ProduitA{
    @Override
    public void methodeA(){
        System.out.println("je suis un produit de type A2");
    }
}
