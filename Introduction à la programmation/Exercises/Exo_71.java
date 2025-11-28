import java.util.Scanner;

public class Exo_71 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] items = { "Crevette", "Salade", "Frite", "Hamburger", "Gâteau" };
        double[] prix = { 8.99, 5.60, 6.40, 10.99, 7.99 };
        int[] compteursItems = new int[items.length];
        double[] compteursPrix = new double[items.length];
        double total = 0;

        while (true) {
            afficherMenu(total);
            System.out.print("\nEntrez votre choix : ");
            int choix = scan.nextInt();

            switch (choix) {
                case 1:
                    ajouterItem();

                    int choixAjout;
                    while (true) {
                        System.out.print("Entrez le numero de l'item : ");
                        choixAjout = scan.nextInt();
                        if (choixAjout >= 1 && choixAjout <= 5) {
                            break;
                        }
                        System.out.println("Item invalide");
                    }
                    compteursItems[choixAjout - 1]++;
                    System.out.println("Plat ajouté : " + items[choixAjout - 1]);

                    compteursPrix[choixAjout - 1] += prix[choixAjout - 1];

                    total += prix[choixAjout - 1];
                    System.out.printf("Total de la facture : %.2f$\n", total);
                    continue;
                case 2:
                    retirerItem();

                    int choixRetirer;
                    while (true) {
                        System.out.print("Entrez le numero de l'item : ");
                        choixRetirer = scan.nextInt();
                        if (!(choixRetirer >= 1 && choixRetirer <= 5) || compteursItems[choixRetirer - 1] <= 0) {
                            System.out.println("Item invalide");
                        } else {
                            break;
                        }
                    }

                    compteursItems[choixRetirer - 1]--;
                    total = total - prix[choixRetirer - 1];
                    compteursPrix[choixRetirer - 1] -= prix[choixRetirer - 1];
                    System.out.printf("Total de la facture : %.2f$\n", total);
                    continue;
                case 3:
                    afficherRecu(total, compteursItems, items, compteursPrix);
                    continue;
                case 4:
                    afficherRecu(total, compteursItems, items, compteursPrix);
                    System.out.println("Merci pour votre visite!");
                    break;
                default:
                    System.out.println("Opération invalide");
                    continue;
            }
            break;
        }
        scan.close();
    }

    public static void afficherMenu(double total) {
        System.out.println();
        System.out.println("Menu : ");
        System.out.println("1. Ajouter item");
        System.out.println("2. Retirer item");
        System.out.println("3. Afficher reçu");
        System.out.println("4. Terminer la transaction");
        System.out.printf("Total de la facture actuelle : %.2f$", total);
    }

    public static void ajouterItem() {
        System.out.println();
        System.out.println("Choisissez un item à ajouter : ");
        System.out.printf("1. Crevette %10.2f$\n", 8.99);
        System.out.printf("2. Salade %12.2f$\n", 5.60);
        System.out.printf("3. Frite %13.2f$\n", 6.40);
        System.out.printf("4. Hambuger %10.2f$\n", 10.99);
        System.out.printf("5. Gâteau %12.2f$\n", 7.99);
        System.out.println();

    }

    public static void retirerItem() {
        System.out.println();
        System.out.println("Choisissez un item à retirer : ");
        System.out.printf("1. Crevette %10.2f$\n", 8.99);
        System.out.printf("2. Salade %12.2f$\n", 5.60);
        System.out.printf("3. Frite %13.2f$\n", 6.40);
        System.out.printf("4. Hambuger %10.2f$\n", 10.99);
        System.out.printf("5. Gâteau %12.2f$\n", 7.99);
        System.out.println();

    }

    public static void afficherRecu(double total, int[] compteursItems, String[] items, double[] compteursPrix) {
        System.out.println();
        System.out.println("Votre reçu : ");

        for (int i = 0; i < items.length; i++) {
            if (compteursItems[i] > 0) {
                System.out.printf("%-15s %5d %10.2f$\n", items[i], compteursItems[i], compteursPrix[i]);
            }
        }
        System.out.println("---------------------------------");
        System.out.printf("%-10s %21.2f$\n", "Total", total);
    }
}