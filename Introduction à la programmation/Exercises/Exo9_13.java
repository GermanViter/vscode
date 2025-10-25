public class Exo9_13 {
    public static void main(String[] args) {
        String mot = "Java";

        int i = 0;
        do {
            System.out.printf("Lettre %d : %c\n", i, mot.charAt(i));
            i++;
        } while (i < mot.length());
    }
}
