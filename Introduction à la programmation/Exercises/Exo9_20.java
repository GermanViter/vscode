public class Exo9_20 {
    public static void main(String[] args) {
        int mot = 0;
        String[][] motMat = new String[2][3];

        for (int i = 0; i < motMat.length; i++) {
            for (int j = 0; j < motMat[i].length; j++) {
                System.out.print(args[mot] + " ");
                mot++;
            }
            System.out.println();
        }
    }
}