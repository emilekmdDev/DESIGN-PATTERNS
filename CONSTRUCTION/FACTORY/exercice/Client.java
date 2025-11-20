package CONSTRUCTION.FACTORY.exercice;

public class Client {
    static void main() {
        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory2();
        ProduitFactory produitFactory3 = new ProduitFactory3();

        ProduitA produitA1;
        ProduitA produitA2;
        ProduitA produitA3;

        produitA1 = produitFactory1.getProduitA();
        produitA2 = produitFactory2.getProduitA();
        produitA3 = produitFactory3.getProduitA();

        produitA1.methodeA();
        produitA2.methodeA();
        produitA3.methodeA();
    }
}
