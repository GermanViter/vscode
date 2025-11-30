public class ExoSudoku {
    public static void main(String[] args) {
        // Grille Sudoku valide
        int[][] grilleSudokuValide = {
                { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
        };

        // Grille Sudoku invalide
        int[][] grilleSudokuInvalide = {
                { 5, 3, 4, 6, 7, 8, 5, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 6, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
        };

        System.out.println(estUnSudokuValide(grilleSudokuValide) ? "1 : valide" : "1 : invalide");
        System.out.println(estUnSudokuValide(grilleSudokuInvalide) ? "2 : valide" : "2 : invalide");
    }

    public static boolean estUnSudokuValide(int[][] tableau) {
        for (int i = 0; i < tableau.length; i++) {

            int[] prisLn = new int[10];
            int[] prisCol = new int[10];
            //int ligne = tableau[i];

            for (int j = 0; j < tableau[i].length; j++) {
                int valLn = tableau[i][j];
                int valCol = tableau[j][i];

                if (valLn < 0 || valLn > 9) {
                    return false;
                }

                prisLn[valLn]++;
                prisCol[valCol]++;
            }

            for (int j = 1; j < prisCol.length; j++) {
                if (prisLn[j] != 1 || prisCol[j] != 1) {
                    return false;
                }
            }
        }

        for (int debutLn = 0; debutLn < tableau.length / 3; debutLn++) {
            for (int debutCol = 0; debutCol < tableau[0].length / 3; debutCol++) {

                int[] prisBoite = new int[10];

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int val = tableau[debutLn * 3 + i][debutCol * 3 + j];
                        prisBoite[val]++;
                    }
                }

                for (int i = 1; i <= 9; i++) {
                    if (prisBoite[i] != 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}