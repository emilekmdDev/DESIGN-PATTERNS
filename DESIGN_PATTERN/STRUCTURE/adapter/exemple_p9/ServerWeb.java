package DESIGN_PATTERN.STRUCTURE.adapter.exemple_p9;

public class ServerWeb {
    static void main() {
        Document documentHtml = new DocumentHtml();
        Document documentPdf = new DocumentPdf();

        documentHtml.setContenu("contenu pour document HTML");
        documentHtml.dessine();
        documentHtml.imprime();

        documentPdf.setContenu("contenu pour document PDF");
        documentPdf.dessine();
        documentPdf.imprime();
    }
}