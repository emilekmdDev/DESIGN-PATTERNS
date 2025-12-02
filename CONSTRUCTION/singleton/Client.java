package CONSTRUCTION.singleton;

public class Client {
    static void main() {

        Singleton singleton = Singleton.getInstance(1,2,"emile");

        singleton.afficher();

        System.out.printf("la somme est %d \n",Singleton.getInstance().somme(1,2));
        System.out.printf("la moyenne est %d",Singleton.getInstance().moyenne(5,15));
    }
}
