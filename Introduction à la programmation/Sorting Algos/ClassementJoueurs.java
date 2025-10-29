import java.util.Random;

public class ClassementJoueurs {
    public static void main(String[] args) {
        Random rand = new Random();

        Joueur[] joueurs = new Joueur[] {
                new Joueur("Maxime", rand.nextInt(100)),
                new Joueur("Léa", rand.nextInt(100)),
                new Joueur("Momo", rand.nextInt(100)),
                new Joueur("Dali", rand.nextInt(100)),
                new Joueur("Eric", rand.nextInt(100)),
        };

        System.out.println("=== classement sans le tri ===");
        for (Joueur j : joueurs) {
            j.afficher();
        }
        System.out.println();
        quickSort(joueurs, 0, joueurs.length - 1);

        System.out.println("=== classement avec le tri ===");
        for (Joueur j : joueurs) {
            j.afficher();
        }

    }

    private static void quickSort(Joueur[] arr, int debut, int fin) {
        if (debut < fin) {
            int pivotIndex = partition(arr, debut, fin);
            quickSort(arr, debut, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, fin);
        }
    }

    private static int partition(Joueur[] arr, int debut, int fin) {
        int pivot = arr[fin].score;
        int i = (debut - 1);

        for (int j = debut; j < fin; j++) {
            if (arr[j].score > pivot) { // tri décroissant
                i++;
                Joueur temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Joueur temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;

        return i + 1;
    }
}

class Joueur {
    String nom;
    int score;

    public Joueur(String nom, int score) {
        this.nom = nom;
        this.score = score;
    }

    public void afficher() {
        System.out.println(nom + " → " + score + " points");
    }
}
