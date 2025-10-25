public class BouclesImbriques_2 {
    public static void main(String[] args) {
        int[][] matrice = {
            {10, 20},
            {30, 40},
            {50, 60}
        };

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
