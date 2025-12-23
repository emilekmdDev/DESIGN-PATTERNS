package SOLID_PRINCIPLES.SRP.corrigé;

public class Main {
        public static void main(String[] args) {
            BookSRP b1 = new  BookSRP("test title","nothing","john Doe");
        
            BookPrinter printer = new BookPrinter();
            printer.printToHTML(b1);
            printer.printToScreen(b1);
            
            BookSaver saver = new BookSaver();
            saver.saveToDatabase(b1);
            saver.saveToFile(b1, "livre1");
            
            BookBusinessLiogic businessLiogic = new BookBusinessLiogic();
            businessLiogic.emprunter(b1, "emile");
            businessLiogic.autreService(b1);
        }
}
