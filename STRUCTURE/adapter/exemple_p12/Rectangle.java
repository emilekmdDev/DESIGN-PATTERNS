package STRUCTURE.adapter.exemple_p12;

public class Rectangle {
    private float longueur;
    private float largeur;

    public float perimetreRectangle (){
        return  (longueur+largeur)*2;
    }

    public float aireRectangle(){
        return longueur*largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }
}
