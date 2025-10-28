import java.util.Scanner;

public class GestionDesNotes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combiens d'étudiants ? ");
        int nbrDEleves = scan.nextInt();
        int somme = 0;
        System.out.println();

        int[] eleves = new int[nbrDEleves];
        System.out.println("Entrez les notes de vos élèves : ");
        for (int i = 0; i < eleves.length; i++) {
            eleves[i] = Integer.valueOf(scan.next());
            somme += eleves[i];
        }
        double moyenne = somme / (double) eleves.length;
        QuickSort.quickSort(eleves);
        System.out.print("Notes triés : ");
        QuickSort.afficherTableaux(eleves);
        System.out.printf("Moyenne : %.1f\n", moyenne);
        System.out.printf("Note la plus basse : %d\n", eleves[0]);
        System.out.printf("Note la plus haute : %d\n", eleves[eleves.length - 1]);

    }
}