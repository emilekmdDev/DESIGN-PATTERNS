package DESIGN_PATTERN.STRUCTURE.decorator.exemple_cours;

public class DecorateurCurseurHorizontale extends DecorateurFenetre{

    public DecorateurCurseurHorizontale(Fenetre fenetre){
        super(fenetre);
    }

    @Override
    public String decrire() {
        return fenetre.decrire()+ "avec scrool horizontale";
    }

    @Override
    public String dessine() {
        return fenetre.dessine()+" avec scrool horizontale";
    }
}
