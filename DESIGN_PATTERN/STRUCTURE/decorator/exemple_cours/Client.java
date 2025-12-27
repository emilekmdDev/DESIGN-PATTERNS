package DESIGN_PATTERN.STRUCTURE.decorator.exemple_cours;

public class Client {
    static void main() {
        Fenetre fenetreSimple = new FenetreSImple();
        Fenetre fenetre1 = new FenetreSImple();
        Fenetre fenetre2 = new FenetreSImple();
        Fenetre fenetre3 = new FenetreSImple();


        fenetre1 = new DecorateurCurseurHorizontale(fenetre1);
        fenetre2 = new DecorateurCurseurVertical(fenetre2);

        fenetre3 = new DecorateurCurseurHorizontale(fenetre3);
        fenetre3 = new DecorateurCurseurVertical(fenetre3);

        System.out.println(fenetreSimple.decrire()+"------"+fenetreSimple.dessine());
        System.out.println(fenetre1.decrire()+"------"+fenetre1.dessine());
        System.out.println(fenetre2.decrire()+"------"+fenetre2.dessine());
        System.out.println(fenetre3.decrire()+"------"+fenetre3.dessine());
    }
}
