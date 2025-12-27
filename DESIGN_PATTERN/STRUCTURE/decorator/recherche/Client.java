package DESIGN_PATTERN.STRUCTURE.decorator.recherche;

public class Client {
    static void main() {
        Boisson boisson = new  Cafe();
        boisson = new Lait(boisson);
        boisson = new Sucre(boisson);

        System.out.println(boisson.description());
        System.out.println("Prix "+boisson.cout()+" CFA");
    }
}
