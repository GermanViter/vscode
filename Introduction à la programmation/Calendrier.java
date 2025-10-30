import java.util.Scanner;

public class Calendrier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] mois = { "Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre",
                "Octobre", "Novembre", "Décembre" };
        //int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        System.out.print("choisissez un chiffre de 1 à 12 : ");
        int choix = scan.nextInt();

        if (choix > 12 || choix < 1) {
            System.out.println("nique ta mere");
            return;
        }

        System.out.printf("Votre mois est : %s\n", mois[choix - 1]);
    }
}
