import java.util.Scanner;

public class Banque {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CompteBancaire german = new CompteBancaire(10000.00);

    while (true) {
      System.out.printf("Que voulez vous faire dans vvotre compte ?\n");
      System.out.printf("[0] quitter\n");
      System.out.printf("[1] déposer\n");
      System.out.printf("[2] retirer\n");
      System.out.printf("[3] afficher le solde\n");

      int choix = scanner.nextInt();

      switch (choix) {
        case 1:
          System.out.print("Combien d'argent voulez vous déposer ? : ");
          double choix2 = scanner.nextDouble();
          german.deposer(choix2);
          break;
        case 2:
          System.out.print("Combien d'argent voulezvous retirer ? : ");
          choix2 = scanner.nextDouble();
          german.retirer(choix2);
          break;
        case 3:
          german.afficherSolde();
          break;
        default:
          break;
      }

      if (choix == 0) {
        german.afficherSolde();
        break;
      }
    }
    scanner.close();
  }
}
