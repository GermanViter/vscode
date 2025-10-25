public class Exo_18 {
    public static int[] fusionTab(int[] tab1, int[] tab2) {
        int[] tab3 = new int[tab1.length + tab2.length];
        
        for (int i = 0; i < tab1.length; i++) {
            tab3[i] = tab1[i];
        }
        for (int i = 0; i < tab1.length; i++) {
            tab3[i + tab1.length] = tab2[i];
        }
        return tab3;
    }
    public static void afficherTableaux(int[] tab3) {
        System.out.print("[");
        for (int i = 0; i < tab3.length; i++) {
            if (i < tab3.length - 1) {
                System.out.print(tab3[i] + ", ");
            } else {
                System.out.print(tab3[i]);
            }
        }
        System.out.print("]\n");
    }
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3};
        int[] tab2 = {4, 5, 6};
        int[] tab3;

        tab3 = fusionTab(tab1, tab2);
        afficherTableaux(tab3);

    }
}
