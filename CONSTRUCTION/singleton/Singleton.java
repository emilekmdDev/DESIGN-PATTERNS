package CONSTRUCTION.singleton;

public final class Singleton {
    private static Singleton instance = null;

    private int x;
    private int y;
    private String nom;

    private Singleton(){
        super();
    }

    public Singleton(int x, int y){
        this.x=x;
        this.y=y;
    }

    public Singleton(int x, int y, String nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }

    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance(int x, int y){
        if (instance==null){
            instance = new Singleton(x, y);
        }
        return instance;
    }

    public static Singleton getInstance(int x, int y, String nom){
        if (instance==null){
            instance = new Singleton(x, y, nom);
        }
        return instance;
    }

    public int somme(int x, int y){
        return  x+y;
    }

    public int moyenne(int x, int y){
        return somme(x,y)/2;
    }

    public void afficher(){
        System.out.println("je suis une instance unique et mes valeurs sont:\n" +
                "x = "+this.x+"\n"+
                "y = "+this.y+"\n"+
                "nom = "+this.nom+"\n"
        );
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}