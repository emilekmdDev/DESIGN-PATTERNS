package DESIGN_PATTERN.STRUCTURE.decorator.recherche;

public class Sucre extends BoissonDecorator{
    public Sucre(Boisson boisson){
        super(boisson);
    }

    public String description(){
        return boisson.description()+" Sucre";
    }

    public int cout(){
        return boisson.cout()+50;
    }
}
