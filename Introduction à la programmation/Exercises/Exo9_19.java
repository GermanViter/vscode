public class Exo9_19 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };

        int[][] resultat = new int[2][2];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                resultat[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int i = 0; i < resultat.length; i++) {
            for (int j = 0; j < resultat[i].length; j++) {
                System.out.printf("%2d ", resultat[i][j]);
            }
            System.out.println();
        }
    }
}
