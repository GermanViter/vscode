public class ExoDoWhile_3 {
    public static void main(String[] args) {
        int somme = 0;

        do {
            somme += 2;
            System.out.printf("Somme : %d\n", somme);
        } while (somme < 10);
    }
}
