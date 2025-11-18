import java.util.Random;

public class BogoSort {
    public static void main(String[] args) {
        int[] tab = new int[7];
        Functions.remplirTableau(tab);
        System.out.print("Tableau de base : ");
        Functions.afficherTableaux(tab);
        bogoSort(tab);
        System.out.print("Tableau trie : ");
        Functions.afficherTableaux(tab);
    }

    public static int[] bogoSort(int[] tab) {
        if (isSorted(tab)) {
            return tab;
        }

        Random rand = new Random();
        for (int i = tab.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Functions.swap(tab, i, j);
        }
        return bogoSort(tab);
    }

    public static boolean isSorted(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i + 1] < tab[i]) {
                return false;
            }
        }
        return true;
    }
}
