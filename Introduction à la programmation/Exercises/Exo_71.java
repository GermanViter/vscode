import java.util.Scanner;

public class Exo_71 {
    public static void afficherBienvenue(double total) {
        System.out.printf("""
                Menu :
                1. Ajouter un item
                2. Retirer un item
                3. Afficher le reçu
                4. Terminer la transaction
                Total de la facture actuelle : %.2f$
                """, total);
        System.out.println();
        System.out.print("Entrez votre choix : ");
    }

    public static void afficherMenu() {
        System.out.printf("""
                Choisissez un item à ajouter :
                1. Crevette           8.99$
                2. Salade             5.60$
                3. Frite              6.40$
                4. Hamburger         10.99$
                5. Gâteau             7.99$
                """);
    }

    public static void retirerItem() {
        System.out.printf("""
                Choisissez un item à retirer :
                1. Crevette           8.99$
                2. Salade             5.60$
                3. Frite              6.40$
                4. Hamburger         10.99$
                5. Gâteau             7.99$
                """);
    }

    public static void afficherReçu(int[] compteurPlats, double total, String[] plats, double[] prix) {
        System.out.println("\nReçu :\n");

        // === VÉRIFIER SI LE PLAT EST DANS LA COMMANDE ===
        for (int i = 0; i < compteurPlats.length; i++) {
            if (compteurPlats[i] > 0) {
                double sousTotal = prix[i] * compteurPlats[i]; //total pour chaque item selon la quantité
                System.out.printf("%-15s x%d %6.2f$\n", plats[i], compteurPlats[i], sousTotal);
            }
        }

        System.out.println("---------------------------");
        System.out.printf("%-15s %9.2f$\n\n", "Total", total);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] plats = { "Crevette", "Salade", "Frite", "Hamburger", "Gâteau" };
        double[] prix = { 8.99, 5.60, 6.40, 10.99, 7.99 }; //tableaux des prix de chaque item
        int[] compteurPlats = new int[plats.length]; //Compte le nombre de chaque item commandé
        double total = 0;

        // === BOUCLE PRINCIPALE ===
        while (true) {
            afficherBienvenue(total);
            int choix = scan.nextInt();

            switch (choix) {

                case 1:
                    // === AJOUTER UN PLAT ===
                    afficherMenu();
                    System.out.println();
                    System.out.print("Entrez le numéro de l'item : ");
                    int choixDuPlat = scan.nextInt();
                    total += prix[choixDuPlat - 1];
                    System.out.print("Plat ajouté : " + plats[choixDuPlat - 1]);
                    System.out.println();
                    System.out.printf("Total de la facture actuelle : %.2f$\n\n", total);
                    compteurPlats[choixDuPlat - 1]++;
                    break;

                case 2:
                    // === RETIRER UN PLAT ===
                    retirerItem();
                    System.out.println();
                    System.out.print("Entrez le numéro de l'item : ");
                    choixDuPlat = scan.nextInt();

                    // Vérifie que le numéro du plat est valide
                    if (compteurPlats[choixDuPlat - 1] > 0) { 
                        total -= prix[choixDuPlat - 1];
                        compteurPlats[choixDuPlat - 1]--;
                        System.out.print("Plat retiré : " + plats[choixDuPlat - 1]);
                        System.out.println();
                        System.out.printf("Total de la facture actuelle : %.2f$\n\n", total);
                    } else {
                        System.out.println("Vous ne pouvez pas supprimer un item que vous ne possedez pas.\n");
                    }
                    break;

                case 3:
                    // === AFFICHER LE REÇU ===
                    afficherReçu(compteurPlats, total, plats, prix);
                default:
                    break;
            }

            // === FINALISER LA TRANSACTION ===
            if (choix == 4) { 
                afficherReçu(compteurPlats, total, plats, prix);
                System.out.println("Merci pour votre visite!");
                break;
            }
        }
    }
}