import java.util.Scanner;

public class Exo12_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] items = { "Crevette", "Salade", "Frite", "Hamburger", "Gâteau" };
        double[] prix = { 8.99, 5.60, 6.40, 10.99, 7.99 };
        boolean[] estCommandé = new boolean[items.length];
        for (int i = 0; i < estCommandé.length; i++) {
            estCommandé[i] = false;
        }
        double total = 0;

        while (true) {
            afficherMenu(calculTotal(estCommandé, prix));
            System.out.println();
            System.out.print("Entrez votre choix : ");
            int choix = sc.nextInt();

            switch (choix) {
                case 1:
                    ajouterItem(estCommandé, total, items, prix);
                    continue;
                case 2:
                    retirerItem(estCommandé, total, items, prix);
                    continue;
                case 3:
                    afficherReçu(estCommandé, prix, items);
                    continue;
                case 4:
                    afficherReçu(estCommandé, prix, items);
                    System.out.println("Merci pour votre visite!");
                    break;
                default:
                    System.out.println("Opération invalide");
                    continue;
            }
            break;
        }
        //sc.close();
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

    public static void ajouterItem(boolean[] estCommandé, double total, String[] items, double[] prix) {
        boolean estDisponible = false;
        for (int i = 0; i < estCommandé.length; i++) {
            if (estCommandé[i] == false) {
                estDisponible = true;
            }
        }

        if (estDisponible) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("Choisissez un item à ajouter : ");

            for (int i = 1; i <= estCommandé.length; i++) {
                if (!estCommandé[i - 1]) {
                    System.out.println(i + ". " + items[i - 1]);
                }
            }

            System.out.print("Votre choix : ");
            int choix = sc.nextInt();

            if (choix < 1 || choix > items.length || estCommandé[choix - 1]) {
                System.out.println("Erreur, choix invalide");
            } else {
                estCommandé[choix - 1] = true;
                System.out.println("Item ajouté : " + items[choix - 1]);
                System.out.printf("Total : %.2f$\n", calculTotal(estCommandé, prix));

            }
        } else {
            System.out.println("Plus d'items disponibles");
        }
    }

    public static void retirerItem(boolean[] estCommandé, double total, String[] items, double[] prix) {
        boolean disponible = true;
        for (int i = 0; i < estCommandé.length; i++) {
            if (estCommandé[i] == true) {
                disponible = false;
            }
        }

        if (!disponible) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choisicez un item à retirer : ");
    
            for (int i = 1; i <= estCommandé.length; i++) {
                if (estCommandé[i - 1]) {
                    System.out.println(i + ". " + items[i - 1]);
                }
            }
    
            System.out.print("Votre choix : ");
            int choix = sc.nextInt();
    
            if (choix < 1 || choix > items.length || !estCommandé[choix - 1]) {
                    System.out.println("Erreur, choix invalide");
                } else {
                    estCommandé[choix - 1] = false;
                    System.out.println("Item retirer : " + items[choix - 1]);
                    System.out.printf("Total : %.2f$\n", calculTotal(estCommandé, prix));
                }
        } else {
            System.out.println("Vous n'avez rien commandé pour l'instant");
        }
    }

    public static double calculTotal(boolean[] estCommandé, double[] prix) {
        double somme = 0;

        for (int i = 0; i < estCommandé.length; i++) {
            if (estCommandé[i]) {
                somme += prix[i];
            }
        }
        return somme;
    }

    public static void afficherReçu(boolean[] estCommandé, double[] prix, String[] items) {
        System.out.println("Votre reçu : ");

        for (int i = 0; i < estCommandé.length; i++) {
            if (estCommandé[i]) {
                System.out.printf("%-15s%10.2f$\n", items[i], prix[i]);
            }
        }

        System.out.println("---------------------------");
        System.out.printf("%-15s%10.2f$\n", "Total", calculTotal(estCommandé, prix));
    }
}
