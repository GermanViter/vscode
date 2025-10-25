public class Exo9_12 {
    public static void main(String[] args) {
        int[] nombres = {10, 20, 30};

        int i = 0;
        do {
            System.out.printf("Élément %d : %d\n", i, nombres[i]);
            i++;
        } while (i < nombres.length);
    }
}
