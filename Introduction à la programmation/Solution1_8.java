import java.util.Scanner;

public class Solution1_8 {
    /*
     * 0 1 2
     * 3 4 5
     * 6 7 8
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char curPlayer = 'y';
        int nbTours = 0;
        char[][] grille = {
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' }
        };

        while (!checkIfCharWon(curPlayer, grille) && nbTours < 9) {
            afficherGrille(grille);

            if (curPlayer == 'x') {
                curPlayer = 'o';
            } else {
                curPlayer = 'x';
            }
            System.out.println("C'est au tour de : " + curPlayer);
            System.out.print("Choisissez une case : ");
            int choix = scan.nextInt();
            scan.nextLine();

            grille[choix / 3][choix % 3] = curPlayer;

            nbTours++;
        }
        afficherGrille(grille);
        if (checkIfCharWon(curPlayer, grille)) {
            System.out.println("Le gagnant est  : " + curPlayer);

        } else {
            System.out.println("Draw");
        }

    }

    public static void afficherGrille(char[][] grille) {
        System.out.println();
        for (int i = 0; i < grille.length; i++) {
            for (int j = 0; j < grille.length; j++) {
                System.out.print(" " + grille[i][j]);
                if (j % 3 != 2) {
                    System.out.print(" |");
                } else {
                    System.out.print("\n");
                }
            }
            if (i % 3 != 2) {
                System.out.println("-----------");
            }
        }
        System.out.println();
    }

    public static boolean checkIfCharWon(char joueur, char[][] grille) {
        int somme;
        for (int i = 0; i < grille.length; i++) {
            somme = 0;
            for (int j = 0; j < grille.length; j++) {
                if (grille[i][j] == joueur) {
                    somme++;
                }
            }
            if (somme == 3) {
                return true;
            }
        }
        for (int i = 0; i < grille.length; i++) {
            somme = 0;
            for (int j = 0; j < grille.length; j++) {
                if (grille[j][i] == joueur) {
                    somme++;
                }
            }
            if (somme == 3) {
                return true;
            }
        }

        if (grille[0][0] == joueur && grille[1][1] == joueur && grille[2][2] == joueur) {
            return true;
        }

        if (grille[2][0] == joueur && grille[1][1] == joueur && grille[0][2] == joueur) {
            return true;
        }
        return false;
    }
}