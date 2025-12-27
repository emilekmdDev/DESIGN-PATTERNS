package DESIGN_PATTERN.STRUCTURE.decorator.recherche;

public class Cafe implements Boisson{

    @Override
    public String description() {
        return "café";
    }

    @Override
    public int cout() {
        return 500;
    }
}
