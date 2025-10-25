public class Exo_10 {
        public static void afficherTableau(int nbElement) {
        int[] tab = new int[nbElement];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 101);
        }
        int max = 0;
        int min = 101;

        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            if (i != tab.length - 1) {
                System.out.print(tab[i] + ",");
            } else {
                System.out.print(tab[i]);
            }
            if (tab[i] > max) {
                max = tab[i];
            }
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        System.out.print("]\n");
        System.out.printf("Le maximum est : %d\n", max);
        System.out.printf("Le minimum est : %d\n", min);

    }
    public static void main(String[] args) {
        afficherTableau(5);
    }
}
