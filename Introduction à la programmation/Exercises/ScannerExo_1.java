import java.util.Scanner;

public class ScannerExo_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String motADeviner = "java";

        System.out.print("Entrez votre mot : ");        
        String mot = scanner.nextLine();

        if (mot.equals(motADeviner)) {
            System.out.println("Accès autorisé");
        } else {
            System.out.println("Mot incorrect");
        }
    }
}