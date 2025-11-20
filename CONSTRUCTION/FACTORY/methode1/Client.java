public class Client {
    public static void main(String[] args) {
        ProduitA produitA = null;
        ProduitFactory produitFactory = new ProduitFactory();

        ProduitA p1 = produitFactory.getProduitA(ProduitFactory.typeProduitA1);
        ProduitA p2 = produitFactory.getProduitA(ProduitFactory.typeProduitA2);

        p1.methodeA();
        p2.methodeA();
    }
}
