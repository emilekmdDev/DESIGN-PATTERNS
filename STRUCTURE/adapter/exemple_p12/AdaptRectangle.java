package STRUCTURE.adapter.exemple_p12;

public class AdaptRectangle extends Rectangle implements Carre{

    @Override
    public float perimetre() {
        setLargeur(5);
        setLongueur(2);
        return perimetreRectangle();
    }

    @Override
    public float aire() {
        setLargeur(5);
        setLongueur(2);
        return aireRectangle();
    }
}
