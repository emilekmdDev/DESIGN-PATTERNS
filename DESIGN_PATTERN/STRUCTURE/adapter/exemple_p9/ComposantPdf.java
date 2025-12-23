package DESIGN_PATTERN.STRUCTURE.adapter.exemple_p9;

public class ComposantPdf {
    public int pdfFixeContenu(String contenu){
        System.out.println("composantPdf pdfFixeContenu :"+contenu);
        return 1;
    }
    public int pdfPrepareAffichage(){
        System.out.println("composantPdf pdfPrepareAffichage");
        return 1;
    }
    public int pdfRafraichir(){
        return 1;
    }
    public int pdfTermineAffichage(){
        return 1;
    }
    public int pdfEnvoieImprimante(){
        System.out.println("composantPdf pdfEnvoieImprimante");
        return 1;
    }
}
