package DESIGN_PATTERN.STRUCTURE.adapter.exemple_p9;

public class DocumentPdf extends ComposantPdf implements Document{

    @Override
    public int setContenu(String contenu) {
        pdfFixeContenu(contenu);
        return 0;
    }

    @Override
    public int dessine() {
        pdfPrepareAffichage();
        return 0;
    }

    @Override
    public int imprime() {
        pdfEnvoieImprimante();
        return 0;
    }
}
