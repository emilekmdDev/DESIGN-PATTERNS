package DESIGN_PATTERN.STRUCTURE.composite;

public class Client {
    public static void main(String[] args) {

        // ===== Création des fichiers =====
        Composant fichier1 = new Fichier("cours INF 4067", Type.PDF);
        Composant fichier2 = new Fichier("notes INF 4067", Type.TXT);
        Composant fichier3 = new Fichier("rapport INF 4067", Type.TXT);

        // ===== Création des dossiers =====
        Dossier dossier1 = new Dossier("Documents");
        Dossier dossier2 = new Dossier("Rapports");

        // ===== AJOUT =====
        dossier2.ajouter(fichier3);
        dossier1.ajouter(dossier2);
        dossier1.ajouter(fichier1);
        dossier1.ajouter(fichier2);

        System.out.println("=== DESIGN_PATTERN.STRUCTURE INITIALE ===");
        dossier1.decrire();

        // ===== OBTENIR =====
        System.out.println("\n=== OBTENIR UN ÉLÉMENT ===");
        Composant element = dossier1.obtenir(1);
        element.decrire();

        // ===== SUPPRIMER =====
        System.out.println("\n=== SUPPRESSION D’UN FICHIER ===");
        dossier1.supprimer(fichier2);
        dossier1.decrire();
    }
}


