public class Exo_12 {
    public static boolean idTableaux(int nbElement) {
        int[] tab1 = new int[nbElement];
        int[] tab2 = new int[nbElement];

        int i = 0;
        int j = 0;

        while (i < tab1.length && j < tab2.length) {
            tab1[i] = (int) (Math.random() * 101);
            tab2[j] = (int) (Math.random() * 101);

            if (tab1[i] != tab2[j]) {
                return false;
            }
            
            i++;
            j++;
 
        }
        
        System.out.print("[");
        for (int k = 0; k < tab1.length; k++) {
            if (k != tab1.length - 1) {
                System.out.print(tab1[k] + ",");
            } else {
                System.out.print(tab1[k]);
            }
        }
        System.out.print("]\n");
        
        System.out.print("[");
        for (int l = 0; l < tab2.length; l++) {
            if (l != tab2.length - 1) {
                System.out.print(tab1[l] + ",");
            } else {
                System.out.print(tab1[l]);
            }
        }
        System.out.print("]\n");
        return true;
    }
    public static void afficherTableaux(int[] tab1, int[] tab2) {
        System.out.print("[");
        for (int i = 0; i < tab1.length - 1; i++) {
            System.out.print(tab1[i] + ", ");
        }
        System.out.print(tab1[tab1.length - 1] + "]");
    }
    public static void main(String[] args) {
        idTableaux(5);
        //System.out.println(afficherTableaux(5) ? "Identique" : "Différent");
    }
}   