import java.util.Scanner;

public class Exo12_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.print("Choisicez l'opération ([1]: adition, [2]: soustraction, [3]: Multiplication, [4]: Division entiere, [5]: quitter) : ");
            int operation = scan.nextInt();

            if (operation == 5) {
                break;
            }

            System.out.print("Choisicez le premier nombre : ");
            int nbr1 = scan.nextInt();
            System.out.print("Choisicez le deuxieme nombre : ");
            int nbr2 = scan.nextInt();

            switch (operation) {
                case 1:
                    System.out.printf("\n%d + %d = %d\n", nbr1, nbr2, (nbr1 + nbr2));
                    continue;
                case 2:
                    System.out.printf("\n%d - %d = %d\n", nbr1, nbr2, (nbr1 - nbr2));
                    continue;
                case 3:
                    System.out.printf("\n%d x %d = %d\n", nbr1, nbr2, (nbr1 * nbr2));
                    continue;
                case 4:
                    if (nbr2 == 0) {
                        System.out.println("\nImpossible de diviser par 0!!!\n");
                    } else {
                        System.out.printf("\n%d / %d = %d\n", nbr1, nbr2, (nbr1 / nbr2));
                    }
                    continue;
                case 5:
                    System.out.println("\nFin du programme\n");
                    break;
                default:
                    System.out.println("\nOpération non reconnue\n");
                    continue;
            }
            break;
        }
    }
}
