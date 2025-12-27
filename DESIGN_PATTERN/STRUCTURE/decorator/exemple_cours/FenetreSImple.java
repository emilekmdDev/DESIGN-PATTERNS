package DESIGN_PATTERN.STRUCTURE.decorator.exemple_cours;

public class FenetreSImple implements Fenetre{

    @Override
    public String dessine() {
        return "je dessine une fenêtre ";
    }

    @Override
    public String decrire() {
        return "je décris une fenêtre ";
    }
}
