import java.util.Scanner;

public class GestionDesNotes {
    public static void main(String[] args) {
        double[] notes = new double[30];
        int compteur = 0;

    }

    public static void afficherMenu(int choix) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Gestionnaire de notes ===");
        System.out.println("[1] Ajouter une note");
        System.out.println("[2] Afficher le bulletin");
        System.out.println("[3] Calculer la moyenne");
        System.out.println("[4] Afficher la meilleure et la pire note");
        System.out.println("[5] Quitter");
        System.out.print("Votre choix : ");
        choix = scan.nextInt();
    }

    public static void ajouterNote(double[] notes, int compteur) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez une note : ");
        double note = scan.nextFloat();

        compteur++;
        notes[compteur] = note;
    }
    public static void afficherBulletin(double[] notes, int compteur) {
        System.out.println("Bulletin");
        
    }
}
