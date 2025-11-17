import java.util.Scanner;

public class Exo12_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        while (true) {
            System.out.print("Choisiez [1]: Dire Bonjour, [2]: Dire au revoir, [3]: Quitter :");
            int choix = scan.nextInt();
            
            switch (choix) {
                case 1:
                    System.out.println("Bonjour");
                    continue;
                case 2:
                    System.out.println("Au revoir");
                    continue;
                case 3:
                    System.out.println("Fin du programme");
                    break;
                default:
                    break;
            }
            break;
        }
    }
}
