package DESIGN_PATTERN.STRUCTURE.decorator.recherche;

public class Lait extends BoissonDecorator{
    public Lait(Boisson boisson){
        super(boisson);
    }

    public String description(){
        return boisson.description()+" lait";
    }

    public int cout(){
        return  boisson.cout()+100;
    }
}
