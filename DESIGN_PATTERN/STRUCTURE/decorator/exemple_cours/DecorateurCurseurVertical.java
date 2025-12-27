package DESIGN_PATTERN.STRUCTURE.decorator.exemple_cours;

public class DecorateurCurseurVertical extends DecorateurFenetre{
    public DecorateurCurseurVertical(Fenetre fenetre){
        super(fenetre);
    }
    @Override
    public String dessine() {
        return fenetre.dessine()+ " avec scrool vertical";
    }

    @Override
    public String decrire() {
        return fenetre.decrire()+ " avec scrool vertical";
    }
}
