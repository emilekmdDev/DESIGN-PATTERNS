package DESIGN_PATTERN.STRUCTURE.adapter.exemple_p9;

public class DocumentHtml implements Document{
    @Override
    public int setContenu(String contenu) {
        System.out.println("Document HTML setContenu :"+contenu);
        return 0;
    }

    @Override
    public int dessine() {
        System.out.println("Document HTML dessine");
        return 0;
    }

    @Override
    public int imprime() {
        System.out.println("Document HTML imprime");
        return 0;
    }
}
