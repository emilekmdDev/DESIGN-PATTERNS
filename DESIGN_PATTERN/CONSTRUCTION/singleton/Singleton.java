package DESIGN_PATTERN.CONSTRUCTION.singleton;

public final class Singleton {
    private static Singleton instance = null;

    private int x;
    private int y;
    private String nom;

    private Singleton(){
        super();
    }

    private Singleton(int x, int y){
        this.x=x;
        this.y=y;
    }

    private Singleton(int x, int y, String nom){
        this.x=x;
        this.y=y;
        this.nom=nom;
    }

    public static Singleton getSingleton(){
        if (instance!=null){
            return instance;
        }
        return new Singleton();
    }

    public static Singleton getSingleton(int x, int y){
        if (instance!=null){
            return instance;
        }
        return new Singleton(x,y);
    }

    public static Singleton getSingleton(int x, int y, String nom){
        if (instance!=null){
            return instance;
        }
        return new Singleton(x, y, nom);
    }

    public int somme(int x, int y){ return x+y;}
    public int moyenne(int x, int y){ return somme(x,y)/2;}
    public void affiche(){
        System.out.println("je suis une instance et mes valeurs sont x:" +x+ " y: " +y+ " nom:"+nom);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}