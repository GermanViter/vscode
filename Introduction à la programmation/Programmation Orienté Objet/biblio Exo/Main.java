import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bibliotheque biblio = new Bibliotheque("Bibliothèque du cégep Marie-Victorin");

        biblio.ajouterLivre(new Livre("Candide", "Voltaire", 1759));
        biblio.ajouterLivre(new Livre("Harry Potter à l'école des sorciers", "J.K Rowling", 1997));
        biblio.ajouterLivre(new Livre("Harry Potter et la chambre des secrets", "J.K Rowling", 1998));
        biblio.afficherLivres();

        while (true) {
            System.out.println("=== Vous pouvez emprunter ou retourner des livres ===");
            System.out.printf("""
                    [1] emprunter
                    [2] retourner
                    [3] quitter
                    """);
            
            int choix = scan.nextInt();
            scan.nextLine();
            
            if (choix == 3) {
                break;
            }

            switch (choix) {
                case 1:
                    System.out.print("Quel livre voulez vous emprunter ? : ");
                    String titre = scan.nextLine();
                    Livre l = biblio.rechercher(titre);
                    
                    if (l != null) {
                       l.emprunter();
                    } else {
                        System.out.println("Livre introuvable");
                    }
                    break;
                case 2:
                    System.out.print("Quel livre voulez-vous remettre ? : ");
                    titre = scan.nextLine();
                    l = biblio.rechercher(titre);

                    if (l != null) {
                        l.remetre();
                    } else {
                        System.out.println("Livre introuvable");
                    }
                    break;
                default:
                    break;
            }
        }
    }
}