public abstract  class ProduitA {
    public abstract void methodeA();
}

class ProduitA1 extends ProduitA{
    @Override
    public void methodeA(){
        System.out.println("je suis le produit A1");
    }
}

class ProduitA2 extends ProduitA{
    @Override
    public void methodeA(){
        System.out.println("je sui le produit A2");
    }
}
