package SOLID_PRINCIPLES.SRP.erroné;

public class Book {
    private String title;
    private String content;
    private  String author;

    public Book(String title, String content, String author){
        this.author=author;
        this.content=content;
        this.title=title;
    }

    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public String getContent(){return content;}

    public void printToScreen(){
        System.out.println("Titre: " + title);
        System.out.println("Auteur: " + author);
        System.out.println("Contenu: " + content);
    }

    public void saveToDataBase(){
        System.out.println("Sauvegarde du livre '" + title + "' en base de données...");
    }

    public void emprunter(String lecteur){
        System.out.println("Emprunt du livre '" + title + "' par " + lecteur);
    }
}
