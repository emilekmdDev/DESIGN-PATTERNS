package SOLID_PRINCIPLES.SRP.corrigé;

public class BookSRP {
    private String title;
    private String content;
    private  String author;

    public BookSRP(String title, String content, String author){
        this.author=author;
        this.content=content;
        this.title=title;
    }

    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public String getContent(){return content;}
}