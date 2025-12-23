package DESIGN_PATTERN.CONSTRUCTION.singleton;

public class Client {
    static void main() {

        Singleton singleton = Singleton.getSingleton(3,4, "emile");

        singleton.affiche();
        System.out.println("la somme est :" + Singleton.getSingleton().somme(5,5));
        System.out.println("la moyenne est :" + Singleton.getSingleton().moyenne(5,5));

    }
}
