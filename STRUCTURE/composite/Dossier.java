package STRUCTURE.composite;

import java.util.ArrayList;
import java.util.List;

public class Dossier extends Composant{
    private List<Composant> elements = new ArrayList<>();

    public  Dossier(String nom){
        super(nom,Type.DOSSIER);
    }

    @Override
    public void decrire() {
        System.out.println("Dossier :"+getNom());
        for (Composant element:elements){
            System.out.print("\t");
            element.decrire();
        }
    }


    public void ajouter(Composant c){
        elements.add(c);
    }

    public void supprimer(Composant c){
        elements.remove(c);
    }

    @Override
    public Composant obtenir(int index) {
        return elements.get(index);
    }
}
