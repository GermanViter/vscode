public class Exo_10 {
    public static void main(String[] args) {
        int[] tab1 = makeTab(5);
        int[] tab2 = makeTab(5);
        afficherTab(tab1);
        afficherTab(tab2);
        System.out.println(sontIdentique(tab1, tab2) ? "Indentique" : "Différent");
    }

    public static int[] makeTab(int n) {
        int[] tab = new int[n];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100) + 1;
        }

        return tab;
    }

    public static void afficherTab(int[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[tab.length - 1] + "]");
    }

    public static void findMax(int[] tab) {
        int max = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        System.out.println("Le maximum est : " + max);
    }

    public static void findmin(int[] tab) {
        int min = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }

        System.out.println("Le minimum est : " + min);
    }

    public static boolean sontIdentique(int[] tab1, int[] tab2) {
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[i]) {
                return false;
            }
        }

        return true;
    }
}
