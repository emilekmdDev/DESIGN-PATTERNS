package CONSTRUCTION.FACTORY.methode2;

public class Client {
    static void main() {
        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory2();

        ProduitA p1 = produitFactory1.getProduitA();
        ProduitA p2 = produitFactory2.getProduitA();

        p1.methodeA();
        p2.methodeA();
    }
}
