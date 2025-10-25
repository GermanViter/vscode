public class Exo9_5 {
    public static void main(String[] args) {
        int[][] matrice = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
        System.out.println();
        }
    }
}
