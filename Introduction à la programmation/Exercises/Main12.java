import java.util.Scanner;

public class Main12 {
    public static void afficherPiramide(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(i));
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n===Veuyez indiquer le nombre de lignes que contiendra votre pyramide.===");
        System.out.print("Nombre de lignes : ");
        int n = scan.nextInt();
        afficherPiramide(n);
    }
}
