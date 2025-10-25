import java.util.Scanner;

public class Exo_55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez une année : ");
        int annee = scan.nextInt();

        if ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0) {
            System.out.println("Année bissextile");
        } else {
            System.out.println("Année non bissextile");
        }
    }
}