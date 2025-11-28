import java.util.Scanner;

public class Exo12_6 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.print("Entrez une année : ");
        int anne = scan.nextInt();
        boolean estBissextile = estBissextile(anne);

        System.out.println(estBissextile ? "L'année est bissextile" : "L'année n'est pas bissextile");
        scan.close();
    }

    public static boolean estBissextile(int anne) {
        if ((anne / 4 == 0 && anne / 100 != 0) || anne / 400 == 0) {
            return true;
        }
        return false;
    }
}
