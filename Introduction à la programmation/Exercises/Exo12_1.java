import java.util.Scanner;

public class Exo12_1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Saisissez votre prénom : ");
    String nom = scan.nextLine();

    System.out.printf("Bonjour, %s", nom);
    scan.close();
  }
}
