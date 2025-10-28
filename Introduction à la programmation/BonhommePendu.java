import java.util.Random;
import java.util.Scanner;

public class BonhommePendu {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int essais = 0;

        int longueur = rand.nextInt(15) + 1;
        String mot = générerMotRandom(longueur);

        char[] espaceDecriture = new char[longueur];
        for (int i = 0; i < longueur; i++) {
            espaceDecriture[i] = '_';
        }

        System.out.printf("""

                        === Binvenue au bonhomme pendu ===
                        === Le but est de deviner une chaine de charactère aléatoire en lettres minuscules qui a une longueur entre 1 et 25 ===
                        """);
        afficherLigne(longueur, espaceDecriture);

        boolean contientDesEspacesVides = true;
        while (essais < 5 && contientDesEspacesVides) {
            contientDesEspacesVides = false;

            for (int i = 0; i < longueur; i++) {
                if (espaceDecriture[i] == '_') {
                    contientDesEspacesVides = true;
                    break;
                }
            }
            if (!contientDesEspacesVides) {
                break;
            }

            System.out.print("Écrivez votre lettre : ");
            String entree = scan.next();

            if (entree.length() != 1) {
                System.out.println("Veuillez entrer UNE seule lettre !");
                continue;
            }

            char lettre = entree.charAt(0);
            if (!alphabet.contains(String.valueOf(lettre))) {
                System.out.println("SVP entrez une lettre de l'alphabet en minuscule");
                continue;
            }
                essais++;

                for (int i = 0; i < longueur; i++) {
                    if (mot.charAt(i) == lettre) {
                        espaceDecriture[i] = lettre;
                    }
                }
                afficherLigne(longueur, espaceDecriture);
        }

        if (!contientDesEspacesVides && essais <= 5) {
            System.out.println("=== Bravo tu as deviné la chaine de charactères!!! ===");
            System.out.print("Nombre d'éssais : " + essais + "\n");
        } else if (contientDesEspacesVides && essais >= 5) {
            System.out.println("=== Vous n'avez pas réussis à deviner la chaine de charactères ===");
        }
    }

    public static String générerMotRandom(int longueur) {
        Random rand = new Random();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] tabMot = new char[longueur];

        for (int i = 0; i < tabMot.length; i++) {
            tabMot[i] = alphabet.charAt(rand.nextInt(alphabet.length()));
        }

        String motGen = new String(tabMot);
        return motGen;
    }

    public static void afficherLigne(int longueur, char[] espaceDecriture) {
        System.out.print("[");
        for (int i = 0; i < longueur - 1; i++) {
            System.out.print(espaceDecriture[i] + " ");
        }
        System.out.print(espaceDecriture[espaceDecriture.length - 1] + "]\n");
    }
}