import java.util.Scanner;

public class Ex12_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] tab = new int[5];
        //int espaceLibre = 5;
        int compteurDAjout = 0;

        while (true && compteurDAjout < 5) {
            System.out.print("Choisicez une opotion ([1]: Ajouter un nombre au tableau, [2]: Afficher le contenu du tableau, [3]: Quitter) : ");
            int choix = scan.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Quel nombre voulez-vous ajouter? : ");
                    int nombre = scan.nextInt();
                    tab[compteurDAjout] = nombre;
                    compteurDAjout++;
                    continue;
                case 2:
                    afficherTab(tab);
                continue;
                case 3:
                System.out.println("Fin du programme");
                break;
                default:
                System.out.println("Opération non recnnue");
                continue;
            }
            break;
        }
        afficherTab(tab);
    }
    
    public static void afficherTab(int[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[tab.length - 1] + "]");
    }
}
