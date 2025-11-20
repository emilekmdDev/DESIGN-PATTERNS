public class ProduitFactory {
    public static final int typeProduitA1 = 1;
    public static final int typeProduitA2 = 2;
    
    public ProduitA getProduitA(int typeProduit){
        ProduitA produitA = null;

        switch (typeProduit) {
            case typeProduitA1:
                produitA = new ProduitA1();
                break;
            case typeProduitA2:
                produitA = new ProduitA2();
                break;
            default:
                throw new AssertionError();
        }
        return produitA;
    }
}